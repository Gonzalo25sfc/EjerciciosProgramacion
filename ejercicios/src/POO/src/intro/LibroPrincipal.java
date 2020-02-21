package intro;

public class LibroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro miLibro = new Libro();
		Libro libroVecino = new Libro();
		
		miLibro.autor="Machado";
		miLibro.numero_paginas=160;
		miLibro.precio=30;
		miLibro.titulo="El machado";
		
		System.out.println("Mi libro tiene los siguientes atributos; ");
		System.out.println("Autor --> " + miLibro.autor);
		System.out.println("Numero_paginas --> " + miLibro.numero_paginas);
		System.out.println("Precio --> " + miLibro.precio);
		System.out.println("Titulo --> " + miLibro.titulo);
		
		System.out.println("---------------------------------------------");
		
		libroVecino.autor="Pepe";
		libroVecino.numero_paginas=232;
		libroVecino.precio=82;
		libroVecino.titulo="Aventuras de pepe";
		
		System.out.println("El libro del vecino tiene los siguientes atributos; ");
		System.out.println("Autor --> " + libroVecino.autor);
		System.out.println("Numero_paginas --> " + libroVecino.numero_paginas);
		System.out.println("Precio --> " + libroVecino.precio);
		System.out.println("Titulo --> " + libroVecino.titulo);
	}

}
