package controler;

import java.awt.Dimension;

import model.utilidades.Hitbox;
import model.utilidades.Posicion;

/**
 * Coleccion de <kbd>CONSTANES</kbd> de valores que afectan distintas dinamicas del juego.
 * Las mismas son utilisadas en diversas partes del c�digo.
 * 
 */
public class Constantes {
	// Ventana
	public static final int ANCHOVENTANA = 68; // Pixeles
	public static final int ALTURAVENTANA = 112; // Pixeles
	public static final int CHANCECERRADA = 20; // Porcentaje
	
	// Seccion
	public static final int CANTIDADFILAS = 3;
	public static final int CANTIDADCOLUMNAS = 5;
	public static final int CANTIDADVENTANAS = CANTIDADFILAS * CANTIDADCOLUMNAS;
	public static final int CANTIDADSECCIONES = 3;
	public static final int ANCHOSECCION = ANCHOVENTANA * CANTIDADCOLUMNAS; // Pixeles
	public static final int ALTURASECCION = ALTURAVENTANA * CANTIDADFILAS; // Pixeles
	public static final int OFFSETYSECCION = 272; // Techo
	
	// Edificio
	public static final int ALTURAEDIFICIO = 1280;
	
	// Felix
	public static final int VIDAS = 3;
	public static final int FELIXOFFSETX = 0; // Pixeles
	public static final int FELIXOFFSETY = 28; // Pixeles
	public static final int FELIXOFFSETYPUERTA = 42; // Pixeles
	public static final int TIEMPOINMUNE = 480; // frames
	public static final Hitbox FELIXHITBOX = new Hitbox(38, 72); // Pixeles
	
	public static final Posicion FELIXSTART = new Posicion(ANCHOVENTANA*2 + FELIXOFFSETX, ALTURAVENTANA * 2 + FELIXOFFSETYPUERTA);
	public static final Posicion FELIXSTART2 = new Posicion(ANCHOVENTANA*2 + FELIXOFFSETX, ALTURAVENTANA * 2 + FELIXOFFSETY);
	public static final Posicion FELIXOFFSET = new Posicion(FELIXOFFSETX, FELIXOFFSETY);
	public static final Posicion FELIXOFFSETPUERTA = new Posicion(FELIXOFFSETX, FELIXOFFSETYPUERTA);
	
	// Ralph
	public static final int RALPHANCHO = 134;
	public static final int RALPHALTO = 144;
	public static final int CANTLADRILLOS = 40;
	public static final Posicion RALPHSTART = new Posicion((int) (ANCHOVENTANA*2.5) - (RALPHANCHO/2) , -RALPHALTO);
	public static final long TIEMPOMOVERRALPH = 5000;
	public static final int VELOCIDADRALPH = 1; // Pixeles por frame
	public static final int	CHANCEMOVER = 20; // Porcentaje
	public static final long TIEMPOGOLPEANDO = 3000; // Milisegundos
		

	// Entidades
	public static final int CANTIDADPROYECTILES = 15;
	public static final Hitbox LADRILLOHITBOX = new Hitbox(24, 16);
	public static final int LADRILLOFRAMES = 15;
	public static final long CHANCEROMPER = 2;
	public static final Hitbox PAJAROHITBOX = new Hitbox(42, 38);
	public static final int PAJAROFRAMES = 20;
	public static final int PAJAROOFFSET = 37; //Pixeles

	
	// Pastel
	public static final int PASTELOFFSETX = 13; // Pixeles
	public static final int PASTELOFFSETY = 38; // Pixeles
	public static final int CHANCEPASTEL = 40; // Porcentaje
	public static final int DELAYPASTEL = 480; // frames

	
	// Frame
	public static final int HEADER = 30;
	public static final int ANCHOFRAME = 740; // Pixeles
	public static final int ALTURAFRAME = 448 + Constantes.HEADER; // Pixeles
	public static final Dimension TAMANOFRAME = new Dimension(Constantes.ANCHOFRAME, Constantes.ALTURAFRAME);
	public static final int OFFSETXVISUAL = 200;
	public static final int OFFSETYVISUAL = Constantes.ALTURAVENTANA + Constantes.HEADER;
	
	// Otras
	public static final String PATHIMAGES = "assets/images/";
	public static final String PATHPUNTAJES = "highscores.dat";
	public static final long NANOSEGUNDOSPORFRAME = 16666666;
}