package T4;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero:");
        
        Integer numeros = teclado.nextInt();
        
        char[] nums = numeros.toString().toCharArray();
        	for(char c: nums) {
        		System.out.print(c + " ");
            
        }        
    }
}
