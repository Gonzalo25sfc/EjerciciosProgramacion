package ejercicios;

import java.util.Scanner;

class ej_cond4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int n1;
		System.out.println("Dame un numerito");
		n1 = teclado.nextInt();
		int n2;
		System.out.println("Dame otro numerito");
		n2= teclado.nextInt();
		
		int suma;
		suma=n1+n2;
		int resta;
		resta=n1-n2;
		int multi;
		multi=n1*n2;
		int divi;
		divi=n1/n2;
		
		System.out.println("Suma --> " +suma);
		System.out.println("Resta --> " +resta);
		System.out.println("Multiplicacion --> " +multi);
		System.out.println("Division --> " +divi);

	}

}
