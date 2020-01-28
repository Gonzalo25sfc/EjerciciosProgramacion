package T4;

import java.util.Random;

public class ej1 {

public static void main(String[] args) {
// TODO Auto-generated method stub


Random numAleatorio = new Random();

int a,b,c;

a = numAleatorio.nextInt(90-65+1)+65;
b = numAleatorio.nextInt(90-65+1)+65;
c = numAleatorio.nextInt(90-65+1)+65;

System.out.println("a="+a+" b="+b+" c="+c);

}

}