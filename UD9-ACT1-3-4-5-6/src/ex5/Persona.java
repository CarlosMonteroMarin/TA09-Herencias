package ex5;

public abstract class Persona {
	
	//Atributos
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	protected String SEXO_D = "hombre";
	
	
	//Constructores
	
	//Constructor basico
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO_D;
	}
	
	//Constructor con todos los atributos
	public Persona(String nombre,int edad,String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
	//Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getSexo() {
		return sexo;
	}
	
	//método asistencia
	public abstract boolean asistencia();
}
