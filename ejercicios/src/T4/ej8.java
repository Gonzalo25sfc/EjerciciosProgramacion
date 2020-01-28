package T4;

import java.util.Scanner;

class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		n = teclado.nextInt();
		
		if(n%2 == 0) {
			System.out.println("El numero es par");
		}
		
		if(n%5 == 0) {
			System.out.println("El numero es divisible por 5");
		}
	}

}
