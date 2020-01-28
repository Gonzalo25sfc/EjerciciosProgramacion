package ejercicios;

import java.util.Scanner;

class homer_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduzca un numero par");
			n = teclado.nextInt();
			
			
		}
		while (n%2 == 0);
	System.out.println("Bucle parado");
	}

}
