package fp.dominio.musica;

import java.time.LocalDate;

public record Cancion(String title, String artist, Integer year, Integer durationSec, Boolean announcedOnTwitter, LocalDate lastConcert) {
	
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

	private void checkTitle() {
		if (title().equals("")) {
			throw new IllegalArgumentException("El titulo de la canción no puede estar vacio");
		}
	}

	private void checkDurationSec() {
		if (durationSec() < 120) {
			throw new IllegalArgumentException("La duracion de la cancion ha de ser "
					+ "mayor o igual a 120 segundos");
		}
	}
	
}
