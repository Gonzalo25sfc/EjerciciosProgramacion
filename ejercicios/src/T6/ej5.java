package T6;

import java.util.Scanner;

class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intentos=4;
		int combinacion=1234;
		int combint;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca la combinación de la caja fuerte");
			combint = teclado.nextInt();
			
			if(combint==combinacion) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				break;
			}
			else {
				System.out.println("Lo siento, esa no es la combinación");
			}
			intentos--;
		}
		while(intentos>0);
		
		
	
	}
}
