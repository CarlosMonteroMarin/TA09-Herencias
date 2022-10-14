package ex5;

public class Profesor extends Persona {
	//Atributos
	private String materia;

	//Constructores
	public Profesor() {
		super();
		this.materia="";
	}

	//Constructor con herencia,
	//Si el método controlMateria retorna true imprimirá la materia pasada,
	//Si el método controlMateria retorna false imrpimirá "Materia no correcta"
	public Profesor(String materia, String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
		if (controlMateria(materia.toLowerCase())==true) {
			this.materia = materia;
		}else {
			this.materia="Materia no correcta";
		}
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
	
	//Método para comprobar que la materia es correcta
	//de ser correcta retorna true de no serlo retorna false
	public boolean controlMateria(String materia) {
		if (materia.equals("matemáticas") || materia.equals("filosofía")||materia.equals("física")) {
			return true;
		}
		
		return false;
	}

	
	//Sobrescribimos el método toString para formatear la salida por pantalla del objeto profesor.
	@Override
	public String toString() {
		return "----Profesor----"+"\nNombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo+"\nMateria: "+materia+"\n";
	}
	
	
	
}
