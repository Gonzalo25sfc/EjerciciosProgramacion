package T6;

import java.util.Scanner;

class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		int contp=0;
		int contn=0;
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		int n7; 
		int n8;
		int n9;
		int n10;
		
		System.out.println("Introduzca un numero");
		n1 = teclado.nextInt();
		
		if(n1 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n2 = teclado2.nextInt();
		
		if(n2 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n3 = teclado3.nextInt();
		
		if(n3 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n4 = teclado4.nextInt();
		
		if(n4 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n5 = teclado5.nextInt();
		
		if(n5 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n6 = teclado6.nextInt();
		
		if(n6 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n7 = teclado7.nextInt();
		
		if(n7 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n8 = teclado8.nextInt();
		
		if(n8 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n9 = teclado9.nextInt();
		
		if(n9 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Introduzca un numero");
		n10 = teclado10.nextInt();
		
		if(n10 > 0) {
			contp= contp + 1;
		}
		else {
			contn=contn + 1;
		}
		
		System.out.println("Positivos --> " + contp);
		System.out.println("Negativo --> " + contn);
	}

}
