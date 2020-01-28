package ejercicios;

import java.util.Scanner;

class ej_cond7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int importe;
		System.out.println("Introduzca el total del importe de la factura -->");
		importe = teclado.nextInt();
		System.out.println("Su importe sin IVA es --> "+importe);
		double iva;
		iva=importe*0.21;
		iva=iva+importe;
		System.out.println("Su importe con IVA es --> "+iva);
	}

}
