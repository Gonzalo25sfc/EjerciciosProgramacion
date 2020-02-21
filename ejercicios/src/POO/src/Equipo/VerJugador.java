package Equipo;

public class VerJugador {

	public static void main(String[] args) {
	
		Jugador jugador1 = new Jugador("Betis", "Delantero", (float) 1.80, 70, "Jorge", 25);
		Jugador jugador2 = new Jugador("Sevilla", "Delantero", (float) 1.90, 70, "De Jong", 9);
		Jugador jugador3 = new Jugador("Espanyol", "Centrocampista", (float) 1.66, 60, "Darder", 15);
		Jugador jugador4 = new Jugador("Girona", "Defensa", (float) 1.87, 78, "Bruno", 4);
		Jugador jugador5 = new Jugador("Madrid", "Delantero", (float) 1.76, 85, "Modric", 7);
		Jugador jugador6 = new Jugador("Barcelona", "Centrocampista", (float) 1.63, 67, "Messi", 10);
		Jugador jugador7 = new Jugador("Getafe", "Defensa", (float) 1.70, 90, "Angel", 34);
		Jugador jugador8 = new Jugador("RealSociedad", "Portero", (float) 1.82, 80, "Kepa", 1);
		Jugador jugador9 = new Jugador("Mirandes", "Portero", (float) 1.78, 60, "Valdes", 2);
		Jugador jugador10 = new Jugador("Levante", "Centrocampista", (float) 1.78, 64, "Bhardi", 15);

		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador1.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador2.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador3.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador4.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador5.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador6.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador7.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador8.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador9.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(jugador10.toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
