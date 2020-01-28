package ejercicios;

import java.util.Scanner;

class ej_cond8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int horast;
		System.out.println("Introduce el numero total de horas trabajadas esta semana -->");
		horast = teclado.nextInt();
		int hora=12;
		int horastot=hora*horast;
		System.out.println("Su salario semanal es --> " + horastot + " euros");
	}

}
