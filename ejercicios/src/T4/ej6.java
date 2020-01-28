package T4;

import java.util.Scanner;

class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas;
		int horat=12;
		int horaext=16;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantas horas ha trabajado esta semana?");
		horas = teclado.nextInt();
		
		if (horas<=40) {
			horat= horat * horas;
			System.out.println("Esta semana su salario ha sido de " + horat + " euros");
		}
		
		if (horas>=41) {
			horaext= horaext * horas;
			System.out.println("Esta semana su salario ha sido de " + horaext + " euros");
		}
	}

}
