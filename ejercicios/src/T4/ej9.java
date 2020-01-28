package T4;

import java.text.DecimalFormat;
import java.util.*;

class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double numero2 = 3.33333d;
		
		System.out.println("Introduzca un double");
		numero2 = teclado.nextDouble();
		
		DecimalFormat formato2 = new DecimalFormat("#.#");
		System.out.println(formato2.format(numero2)); 
		
	}

}
