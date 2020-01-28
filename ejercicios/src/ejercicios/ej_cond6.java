package ejercicios;

import java.util.Scanner;

class ej_cond6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		float n1;
		System.out.println("Introduzca un numero");
		n1 = teclado.nextFloat();
		float cubo=n1*n1*n1;
		System.out.println("El cubo de su numero es --> "+cubo);
	}

}
