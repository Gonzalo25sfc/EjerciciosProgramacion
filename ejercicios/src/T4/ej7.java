package T4;

import java.util.Scanner;

class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora;
		int minuto;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame la hora");
		hora = teclado.nextInt();
		
		System.out.println("Dame los minutos");
		minuto = teclado.nextInt();
		
		int segundosTranscurridos = (hora * 3600) + (minuto * 60);
	    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
	    
	    //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
	    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minuto, segundosHastaMedianoche);
	}

}
