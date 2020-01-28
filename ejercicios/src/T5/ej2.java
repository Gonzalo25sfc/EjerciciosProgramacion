package T5;

import java.util.Scanner;

class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
		String respuesta, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6, respuesta7, respuesta8, respuesta9;
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		Scanner teclado4 = new Scanner(System.in);
		Scanner teclado5 = new Scanner(System.in);
		Scanner teclado6 = new Scanner(System.in);
		Scanner teclado7 = new Scanner(System.in);
		Scanner teclado8 = new Scanner(System.in);
		Scanner teclado9 = new Scanner(System.in);
		Scanner teclado10 = new Scanner(System.in);
		
		System.out.println("Bienvenido al cuestionario, responda con V y F");
		
		System.out.println("1-¿Soy programador?");
		respuesta = teclado.next();
		if(respuesta.equalsIgnoreCase ("V")) {
			cont=cont+1;
		}
		
		System.out.println("2-¿Soy programador?");
		respuesta2 = teclado2.next();
		if(respuesta.equalsIgnoreCase ("V")) {
			cont=cont+1;
		}
		
		System.out.println("3-¿Soy programador?");
		respuesta3 = teclado3.next();
		if(respuesta.equalsIgnoreCase ("V")) {
			cont=cont+1;
		}
		
		System.out.println("4-¿Soy programador?");
		respuesta4 = teclado4.next();
		if(respuesta.equalsIgnoreCase ("V"))
		 {
			cont=cont+1;
		}
		
		System.out.println("5-¿Soy programador?");
		respuesta5 = teclado5.next();
		if(respuesta.equalsIgnoreCase ("V"))
		{
			cont=cont+1;
		}
		
		System.out.println("6-¿Soy programador?");
		respuesta6 = teclado6.next();
		if(respuesta.equalsIgnoreCase ("V"))
		 {
			cont=cont+1;
		}
		
		System.out.println("7-¿Soy programador?");
		respuesta7 = teclado7.next();
		if(respuesta.equalsIgnoreCase ("V"))
	    {
			cont=cont+1;
		}
		
		System.out.println("8-¿Soy programador?");
		respuesta8 = teclado8.next();
		if(respuesta.equalsIgnoreCase ("V"))
	    {
			cont=cont+1;
		}
		
		System.out.println("9-¿Soy programador?");
		respuesta9 = teclado9.next();
		if(respuesta.equalsIgnoreCase ("V"))
	   {
			cont=cont+1;
		}
		
		System.out.println("10-¿Soy programador?");
		String respuesta10 = teclado10.next();
		if(respuesta.equalsIgnoreCase ("V"))
	    {
			cont=cont+1;
		}
		
		System.out.println("Su nota del cuestionario es --> " + cont);
	}

}
