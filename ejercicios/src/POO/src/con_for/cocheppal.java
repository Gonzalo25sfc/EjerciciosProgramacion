package con_for;

import java.util.Scanner;

import intro.coche;

public class cocheppal {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		//instanciar el objeto concreto de la clase Coche
				Coche miCoche1 = new Coche();
				Coche miCoche2 = new Coche();
				Coche miCoche3 = new Coche();
				Coche miCoche4 = new Coche();
				Coche miCoche5 = new Coche();
				
				int puerta=0;
				String color;
				for(int i=1; i<=5; i++) {
		
			
			puerta = teclado.nextInt();
			
			System.out.println();
			
			System.out.println("Dame el color del coche " + i);
			color = teclado.nextLine();
			
			if(i==1) {
			miCoche1.setPuertas(puerta);
			System.out.println(miCoche1.getPuertas());
				}
			
			if(i==2) {
				miCoche2.setPuertas(puerta);
				System.out.println(miCoche2.getPuertas());
					}
			
			if(i==3) {
				miCoche3.setPuertas(puerta);
				System.out.println(miCoche3.getPuertas());
					}
			
			if(i==4) {
				miCoche4.setPuertas(puerta);
				System.out.println(miCoche4.getPuertas());
					}
			
			if(i==5) {
				miCoche5.setPuertas(puerta);
				System.out.println(miCoche5.getPuertas());
					}
	}
	}

	private static Object miCoche(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
