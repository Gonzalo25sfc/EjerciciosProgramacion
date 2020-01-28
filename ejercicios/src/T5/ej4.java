package T5;

import java.util.Scanner;

class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1;
		double nota2;
		double media;
		String recu;
		
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		
		System.out.println("Introduzca la nota del primer examen");
		nota1 = teclado.nextInt();
		
		System.out.println("Introduzca la nota del segundo examen");
		nota2 = teclado.nextInt();
		
		media= (nota1+nota2) / 2;
		
		if(media>=5) {
			System.out.println("Nota del primer examen: " + nota1);
			System.out.println("Nota del segundo examen: " + nota2);
			System.out.println("Tu nota de programación: " + media);
		}
		
		if(media<5) {
			System.out.println("Nota del primer examen: " + nota1);
			System.out.println("Nota del segundo examen: " + nota2);
			System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
			recu  = teclado2.next();
			
				if(recu.equalsIgnoreCase ("apto")) {
					System.out.println("Tu nota de programación: 5" );
				}
				
				if(recu.equalsIgnoreCase ("no apto")) {
					System.out.println("Tu nota de programación: " + media);
				}
				
		}
		
	}

}
