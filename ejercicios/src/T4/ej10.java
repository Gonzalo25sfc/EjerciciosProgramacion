package T4;

import java.util.Scanner;

class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner (System.in);
	     float numero ;
	       int parte_entera;
	       double parte_decimal;   
	       System.out.println("introduzca un numero con decimales");
	       numero = teclado.nextFloat();
	       parte_entera = (int) (numero/1);
	       parte_decimal = numero-parte_entera;
	       
	       
	       System.out.println( " La parte entera   "+ parte_entera );
	       System.out.println( " La parte decimal  "+ parte_decimal );
	}

}
