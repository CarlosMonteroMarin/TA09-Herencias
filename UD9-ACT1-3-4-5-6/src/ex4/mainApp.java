package ex4;

public class mainApp {

	public static void main(String[] args) {
		int a=1;
		int b=-2;
		int c=1;
		
		Raices equacion =new Raices(a, b, c);
		double discriminate=getDiscriminate(equacion);
		
		System.out.println("---CALCULADORA DE EQUACIONES DE 2N GRADO---");
		
		//Condición si tiene dos soluciones imprimirá tieneRaices e imprimirá "La equación tiene dos soluciones."
		//Y llamará al metodo obtenerRaices e imprimirá las dos raices
		if (tieneRaices(discriminate)==true) {
			System.out.println("La equación tiene dos soluciones.");
			obtenerRaices(discriminate, equacion);
			
		//Condición si tiene 1 soluciones imprimirá tieneRaiz e imprimirá "La equación tiene una solución"
		//Y llamará al metodo obtenerRaices e imprimirá las dos raices	
		} else if (tieneRaiz(discriminate)==true){
			System.out.println("La equación tiene una solución.");
			obtenerRaiz(discriminate, equacion);
		//Si no tiene solución imprimirá "La equación no tiene solución."
		}else {
			System.out.println("La equación no tiene solución.");
		}
		//Llamamos al metodo calcular para que finalmente imprima 1 o 2 soluciones.
		calcular(equacion, discriminate);
	}
	
	
	//Método que devuelve el valor del discriminate.
		public static double getDiscriminate(Raices equacion) {
			double discriminate=(Math.pow(equacion.getB(), 2))-(4*equacion.getA()*equacion.getC());
			
			return discriminate;
		}
		
		//Método que devuelve si tiene dos soluciones.
		public static boolean tieneRaices(double discriminate ) {
			if (discriminate>0 ) {
				return true;
			}
			return false;
		}
		
		//Metodo que indica si tiene una unica solicion
		public static boolean tieneRaiz(double discriminate) {
			if (discriminate==0) {
				return true;
			} 
			return false;
		}
		
		//Método para mostrarp por consola las posibles soluciones que tiene 
		//la ecuación, en caso de no existir solución mostrarlo también
		public static void calcular(Raices equacion, double descriminate) {
			double resultadoSuma=0.0;
			double resultadoResta=0.0;
			
			//Condición si tieneRaices() es igual a true hará las dos posible soluciones y las imprimirá
			if (tieneRaices(descriminate)==true) {
				resultadoSuma=(-equacion.getB()+Math.sqrt(descriminate))/(2*equacion.getA());

				resultadoResta=(-equacion.getB()-Math.sqrt(descriminate))/(2*equacion.getA());
				
				System.out.println("El primer resultado de la equación es:  "+resultadoSuma);
				System.out.println("El segundo resultado de la equación es:  "+resultadoResta);

			}
			//Condición si tieneRaiz() es igual a true hará la única posible solucion y la imprimirá.

			if (tieneRaiz(descriminate)==true){
				resultadoSuma=-equacion.getB()/(2*equacion.getA());
				System.out.println("El resultado de la equación es: "+resultadoSuma);
			}
		}
		
		
		//Método que imprime las dos raices
		public static void obtenerRaices(double descriminate, Raices equacion) {
			 if(tieneRaices(descriminate) == true) {
		            double resultadoResta= -Math.sqrt(getDiscriminate(equacion));
		            double resultadoSuma = +Math.sqrt(getDiscriminate(equacion));

		            System.out.println("Las raices són: "+resultadoResta+" o "+resultadoSuma);
		        }
		}
		
		
		//Método que imprime unica raiz, sera cuando solo tenga una solucion posible
		public static void obtenerRaiz(double descriminate, Raices equacion) {
			 if(tieneRaiz(descriminate) == true) {

		            double resultado1 = +Math.sqrt(getDiscriminate(equacion));
		            System.out.println("La raiz es: " +resultado1);
		        }
		}

}
