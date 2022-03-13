package fp.musica.test;

import java.time.LocalDate;
import fp.musica.Cancion;

public class TestCancion {

	public static void main(String[] args) {
		//Probaremos a crear un objeto tipo Cancion con estos datos:
		//Believer, Imagine Dragons, modern rock, 2017, 125, 78, 204, True, 02/07/2020
		Cancion c1 = new Cancion("Believer", "Imagine Dragons", "modern rock", 2017, 125, 78, 204, true, LocalDate.of(2020, 7, 2));		
		System.out.println(c1);
		equalsTest();
		System.out.println("El ratio entre likes y dislikes de la cancion c1 es: " + c1.getRatioLikesDislikes());
	}
	
		
	public static void equalsTest() {
			Cancion c = new Cancion("Perfect", "Ed Sheeran", "pop", 2017, 95, 45, 263, false, LocalDate.of(2019, 10, 10));
			Cancion k = new Cancion("Perfect", "Ed Sheeran", "pop", 2017, 95, 45, 263, false, LocalDate.of(2019, 10, 10));
			if (!c.equals(k)) {
				throw new IllegalStateException("Las canciones han de ser iguales");
			} else {
				System.out.println("Las canciones son iguales");
			}
	}

	
	
	
}
