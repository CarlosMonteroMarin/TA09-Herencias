package ex5;

import java.util.Random;

public class Controller {
	
	public static final Random rdm= new Random();
	public static void ejecutaFunciones() {
		
		Aula[] aulas=creaArrays();
		for (int i=0; i<aulas.length;i++) {
			System.out.println("-------------------------Aula "+(i+1)+"-------------------------\n");
			if(!(aulas[i].hayClase())) {
				System.out.println("No puede haber clase");
			}
			
		}
		
	}

	private static Aula[] creaArrays() {
		// TODO Auto-generated method stub
		Aula[] aulas=new Aula[3];
		int nummax=(int)(Math.random()*100);
		for(int i=0;i<aulas.length;i++) {
			aulas[i]= new Aula(generaAlumnosRandom(nummax-1),generaProfe(),nummax,generamateria());
		}
		
		return aulas;
	}

	private static String generamateria() {
		//
		VariablesEnum.Materias[] materias=VariablesEnum.Materias.values();
		return ""+materias[rdm.nextInt(materias.length)];
	}

	private static Profesor generaProfe() {
		//
		VariablesEnum.Sexo[] sexo = VariablesEnum.Sexo.values();
		String ssexo= ""+sexo[rdm.nextInt(sexo.length)];
		String nombre;
		if(ssexo.equals("hombre")) {
			nombre= ""+VariablesEnum.Alumnosm.values()[rdm.nextInt(VariablesEnum.Alumnosm.values().length)];
		}
		else {
			nombre= ""+VariablesEnum.Alumnosf.values()[rdm.nextInt(VariablesEnum.Alumnosf.values().length)];
		}
		int edad= (int) (Math.random()*(70-20+1)+20);
		String materia= ""+VariablesEnum.Materias.values()[rdm.nextInt(VariablesEnum.Materias.values().length)];		
		return new Profesor(materia,nombre,edad,ssexo);
	}

	private static Alumno[] generaAlumnosRandom(int max) {
		Alumno[] alum= new Alumno[max];
		for(int i=0;i<max;i++) {
			VariablesEnum.Sexo[] sexo = VariablesEnum.Sexo.values();
			String ssexo= ""+sexo[rdm.nextInt(sexo.length)];
			String nombre;
			if(ssexo.equals("hombre")) {
				nombre= ""+VariablesEnum.Alumnosm.values()[rdm.nextInt(VariablesEnum.Alumnosm.values().length)];
			}
			else {
				nombre= ""+VariablesEnum.Alumnosf.values()[rdm.nextInt(VariablesEnum.Alumnosf.values().length)];
			}
			int edad= (int) (Math.random()*(18-5+1)+5);
			int nota= (int)(Math.random()*10);	
			alum[i]= new Alumno(nota,nombre,edad,ssexo);
		}
		return alum;
	}
	
}
