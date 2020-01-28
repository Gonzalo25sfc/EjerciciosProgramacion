package ejercicios;

import java.util.Scanner;

class ej_cond5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int base;
		System.out.println("Dame la base del rectangulo");
		base = teclado.nextInt();
		int altura;
		System.out.println("Dame la altura del rectangulo");
		altura = teclado.nextInt();
		int area;
		area= base*altura;
		System.out.println("El area de su rectangulo es --> "+area);
	}

}
