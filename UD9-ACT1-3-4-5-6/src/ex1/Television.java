package ex1;

public class Television extends Electrodomestico{
	private double resolucion;
	private boolean tdt;
	
	private final double RESOLUCION_D = 20;
	private final boolean TDT_D = false;
	
	//Constructor por defecto
	public Television() {
		this.resolucion = RESOLUCION_D;
		this.tdt = TDT_D;
	}
	
	//Constructor con 2 atributos
	public Television(double precioBase, double peso) {
		super(precioBase,peso);
		this.resolucion=RESOLUCION_D;
		this.tdt=TDT_D;
	}
	
	//Constructor con 2 atributos y el resto heredados
	public Television(double resolucion,boolean tdt,double precioBase,String color,char consumoEnergetico,double peso) {
		super(precioBase,color,consumoEnergetico,peso);
		this.resolucion=resolucion;
		this.tdt=tdt;
	}

	
	public double getResolucion() {
		return resolucion;
	}

	public boolean getTdt() {
		return tdt;
	}

	//Método precioFinal()
	public double precioFinal (double resolucion) {
		if(resolucion>40) {
			return super.precioFinal()*0.3;
		} else if(resolucion>40 && tdt) {
			return (super.precioFinal()*0.3)+50;
		}else {
			return super.precioFinal();
		}
	}
	
}
