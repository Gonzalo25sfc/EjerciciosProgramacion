package T5;

import java.util.Scanner;

class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double compra;
		double base;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido a los supermecados Mercadower");
		
		System.out.println("Introduzca el importe total de su compra");
		compra = teclado.nextDouble();
		
		if(compra>=300) {
			System.out.println("Enhorabuena ha conseguido una promocion del 20% del total de su compra");
			base = 60 * compra;
			base = base/100;
			System.out.println("Su total sin descuento es: " + compra);
			System.out.println("Su total con descuento es: " + base);
		}
		else {
			System.out.println("No se aplicara ninguna promocion a su compra");
		}
	}

}
