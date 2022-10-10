package ex1;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico[] elec;
		elec=creaArray();
		
		String[] preciofinal=muestraPrecioFinal(elec);
		imprimePrecioFinal(preciofinal);

	}

	private static void imprimePrecioFinal(String[] preciofinal) {
		// Método que imprime el precio final
		for(int i=0;i<preciofinal.length;i++) {
			System.out.println(preciofinal[i]);
		}
		
	}

	private static String[] muestraPrecioFinal(Electrodomestico[] elec) {
		//Método que muestra el precio final de los productos
		String[] pfinal=new String[3];
		double[] preciof=new double[3];
		for(int i=0;i<elec.length;i++) {
			if(elec[i] instanceof Television) {
				preciof[1]+=elec[i].precioFinal();
				preciof[0]+=elec[i].precioFinal();
			}
			else if(elec[i] instanceof Lavadora) {
				preciof[2]+=elec[i].precioFinal();
				preciof[0]+=elec[i].precioFinal();
			}
			else preciof[0]+=elec[i].precioFinal();
		}
		pfinal[0]="El precio de los electrodomesticos es igual a "+preciof[0]+"€\n";
		pfinal[1]="El precio de los televisores es igual a "+preciof[1]+"€\n";
		pfinal[2]="El precio de las lavadoras es igual a "+preciof[2]+"€\n";
		
		
		return pfinal;
	}

	private static Electrodomestico[] creaArray() {
		// Método que crea la array de electrodomesticos
		Electrodomestico[] electro = new Electrodomestico[10];
		
			electro[0]= new Electrodomestico();
			electro[1]=new Television();
			electro[2]=new Lavadora();
			electro[3]=new Electrodomestico(200.5,300);
			electro[4]=new Lavadora(250,70);
			electro[5]=new Television(400,50);
			electro[6]=new Electrodomestico(450,"ROJO",'B',200);
			electro[7]=new Television(60,true,550,"NEGRO",'A',50);
			electro[8]=new Lavadora(200,"Blanco",'C',70,200);
			electro[9]=new Television();
		return electro;
	}
	

}
