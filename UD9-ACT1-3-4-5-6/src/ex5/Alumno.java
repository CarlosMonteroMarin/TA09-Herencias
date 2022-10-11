package ex5;

public class Alumno extends Persona {
	//Atributos
	private int notaActual;
	
	
	
	//Constructores
	public Alumno() {
		super();
		this.notaActual=0;
	
	}
	
	
	public Alumno(int notaActual, String nombre, int edad, String sexo) {
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


	//Método heredado de Persona que sirve para generar un número random entre 0 y 1 (50%)
	//si sale 0 retornara false y habrá hecho novillos
	//si sale 1 retornara true y habrá asistido a clase
	@Override
	public boolean asistencia() {
		int random=(int) (Math.random());
		
		return random==0?false:true;
	}
	
	
}
