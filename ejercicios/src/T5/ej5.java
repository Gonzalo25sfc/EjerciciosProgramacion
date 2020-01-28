package T5;

import java.util.Scanner;

class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia;
		int hora;
		int minutos;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el dia de la semana de Lunes a Viernes");
		dia = teclado.nextInt();
		
		System.out.println("Introduzca la hora");
		hora = teclado.nextInt();
		
		System.out.println("Introduzca los minutos");
		minutos = teclado.nextInt();
		
		 int minutosTotales = (4 * 24 * 60) + (15 * 60);
		 int minutosActuales = (dia * 24 * 60) + (hora * 60) + minutos;
		    
		    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
	}

}
