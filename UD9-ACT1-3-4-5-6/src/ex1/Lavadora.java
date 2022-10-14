package ex1;

public class Lavadora extends Electrodomestico {
	private final double CARGA_D=5.0;
	
	public double carga;
	

	public Lavadora() {
		this.carga=CARGA_D;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga=carga;
		
	}

	public double getCarga() {
		return carga;
	}

	
	public double precioFinalLavadora(double carga) {
		if (carga>30) {
			return super.precioFinal()+50;	

		}else {
			return super.precioFinal();
		}
	}

}
