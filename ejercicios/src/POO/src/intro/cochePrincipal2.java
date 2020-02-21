package intro;

public class cochePrincipal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar el objeto concreto de la clase Coche
				coche1 miCoche = new coche1();
				coche1 cocheVecino = new coche1();
				
				miCoche.setPuertas(3);
				miCoche.setColor("azul");
				miCoche.setMarca("Citroen");
				
				System.out.println("Dime las puertas " + miCoche.getPuertas());
				System.out.println("Dime el color " + miCoche.getColor());
				System.out.println("Dime la marca " + miCoche.getMarca());
				
	}

}
