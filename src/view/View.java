package view;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import controler.Constantes;

public class View extends JFrame{
	private static View instancia;
	Dimension tamaņoPantalla;
	Dimension tamaņoVentana;
	
	public JPanel mainPanel;
	public MainMenu mainMenu;
	public Config config;
	public Reglas reglas;
	public TopScores top5;
	
	public static View getView(){
		return instancia;
	}
	public static void iniciarView() {
		instancia = new View();
	}
	
	private View() {
		tamaņoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		tamaņoVentana = new Dimension(Constantes.ANCHOFRAME, Constantes.ALTURAFRAME);
		setTitle("Fix it Felix jr.");
		setLocationRelativeTo(null);
		setLocation((tamaņoPantalla.width/2) - (Constantes.ANCHOFRAME/2), 0);
		setResizable(false);
		getContentPane().setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
//		setFocusable(true);
//		requestFocusInWindow();
//		setFocusTraversalKeysEnabled(false);
		
		mainPanel = new JPanel(null);
		mainPanel.setBorder(null);
		mainPanel.setLocation(0,0);
		mainPanel.setPreferredSize(tamaņoVentana);
		getContentPane().add(mainPanel);
		pack();
		
		mainMenu = new MainMenu(tamaņoVentana);
		config = new Config(tamaņoVentana);
		reglas = new Reglas(tamaņoVentana);
		top5 = new TopScores(tamaņoVentana);
		
		mainPanel.add(mainMenu);
		mainPanel.add(config);
		mainPanel.add(reglas);
		mainPanel.add(top5);

		setVisible(true);
	}

	public Dimension getTamaņoVentana() {
		return tamaņoVentana;
	}
}