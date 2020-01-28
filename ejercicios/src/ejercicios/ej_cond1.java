package ejercicios;

import java.util.Scanner;

class ej_cond1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n1;											//Se declara una variable
		System.out.println("Hola, dame un numerito");
		n1 = teclado.nextInt();
		int n2;
		System.out.println("Dame otro numerito");
		n2 = teclado.nextInt();
		int resultado;
		resultado=n1*n2;
		System.out.println("El resultado de la multiplicacion es " + resultado);
	}

}
