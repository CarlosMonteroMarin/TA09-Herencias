package ex5;

public class Alumno extends Persona {
	//Atributos
	private int notaActual;
	
	
	
	//Constructores
	public Alumno() {
		super();
		this.notaActual=0;
	
	}
	
	//Constructor con herencia.
	//si el metodo controlNota retorna true imprimira la nota correcta,
	//si el  metodo controlNota retorna false imprimira una nota por defecto de 0
	public Alumno(int notaActual, String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
		if (controlNota(notaActual)==true) {
			this.notaActual = notaActual;
		}else {
			this.notaActual=0;
		}
		
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
		int random=(int) (Math.random()*100);
		
		return random<50?false:true;
	}
	
	
	
	//Método para comrpobar si la nota esta en el rango entre 0 y 10
	//de ser así retorna true de no ser así retorna false
	public boolean controlNota(int notaActual) {
		return notaActual<=10?true:false;
		
	}
	
	//Sobrescribimos el método toString para formatear la salida por pantalla del objeto alumno.
	@Override
	public String toString() {
		return "----Alumno----"+"\nNombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nNota actual: "+notaActual+"\n";
	}
	
}
