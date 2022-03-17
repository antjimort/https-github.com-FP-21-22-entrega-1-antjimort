package fp.musica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fp.utiles.Checkers;

public record Cancion(String title, String artist, String topGenre, Integer year, Integer likes, Integer dislikes,
		Integer durationSec, Boolean announcedOnTwitter, LocalDate lastConcert) implements Comparable<Cancion>{	
	/*Con estos atributos en un record, ya tenemos por defeto creados los metodos observadores, 
	 * el 'toString', el metodo '.equals()' y el método '.hashCode()'
	 */
	
	//Con el siguiente constructor compacto, definiremos las restricciones de los atributos 'title' y 'durationSec':
	public Cancion {
		checkTitle(title);
		checkDurationSec(durationSec);
	}
	
	//Establecemos el orden natural del tipo Cancion:
	
	public int compareTo(Cancion c) {
		Integer r = null;
		if (c == null) {
			throw new NullPointerException();
		}
		r = title().compareTo(c.title());
		if (r == 0) {
			r = artist().compareTo(c.artist());
		}
		return r;
	}

	//Funciones lanzadoras de excepciones:
	
	public void checkTitle(String title) {
		if (title.equals("")) {
			throw new IllegalArgumentException("El titulo de la cancion no puede estar vacio");
		}
	}

	public void checkDurationSec(Integer durationSec) {
		if (durationSec < 120) {
			throw new IllegalArgumentException("La duracion de la cancion ha de ser "
					+ "mayor o igual a 120 segundos");
		}
	}
	
	//PROPIEDADES DERIVADAS
	//Con el siguiente metodo crearemos una propiedad derivada con la que calcularemos un ratio entre los atributos 'likes' y 'dislikes':	
	
	public Double getRatioLikesDislikes() {
		String likes = Integer.toString(this.likes());
		String dislikes = Integer.toString(this.dislikes());
		Checkers.check("Los numeros de likes y dislikes han de ser positivos", Double.parseDouble(likes) >= 0 && Double.parseDouble(dislikes) >= 0);
		Double ratio = (Double.parseDouble(likes))/(Double.parseDouble(dislikes));
		return (double) ratio;
	}
	
	
	/* Crearemos a continuacion un metodo con el que analizaremos la antiguedad de un objeto tipo Cancion segun su propiedad 'year', 
	 * lo que hará devolver por pantalla valores del Enumerado Antiguedad
	 */
	public Antiguedad getAntiguedad() {
		Antiguedad r = null;
		if (year().equals(2015) && year() <= 2016) {
			r = Antiguedad.ANTIGUA;
		} else if (year() > 2016 && year() <= 2018) {
			r = Antiguedad.RECIENTE;
		} else if (year() > 2018 && year() == 2019){
			r = Antiguedad.NUEVA;
		}
		return r;
	}
	
}
