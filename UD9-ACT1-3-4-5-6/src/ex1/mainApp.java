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
		for(int i=0;i<preciofinal[0].length();i++) {
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
		for(int i=0;i<10;i++) {
			if(i%3==0) electro[i]= new Electrodomestico();
			else if(i%3==1) electro[i]=new Television();
			else electro[i]=new Lavadora();
		}
		return electro;
	}
	

}
