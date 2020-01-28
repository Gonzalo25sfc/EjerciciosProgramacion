package T4;

import java.util.Scanner;

class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero del 1 al 7");
		dia = teclado.nextInt();
		
		if(dia==1) {
			System.out.println("Hoy es Lunes");
		}
		
		if(dia==2) {
			System.out.println("Hoy es Martes");
		}
		
		if(dia==3) {
			System.out.println("Hoy es Miercoles");
		}
		
		if(dia==4) {
			System.out.println("Hoy es Jueves");
		}
		
		if(dia==5) {
			System.out.println("Hoy es Viernes");
		}
		
		if(dia==6) {
			System.out.println("Hoy es Sabado");
		}
		
		if(dia==7) {
			System.out.println("Hoy es Domingo");
		}
		
	}

}
