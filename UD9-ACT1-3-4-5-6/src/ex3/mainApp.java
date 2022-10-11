package ex3;

public class mainApp {

	public static void main(String[] args) {
		/* 	Crea una clase Liibro que contenga los siguientes atributos: 
		 *  - ISBN
		 *  - Titulo
		 *  - Autor
		 *  - Número de páginas
		 *  
		 *  Crear sus respectivos métodos get y set correspondientes
		 *  para cada atributo.
		 *  
		 *  Crear el método toString() para mostrar la información
		 *  relativa al libro con el siguiente formato:
		 *  "El libro con ISBN creado por el autor tiene páginas".
		 *  
		 *  En el fichero main, crear 2 objetos Libro (los valores que
		 *  se quieran) y mostrarlos por pantalla.
		 *  
		 *  Por último, indicar cuál de los 2 tiene más páginas.
		 * */
		
		Libro Libros[] = new Libro[2];
		
		Libros[0] = new Libro();
		Libros[1] = new Libro("123-456-789","Narnia","C.S.Lewis",234);
		
		System.out.println(Libros[0].toString());
		System.out.println(Libros[1].toString());
		
		System.out.println("");
		Libros[1].masPaginas(Libros[0]);
		
	}

}
