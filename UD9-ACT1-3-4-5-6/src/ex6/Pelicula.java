package ex6;

public class Pelicula extends Cine{
	//Atributos
	/*en el enunciado les interesa conocer el titulo
	 * pero viene heredado del atributo pelicula de la clase Cine*/
	private double duracion;
	private int edadMinima;
	private String director;
	
	
	//Constructores
	//Constructor por defecto
	public Pelicula() {
		this.setDuracion(0.0);
		this.setEdadMinima(0);
		this.setDirector("");
	}
	
	//Constructor con todos los atributos
	public Pelicula(String pelicula, double precioEntrada, double duracion, int edadMinima, String director) {
		super(pelicula,precioEntrada);
		this.setDuracion(duracion);
		this.setEdadMinima(edadMinima);
		this.setDirector(director);
	}

	//Getters y setters
	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
