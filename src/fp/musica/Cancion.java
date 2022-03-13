package fp.musica;

import java.time.LocalDate;

import fp.utiles.Checkers;

public record Cancion(String title, String artist, String topGenre, Integer year, Integer likes, Integer dislikes,
		Integer durationSec, Boolean announcedOnTwitter, LocalDate lastConcert) {	
	/*Con estos atributos en un record, ya tenemos por defeto creados los metodos observadores, 
	 * el toString, el metodo .equals() y el método .hashCode()
	 */
	
	public Cancion {
		checkTitle(title);
		checkDurationSec(durationSec);
	}
	
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
	
	public Double getRatioLikesDislikes() {
		String likes = Integer.toString(this.likes());
		String dislikes = Integer.toString(this.dislikes());
		Checkers.check("Los numeros de likes y dislikes han de ser positivos", Double.parseDouble(likes) >= 0 && Double.parseDouble(dislikes) >= 0);
		Double ratio = (Double.parseDouble(likes))/(Double.parseDouble(dislikes));
		return (double) ratio;
	}
	
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
