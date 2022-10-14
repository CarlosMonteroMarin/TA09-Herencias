package ex6;

public class Espectador{
	//Atributos
	private String nombre;
	private int edad;
	private double dinero;
	
	//Constructores
	//Constructor por defecto
	public Espectador() {
		this.setNombre("");
		this.setEdad(0);
		this.setDinero(0.0);
	}
	
	//Constructor con todos los atributos
	public Espectador(String nombre,int edad,double dinero) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setDinero(dinero);
	}

	
	//Getters y setters
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

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
}
