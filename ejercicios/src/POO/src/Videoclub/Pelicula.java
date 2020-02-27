package Videoclub;

public class Pelicula implements Comparable <Pelicula> {
	
	private static int idNext=1;
	private String titulo;
	private String Genero;
	private String Director;
	private int a�o;
	private int id;
	
	
	public Pelicula(String titulo, String Genero, String Director, int a�o) {
		
		this.titulo=titulo;
		this.Genero=Genero;
		this.Director=Director;
		this.a�o=a�o;
		id=idNext;
		idNext++;
	}
	
	
	static void imprimeArray(Pelicula[] p) {

		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || A�o --> " + p[i].a�o );
			
		}
	}


	@Override
	public int compareTo(Pelicula o) {
		if(a�o<o.a�o) {
		      return -1;
		    }
		    
		    if(a�o>o.a�o) {
		      return 1;
		    }
		return 0;
	}
	
	static void imprimeTerror(Pelicula[] p) {

		for(int i=0; i<p.length; i++) {
			if(p[i].Genero.equalsIgnoreCase ("Terror")) {
				System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || A�o --> " + p[i].a�o );
			}			
		}
	}
		
		static void imprimeAccion(Pelicula[] p) {

			for(int i=0; i<p.length; i++) {
				if(p[i].Genero.equalsIgnoreCase ("Accion")) {
					System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || A�o --> " + p[i].a�o );
				}			
		
	}
}
		
		static void imprimeInfantil(Pelicula[] p) {

			for(int i=0; i<p.length; i++) {
				if(p[i].Genero.equalsIgnoreCase ("Infantil")) {
					System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || A�o --> " + p[i].a�o );
				}			
		
	}
}
		
		static void imprimeRomantica(Pelicula[] p) {

			for(int i=0; i<p.length; i++) {
				if(p[i].Genero.equalsIgnoreCase ("Romantica")) {
					System.out.println(p[i].id + " Titulo --> " + p[i].titulo + " || Genero --> " + p[i].Genero + " || Director --> " + p[i].Director + " || A�o --> " + p[i].a�o );
				}			
		
		}
	}	
}
