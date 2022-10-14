package ex6;

public class Asiento {

	private String nombre;
	private boolean empty;
	
	public Asiento() {
		// constructor por defecto
		this.setNombre("");
		this.setEmpty(true);
	}
	
	public Asiento(int fila, int columna,int totalf) {
		this.setNombre(searchSit(fila,columna,totalf));
		this.setEmpty(true);
	}

	private String searchSit(int fila, int columna, int totalf) {
		// mira columna y fila respecto al total de filas y saca el codigo correspondiente
		char letra='A';
		int auxf=totalf-fila;
		int i=0;
		while(i<columna) {
			letra++;
			i++;
		}
		return (""+auxf+letra);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

}
