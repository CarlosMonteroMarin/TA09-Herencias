package ex5;

public class Profesor extends Persona {
	private String materia;

	
	public Profesor() {
		super();
		this.materia="";
	}

	
	public Profesor(String materia, String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}

	
	public String getMateria() {
		return materia;
	}

	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	//Método heredado de Persona que sirve para generar un número random entre 1 y 100 (50%)
	//si sale 20 o menos retornara false y habrá faltado a clase
	//si sale 21 o más retornara true y habrá asistido a clase
	@Override
	public boolean asistencia() {
		int random=(int) (Math.random()*100+1);
		
		return random<=20?false:true;
	}
}
