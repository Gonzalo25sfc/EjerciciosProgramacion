package intro;

public class Alumno {
	
	//ATRIBUTOS
	
	private String nombre;
	private int edad;
	private String apellido1;
	private String apellido2;
	private String correo;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", correo=" + correo + "]";
	}
	public void Constructor(String nombre, int edad, String apellido1, String apellido2,  String correo) {
		this.nombre=nombre;
		this.edad=edad;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.correo=correo;
	}
	

	
}
