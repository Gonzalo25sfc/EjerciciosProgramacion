package Equipo;

public class Jugador {
	
	private String equipo;
	private String demarcacion;
	private float altura;
	private float peso;
	private String nombre;
	private int dorsal;
	private float sueldo=1000000;
	
	public Jugador(String equipo, String demarcacion, float altura, float peso, String nombre, int dorsal) {
		this.equipo=equipo;
		this.demarcacion=demarcacion;
		this.altura=altura;
		this.peso=peso;
		this.nombre=nombre;
		this.dorsal=dorsal;
		
		if(equipo.equalsIgnoreCase("Madrid") || equipo.equalsIgnoreCase("Barcelona") || equipo.equalsIgnoreCase("Atletico") || equipo.equalsIgnoreCase("Sevilla")) {
			sueldo*=4;
		}
		if(equipo.equalsIgnoreCase("Betis") || equipo.equalsIgnoreCase("Getafe") || equipo.equalsIgnoreCase("Bilbao") || equipo.equalsIgnoreCase("Girona") || equipo.equalsIgnoreCase("Villareal") || equipo.equalsIgnoreCase("Granada")) {
			sueldo*=2.5;
		}
		if(equipo.equalsIgnoreCase("Leganes") || equipo.equalsIgnoreCase("Osasuna") || equipo.equalsIgnoreCase("Levante") || equipo.equalsIgnoreCase("Girona") || equipo.equalsIgnoreCase("Valladolid") || equipo.equalsIgnoreCase("Celta")) {
			sueldo*=1.5;
		}
		if(equipo.equalsIgnoreCase("RealSociedad") || equipo.equalsIgnoreCase("Espanyol") || equipo.equalsIgnoreCase("RayoVallecano") || equipo.equalsIgnoreCase("Mirandes") || equipo.equalsIgnoreCase("Valladolid") || equipo.equalsIgnoreCase("Eibar")) {
			sueldo=sueldo;
		}
		
		if(demarcacion.equalsIgnoreCase("Delantero")) {
			sueldo*=2.4;
		}
		if(demarcacion.equalsIgnoreCase("Centrocampista")) {
			sueldo*=1.8;
		}
		if(demarcacion.equalsIgnoreCase("Defensa") || demarcacion.equalsIgnoreCase("Portero")) {
			sueldo*=1;
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Equipo --> " + equipo +  " || Demarcacion --> " + demarcacion +  " || Altura --> " + altura + " cm " +  " || Peso --> " + peso
				+ " kg " +  " || Nombre --> " + nombre +  " || Dorsal --> " + dorsal + " || Sueldo --> " + sueldo;
	}

	
	
}
