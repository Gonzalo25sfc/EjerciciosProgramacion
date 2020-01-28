package ejercicios;

import java.util.Scanner;

class homer_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int suma=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero");
			n = teclado.nextInt();
			suma= suma+n;
			System.out.println("Su suma es " + suma);
		}
		while (n>0);
			
		}
	}


