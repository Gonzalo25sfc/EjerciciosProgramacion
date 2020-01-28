package ejercicios;

import java.util.Scanner;

class ej_cond10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tipoiva;
		int general=(int) 0.21;
		int reducido=(int) 0.10;
		int superreducido=(int) 0.4;
		int precio=0;
		int bi;
		String codigop;
		
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		
		System.out.println("Introduzca la base imponible: ");
		bi = teclado.nextInt();
		
		
		System.out.println("Introduzca el tipo de IVA: ");
		tipoiva = teclado2.nextLine();
		
		if(tipoiva.equals("general")) {
			general=general*bi;
			precio=bi+general;
			
		}
		if(tipoiva.equals("reducido")) {
			reducido=reducido*bi;
			precio=bi+reducido;
		}
		if(tipoiva.equals("superreducido")) {
			superreducido=superreducido*bi;
			precio=bi+superreducido;
		}
		
		
		
		
		System.out.println("Introduzca el codigo promocional: ");
		codigop = teclado3.nextLine();
		
		if(codigop.equals("nopro")) {
			System.out.println("No se aplicara ninguna promoción");
		}
		if(codigop.equals("mitad")) {
			System.out.println("El precio se reducira a la mitad");
			precio=(int) (precio-0.50);
			
		}
		if(codigop.equals("meno5")) {
			System.out.println("Se descontaran 5 euros");
			precio=precio-5;
		}
		if(codigop.equals("5porc")) {
			System.out.println("Se descontara el 5 por ciento");
			precio=(int) (precio-0.5);
		}
		
		System.out.println("Base imponible ----------> "+bi);
		System.out.println("IVA " +tipoiva);
		System.out.println("Precio con IVA "+precio);
		System.out.println("Cod. Promo. (mitad): ");
		System.out.println("TOTAL ");
	}

}
