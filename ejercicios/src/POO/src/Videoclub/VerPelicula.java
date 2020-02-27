package Videoclub;

import java.util.Arrays;

import javax.swing.JOptionPane;

import OPP1.Cancion;

public class VerPelicula {

	public static void main(String[] args) {
		
		Pelicula p[] = new Pelicula[10];
		
		p[0]= new Pelicula ("Joker", "Terror", "Samuel L Jackson", 2019);
		p[1]= new Pelicula ("La purga", "Terror", "Nicolas JK", 2016);
		p[2]= new Pelicula ("Los vengadores", "Accion", "Franciso PJ", 2018);
		p[3]= new Pelicula ("Titanic", "Romantica", "Ivan CK", 2010);
		p[4]= new Pelicula ("Bambi", "Infantil", "Juan J", 2005);
		p[5]= new Pelicula ("La bella y la bestia", "Infantil", " Santigo P", 2006);
		p[6]= new Pelicula ("Los 101 dalmatas", "Infantil", "Jesus V", 2000);
		p[7]= new Pelicula ("MONSTRUOS SA", "Infantil", "Hugo H", 2008);
		p[8]= new Pelicula ("IT", "Terror", "Jose Maria J", 2014);
		p[9]= new Pelicula ("IT 2", "Terror", "Ramon S", 2017);

		String opcion=JOptionPane.showInputDialog("0. Salir del programa, 1. Mostrar sin ordenar por año, 2. Ordenador por año, 3. Filtrar por Terror, 4. Filtrar por Accion, 5. Filtrar por Infantil,. 6. Filtrar por Romantica");
		
		switch (opcion) {
		
		case "0":
			System.out.println("SALIENDO DEL VIDEOCLUB");
			System.exit(0);
			
		case "1":
			
			System.out.println("Mostrando datos sin ordenar por año");
			System.out.println("----------------------------");
			p[0].imprimeArray(p);			
			
			break;

		case "2":
		
			System.out.println("Mostrando peliculas ordenada de menor a mayor por año");
			System.out.println("----------------------------------------------------------------------------------------------------");
			
			Arrays.sort(p);
			p[0].imprimeArray(p);
			
			break;
			
		case "3":
			System.out.println("Mostrando peliculas por genero Terror");
			System.out.println("----------------------------------------------------------------------------------------------------");
			p[0].imprimeTerror(p);
			break;
		
		
		case "4":
			System.out.println("Mostrando peliculas por genero Accion");
			System.out.println("----------------------------------------------------------------------------------------------------");
			p[0].imprimeAccion(p);
			break;
		
		
		case "5":
			System.out.println("Mostrando peliculas por genero Infantil");
			System.out.println("----------------------------------------------------------------------------------------------------");
			p[0].imprimeInfantil(p);
			break;
	
	
		case "6":
			System.out.println("Mostrando peliculas por genero Romantica");
			System.out.println("----------------------------------------------------------------------------------------------------");
			p[0].imprimeRomantica(p);
			break;
		}
	}
}