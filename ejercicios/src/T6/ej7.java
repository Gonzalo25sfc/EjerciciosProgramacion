package T6;

import java.util.Scanner;

class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int n;
		int i;
		
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Introduce un número ");
		 n = teclado.nextInt();
		   
		    for (i=0; n>0; i++){
		      n = n/10;
		    }
		    System.out.println("El número tiene "+i+" cifras.");
	}

}
