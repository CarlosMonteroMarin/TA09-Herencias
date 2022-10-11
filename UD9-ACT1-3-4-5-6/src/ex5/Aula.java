package ex5;

public class Aula {
	
	private Alumno[] m_alumno;
	private Profesor m_profesor;
	private int m_nummax;
	private String m_materia;
	
	
	public Aula(){
		this.set_NumMax(0);
		this.m_alumno=null;
		this.m_materia="";
		this.m_profesor=null;
		
	}
	public Aula(Alumno[] alum,Profesor prof,int nummax,String materia) {
		this.set_NumMax(nummax);
		this.m_alumno=alum;
		this.m_materia=materia;
		this.m_profesor=prof;
	}
	
	
	public boolean hayClase() {
		int i=0;
		int numalum=0;
		if(!this.m_profesor.asistencia())return false;
		else if(!(this.m_profesor.getMateria()!=this.m_materia)) return false;
		else {
			while(i<this.m_alumno.length) {
				if(this.m_alumno[i].asistencia()) numalum++;
				i++;
			}
			if(numalum<(m_alumno.length*0.5)) return false;
			else return true;
		}
	}
	public int get_NumMax() {
		return m_nummax;
	}
	public void set_NumMax(int m_nummax) {
		this.m_nummax = m_nummax;
	}
	
}
