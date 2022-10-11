package ex5;

public class alumno extends personas {
	//Atributos
	private int notaActual;
	
	
	
	//Constructores
	public alumno() {
		super(nombre, edad, sexo);
		this.notaActual=notaActual;
	}
	
	
	public alumno(int notaActual) {
		super(nombre, edad, sexo);
		this.notaActual = notaActual;
	}


	//Getters y setters
	public int getNotaActual() {
		return notaActual;
	}


	public void setNotaActual(int notaActual) {
		this.notaActual = notaActual;
	}
	
	
	public void asistencia() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
