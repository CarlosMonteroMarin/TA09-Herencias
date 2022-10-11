package ex5;

public class profesor extends personas {
	private String materia;

	
	public profesor() {
		super(nombre, edad, sexo);
		this.materia = materia;
	}

	
	public profesor(String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}

	
	public String getMateria() {
		return materia;
	}

	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	
	
	
	
	

}
