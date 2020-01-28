package ejercicios;

import java.util.Scanner;

class ej_cond3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int nacimiento;
		System.out.println("Introduzca su año de nacimiento:");
		nacimiento = teclado.nextInt();
		
		if(nacimiento<=2000) {
			System.out.println("Usted es mayor de edad");
		}
		else {
			System.out.println("Usted es menor de edad");
		}
	}

}
