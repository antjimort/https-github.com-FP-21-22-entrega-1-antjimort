package fp.musica;

import java.time.LocalDate;

public record Cancion(String title, String artist, String topGenre, Integer year, Integer likes, Integer dislikes,
		Integer durationSec, Boolean announcedOnTwitter, LocalDate lastConcert) {
	/*Con estos atributos en un record, ya tenemos por defeto creados los metodos observadores, 
	 * el toString, el método .equals() y el método .hashCode()
	 */
	
	//Establecemos el orden natural del tipo Cancion
	
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

	
	//Funciones lanzadoras de excepciones
	
	private void checkTitle() {
		if (title().equals("")) {
			throw new IllegalArgumentException("El titulo de la canci??n no puede estar vacio");
		}
	}

	private void checkDurationSec() {
		if (durationSec() < 120) {
			throw new IllegalArgumentException("La duracion de la cancion ha de ser "
					+ "mayor o igual a 120 segundos");
		}
	}
	
	public Double getRatioLikesDislikes() {
		Double ratio = (Double.parseDouble(likes()))/(Double.parseDouble(dislikes()));
		return ratio;
	}
	
	
	
	
	
}
