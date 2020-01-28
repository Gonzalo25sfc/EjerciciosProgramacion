package ejercicios;

import java.util.Scanner;

class ej_cond9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Bienvenido al conversor de Mb a KB y viceversa");
		System.out.println("Eliga 1 para Mb --> KB");
		System.out.println("Eliga 2 para KB --> MB");
		int opcion;
		System.out.println("¿Que opcion elige?");
		opcion = teclado.nextInt();
		
		switch(opcion) 
		{
			case 1:
				System.out.println("Convertir MB a KB");
				int mb;
				System.out.println("Introduzca MB");
				mb = teclado.nextInt();				
				int calculo;
				calculo=mb*1024;
				System.out.println("Su conversion de "+mb +" MB a Kb es igual a "+calculo + " KB");
				break;
				
			case 2:
				System.out.println("Convertir KB a MB");
				int kb;
				System.out.println("Introduzca KB");
				kb = teclado.nextInt();				
				int calculo2;
				calculo2=(int) (kb*0.001);
				System.out.println("Su conversion de "+kb +" KB a MB es igual a "+calculo2 +" MB");
				break;
				
			default:
				System.out.println("No ha escogido ninguna opcion, por favor vuelva a intentarlo");
		
		}
		
			
	}

}
