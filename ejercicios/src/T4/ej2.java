package T4;

import java.util.Scanner;

class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int suma=0;
		int anterior=0;
		Scanner teclado = new Scanner(System.in);
		
		do {
		System.out.println("Introduzca un numero");
		n = teclado.nextInt();
		n=anterior;
		suma=suma+n;
		} while (n==anterior);
			System.out.println("Ha introducido un numero mayor al que introducio previamente");
			System.out.println("La suma de todos los introducidos es = " + suma);
	}

}
