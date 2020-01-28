package T4;

import java.util.Scanner;

class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una hora sin minutos en el siguiente formato: 13, 21, 5");
		hora = teclado.nextInt();
		
		if(hora>=6 && hora <=12) {
			System.out.println("Buenos dias");
		}
		
		if(hora>=13 && hora <=20) {
			System.out.println("Buenos tardes");
		}
		
		if(hora>=21 && hora <=5) {
			System.out.println("Buenos noches");
		}
		
	}

}
