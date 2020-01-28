package ejercicios;

import java.util.Scanner;

class ej_cond2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double euros;
		System.out.println("Introduzca la cantidad de euros deseada:");
		euros= teclado.nextFloat();
		double pesetas=166.38;
		double resultado;
		resultado= pesetas/euros;
		System.out.println("Su conversion de euros a pesetas es --> "+ resultado);
		
	}

}
