package intro;

public class Calculadora {
	//declaramos las variables como private
	private int n1;
	private int n2;
	private char operador;
	private int resultado;
	
	//realizamos un constructor llamado calculo que albelgara todas nuestras variables
	public void calculo (int n1, int n2, char operador) {
		
	//machacamos los valores y los igualamos las variables;
		this.n1= n1;
		this.operador=operador;
		this.n2= n2;
		switch (operador) { //Realizamos el switch case 
		case '+':
			 resultado = n1 + n2;
			 break;
		
		case '-':
			resultado = n1 - n2;
			break;
			
		case '*':
		resultado = n1 * n2;
		break;
		
		case '/':
			resultado = n1 / n2;
			break;
			
		default:
			System.out.println("¡ERROR!");
		}
	}

	//Hacemos un toString para retornar todos los datos
	@Override
	public String toString() {
		return "Calculadora --> " + n1 + operador +  n2 +    "=" + resultado ;
	}
	
	

}
