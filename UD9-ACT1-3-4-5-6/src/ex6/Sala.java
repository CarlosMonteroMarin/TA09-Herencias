package ex6;

public class Sala {
	
	private Asiento[][] silla;
	
	public Sala(int numfilas, int numcolumnas) {
		//constructor de sala que inicializa filas y columnas
		this.silla=new Asiento[numfilas][numcolumnas];
		this.silla=creaSala(this.silla);
	}

	private Asiento[][] creaSala(Asiento[][] silla2) {
		// método que crea la matriz de asientos de la sala
		for(int i=0;i<silla2.length;i++) {
			for(int j=0;j<silla2[i].length;j++) {
				silla2[i][j]=new Asiento(i,j,silla2.length);
			}
		}
		
		return silla2;
	}
	public Asiento[][] getAsiento(){
		return this.silla;
	}
	public void setAsiento(int fila,int col) {
		this.silla[fila][col].setEmpty(false);
	}
	
	public Asiento getSilla(int fila,int col) {
		return this.silla[fila][col];
		
	}
	
	

}
