package Videoclub;

public class Pelicula implements Comparable <Pelicula> {
	
	private static int idNext=1;
	private String titulo;
	private String Genero;
	private String Director;
	private int año;
	private int id;
	
	
	public Pelicula(String titulo, String Genero, String Director, int año) {
		
		this.titulo=titulo;
		this.Genero=Genero;
		this.Director=Director;
		this.año=año;
		id=idNext;
		idNext++;
	}
	
	
	static void imprimeArray(Pelicula[] p) {

		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || Año --> " + p[i].año );
			
		}
	}


	@Override
	public int compareTo(Pelicula o) {
		if(año<o.año) {
		      return -1;
		    }
		    
		    if(año>o.año) {
		      return 1;
		    }
		return 0;
	}
	
	static void imprimeTerror(Pelicula[] p) {

		for(int i=0; i<p.length; i++) {
			if(p[i].Genero.equalsIgnoreCase ("Terror")) {
				System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || Año --> " + p[i].año );
			}			
		}
	}
		
		static void imprimeAccion(Pelicula[] p) {

			for(int i=0; i<p.length; i++) {
				if(p[i].Genero.equalsIgnoreCase ("Accion")) {
					System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || Año --> " + p[i].año );
				}			
		
	}
}
		
		static void imprimeInfantil(Pelicula[] p) {

			for(int i=0; i<p.length; i++) {
				if(p[i].Genero.equalsIgnoreCase ("Infantil")) {
					System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || Año --> " + p[i].año );
				}			
		
	}
}
		
		static void imprimeRomantica(Pelicula[] p) {

			for(int i=0; i<p.length; i++) {
				if(p[i].Genero.equalsIgnoreCase ("Romantica")) {
					System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || Año --> " + p[i].año );
				}			
		
		}
	}	
}
