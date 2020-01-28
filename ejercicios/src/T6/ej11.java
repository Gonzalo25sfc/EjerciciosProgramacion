package T6;

import java.util.Scanner;

class ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero positivo: ");
		n = teclado.nextInt();
		
		if (n > 0) {
			for (int i = n; i<=100; i++) {
				n = n+i;
				
			}
			System.out.println(n);
		}
	}

}
