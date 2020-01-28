package T6;

import java.util.Scanner;

class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		
		int alturaIntroducida;
		String relleno;
		
		 System.out.print("Por favor, introduzca la altura de la pirámide: ");
		    alturaIntroducida = teclado.nextInt();

		    System.out.print("Introduzca el carácter de relleno: ");
		     relleno = teclado2.nextLine();
		    
		    
		      for (int i= 1; i <= alturaIntroducida; i++) {
		    	  System.out.print("\n");
		        for( int blancos = 1; blancos<=alturaIntroducida-i; blancos++) {
		        	System.out.print(" ");
		        }

			
		      for (int x = 1;x <=(i*2)-1;x ++) {
		        System.out.print(relleno);
		      }
	    }

		     

		    
		    }
		  }
		
