package intro;

public class CochePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar el objeto concreto de la clase Coche
		coche miCoche = new coche();
		coche cocheVecino = new coche();
		
		miCoche.color="rojo";
		miCoche.marca="Volskwagen";
		miCoche.kms=77000;
		miCoche.puertas=3;
		
		//modifico un atributo
		miCoche.color="negro";
		
		System.out.println("Mi coche tienes los siguientes atributos: ");
		System.out.println("Marca: " + miCoche.marca);
		System.out.println("KMS: " + miCoche.kms);
		System.out.println("Color: " + miCoche.color);
		System.out.println("Puertas: " + miCoche.puertas);
		
		System.out.println("--------------------------------------------------------");
		
		cocheVecino.color="plata";
		cocheVecino.kms=84202;
		cocheVecino.marca="Tesla";
		
		System.out.println("El coche del vecino tienes los siguientes atributos: ");
		System.out.println("Marca: " + cocheVecino.marca);
		System.out.println("KMS: " + cocheVecino.kms);
		System.out.println("Color: " + cocheVecino.color);

	}

}
