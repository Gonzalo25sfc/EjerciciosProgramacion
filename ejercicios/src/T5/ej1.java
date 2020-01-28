package T5;

import java.util.*;
import java.io.*;

class ej1 {

	
		     public static void main(String[] args) throws IOException{
		 		int n;
				int i;
				
				 Scanner teclado = new Scanner(System.in);
				 
				 System.out.println("Introduce un número ");
				 n = teclado.nextInt();
				   
				    for (i=0; n>0; i++){
				      n = n/10;
				    }
				    System.out.println("El número tiene "+i+" cifras.");
			}

		}

