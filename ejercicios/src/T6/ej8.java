package T6;

import java.util.Scanner;

class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int ant = 0;
		int temp;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero para empezar");
		x = teclado.nextInt();
		
		while(true) {
			
			System.out.println(x);
			
			temp = x;
			
			x= x + ant;
			
			ant = temp;
			
			if(x > 500) {
				{break;}
			}
		}
	}

}
