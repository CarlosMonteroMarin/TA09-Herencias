package ex6;

import java.util.Random;

import ex5.VariablesEnum;

public class Controller {
	//clase que realiza la demostración del programa
	public static final Random rdm= new Random();
	
	public static void ejecutaDemo() {
		
		Sala sala=new Sala(8,9);
		Espectador[] espectador;
		espectador= creaEspectador();
		Pelicula peli= new Pelicula("Jumanji",(Math.random()*(20-5+1)+5),120,((int)(Math.random()*(18-12+1)+12)),"Joe Johnston");
		ejecutaFuncion(sala,espectador,peli);
		
	}

	private static void ejecutaFuncion(Sala sala, Espectador[] espectador, Pelicula peli) {
		// Método que ejecuta las funciones de prueba
		for(int i=0;i<espectador.length;i++) {
			sala=sientaEspectador(espectador[i],sala,peli);
		}
		
	}

	private static Sala sientaEspectador(Espectador espectador, Sala sala, Pelicula peli) {
		// Método que comprueba si se puede sentar la persona y si es así muestra donde
		if(espectador.getDinero()<peli.getPrecioEntrada()) {
			System.out.printf("El espectador %s  no tiene suficiente dinero.\nPrecio pelicula:%.2f Dinero espectador: %.2f\n",espectador.getNombre(),peli.getPrecioEntrada(),espectador.getDinero());
			return sala;
		}
		if(espectador.getEdad()<peli.getEdadMinima()) {
			System.out.println("El espectador"+ espectador.getNombre()+" no tiene la edad minima para ver la pelicula. Edad minima: "+peli.getEdadMinima()+ " Edad espectador: "+espectador.getEdad());
			return sala;
		}
		Asiento [][] asiento= sala.getAsiento();
		int i,j,k=0;
		do {
			i=(int)(Math.random()*(asiento.length));
			j=(int)(Math.random()*(asiento[i].length));
			k++;
		}while(!asiento[i][j].isEmpty()&& k<(asiento.length*asiento[i].length));
		if(k<(asiento.length*asiento[i].length)) {
			asiento[i][j].setEmpty(false);
			System.out.println("El espectador "+ espectador.getNombre()+ " tiene asignado el asiento "+asiento[i][j].getNombre());
		}
		else {
			System.out.println("Lo sentimos, no hay mas asientos libres!");
		}
		
		
		return sala;
		
		
	}

	private static Espectador[] creaEspectador() {
		// método que crea una matriz de espectadores random
		Espectador[] espec= new Espectador[(int)(Math.random()*(150-5+1)+5)];
		String nombre;
		int edad;
		double dinero;
		VarEnum.Nombres[] nombres= VarEnum.Nombres.values();
		for(int i=0;i<espec.length;i++) {
			nombre=""+nombres[rdm.nextInt(nombres.length)];
			edad= (int)(Math.random()*(99-12+1)+12);
			dinero=Math.random()*(50-5+1)+5;
			espec[i]=new Espectador(nombre,edad,dinero);
		}
		
		return espec;
	}



}
