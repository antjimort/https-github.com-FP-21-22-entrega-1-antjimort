package fp.musica.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fp.musica.Cancion;

public class TestCancion {

	public static void main(String[] args) {
		//Probaremos a crear un objeto tipo Cancion con estos datos:
		//Believer, Imagine Dragons, modern rock, 2017, 125, 78, 204, True, 02/07/2020
		Cancion c1 = new Cancion("Believer", "Imagine Dragons", "modern rock", 2017, 125, 78, 204, true, LocalDate.of(2020, 07, 02));		
		System.out.println(c1);
		
		//Test equals.
		equalsTest();
		
		//Test de las propiedades derivadas.
		System.out.println("El ratio entre likes y dislikes de la cancion c1 es: " + c1.getRatioLikesDislikes());
		System.out.println("La antiguedad de la cancion c1 es: " + c1.getAntiguedad());
		
		//Test compareTo.
		//Creamos dos objetos nuevos de tipo Cancion, mas una lista en la que meteremos c1, c2 y c3. Ordenaremos esta lista segun su orden natural y la imprimiremos por pantalla.
		Cancion c2 = new Cancion("goosebumps", "Travis Scott", "rap", 2016, 130, 73, 244, true, LocalDate.parse("06/02/2016", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		Cancion c3 = new Cancion("Perfect", "Ed Sheeran", "pop", 2017, 95, 45, 263, false, LocalDate.of(2019, 10, 10));
		List<Cancion> listaTresCanciones = new ArrayList<>();
		listaTresCanciones.add(c1); listaTresCanciones.add(c2); listaTresCanciones.add(c3); 
		Collections.sort(listaTresCanciones);
		System.out.println(listaTresCanciones);
		
	}
	
	//Aqui crearemos la funcion 'equalsTest' para hacer un test con el metodo '.equals()' de dos objetos tipo Cancion, que probaremos arriba.
	public static void equalsTest() {
			Cancion c = new Cancion("Perfect", "Ed Sheeran", "pop", 2017, 95, 45, 263, false, LocalDate.of(2019, 10, 10));
			Cancion k = new Cancion("Perfect", "Ed Sheeran", "pop", 2017, 95, 45, 263, false, LocalDate.of(2019, 10, 10));
			if (!c.equals(k)) {
				throw new IllegalStateException("Las canciones han de ser iguales.");
			} else {
				System.out.println("Las canciones son iguales.");
			}
	}

	
	
	
}
