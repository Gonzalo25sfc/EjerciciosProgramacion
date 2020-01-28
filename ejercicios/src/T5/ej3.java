package T5;

import java.util.Scanner;

class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		int n2;
		int n3;
		int mayor;
		int medio;
		int menor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el primer numero");
		n1 = teclado.nextInt();
		
		System.out.println("Dame el segundo numero");
		n2 = teclado.nextInt();
		
		System.out.println("Dame el tercer numero");
		n3 = teclado.nextInt();
		
		if (n1>n2 && n1>n3) {
			mayor = n1;
		} else if (n2>n1 && n2>n3) {
			mayor = n2;
		} else {
			mayor = n3;
		}
		
		if (n1<n2 && n1<n3) {
			menor = n1;
		} else if (n2<n1 && n2<n3) {
			menor = n2;
		} else {
			menor = n3;
		}
		
		medio = (n1+n2+n3) - (mayor+menor);
		System.out.println("Menor = " + menor );
		System.out.println("Medio = " + medio );
		System.out.println("Mayor = " + mayor );
	}

}
