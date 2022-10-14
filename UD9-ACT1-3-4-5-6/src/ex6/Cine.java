package ex6;

public class Cine {
	//Atributos
		protected String pelicula;
		protected double precioEntrada;

		
		//Constructores
		
		//Constructor por defecto
		public Cine() {
			this.setPelicula("");
			this.setPrecioEntrada(0.0);
		}
		//Constructor con todos los atributos
		public Cine(String pelicula, double precioEntrada) {
			this.setPelicula(pelicula);
			this.setPrecioEntrada(precioEntrada);
		}
		
		
		//Getters y setters
		public String getPelicula() {
			return pelicula;
		}
		public void setPelicula(String pelicula) {
			this.pelicula = pelicula;
		}
		public double getPrecioEntrada() {
			return precioEntrada;
		}
		public void setPrecioEntrada(double precioEntrada) {
			this.precioEntrada = precioEntrada;
		}
}
