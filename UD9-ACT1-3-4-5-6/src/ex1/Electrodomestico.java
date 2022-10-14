package ex1;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	// Constantes
	protected final double PRECIO_BASE_D = 100;
	protected final String COLOR_D = "blanco";
	protected final char CONSUMO_ENERGETICO_D = 'F';
	protected final double PESO_D = 5;
	
	// ------------ Constructores ------------
	
	// Constructor por defecto
	public Electrodomestico(){
		this.precioBase = PRECIO_BASE_D;
		this.color = COLOR_D;
		this.consumoEnergetico = CONSUMO_ENERGETICO_D;
		this.peso = PESO_D;
	}
	
	// Constructor con precio y peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_D;
		this.consumoEnergetico = CONSUMO_ENERGETICO_D;
		this.peso = peso;
	}
	
	// Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		if (comprobarColor(color)) {
			this.color = color;
		}else {
			this.color = COLOR_D;
		}
		
		if(comprobarConsumoEnergetico(Character.toUpperCase(consumoEnergetico))) {
			this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		}else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_D;
		}
		
		this.peso = peso;
	}
	
	
	// Getters y setters
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//Método precio final
	public double precioFinal() {
		double sumaPrecio=this.precioBase;
		
		switch(this.consumoEnergetico) {
		case 'A':
			sumaPrecio+=100;
			break;
		case 'B':
			sumaPrecio+=80;
			break;
		case 'C':
			sumaPrecio+=60;
			break;
		case 'D':
			sumaPrecio+=50;
			break;
		case 'E':
			sumaPrecio+=30;
			break;
		case 'F':
			sumaPrecio+=10;
			break;
		default:
			break;
		}
		
		if(this.peso>= 0 && this.peso<=19) {
			sumaPrecio += 10; 
		}else if(this.peso>= 20 && this.peso<=49) {
			sumaPrecio += 50; 
		}
		else if(this.peso>= 50 && this.peso<=79) {
			sumaPrecio += 80; 
		}else {
			sumaPrecio += 100; 
		}
		
		return sumaPrecio;
	}
	
	
	// Método para comprobar el color
	public boolean comprobarColor(String color) {
		if (color.equals("blanco") || color.equals("negro") || color.equals("rojo")|| color.equals("azul") || color.equals("gris")) {
			return true;
		}else {
			return false;
		}
	}
	
	//Método para comprobar el valor energético
	public boolean comprobarConsumoEnergetico(char consumoEnergetico) {
		if (consumoEnergetico == 'A'|| consumoEnergetico == 'B' || consumoEnergetico == 'C'|| consumoEnergetico == 'D' || consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			return true;
		}else {
			return false;
		}
	}
	
}
