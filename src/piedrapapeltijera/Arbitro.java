package piedrapapeltijera;

public class Arbitro {

	private int victoriasNecesarias;
	private int victoriasJugador1;
	private int victoriasJugador2;

	public Arbitro(int victoriasNecesarias) {
		this.victoriasNecesarias = victoriasNecesarias;
	}

	public int getVictoriasNecesarias() {
		return victoriasNecesarias;
	}

	public void setVictoriasNecesarias(int victoriasNecesarias) {
		this.victoriasNecesarias = victoriasNecesarias;
	}

	public int getVictoriasJugador1() {
		return victoriasJugador1;
	}

	public void setVictoriasJugador1(int victoriasJugador1) {
		this.victoriasJugador1 = victoriasJugador1;
	}

	public int getVictoriasJugador2() {
		return victoriasJugador2;
	}

	public void setVictoriasJugador2(int victoriasJugador2) {
		this.victoriasJugador2 = victoriasJugador2;
	}

	public void evaluarJugada(Jugador jugador1, Jugador jugador2) {
		String jugada1 = jugador1.getJugada();
		String jugada2 = jugador2.getJugada();

		if ((jugada1.equals("piedra") && jugada2.equals("tijera"))
				|| (jugada1.equals("papel") && jugada2.equals("piedra"))
				|| (jugada1.equals("tijera") && jugada2.equals("papel"))) {
			victoriasJugador1++;
		} else if ((jugada2.equals("piedra") && jugada1.equals("tijera"))
				|| (jugada2.equals("papel") && jugada1.equals("piedra"))
				|| (jugada2.equals("tijera") && jugada1.equals("papel"))) {
			victoriasJugador2++;
		}
	}

	public boolean haTerminado() {
		if (victoriasJugador1 >= victoriasNecesarias || victoriasJugador2 >= victoriasNecesarias) {
			return true;
		} else {
			return false;
		}
	}

	public String getGanador() {
		if (victoriasJugador1 >= victoriasNecesarias) {
			return "Jugador 1";
		} else if (victoriasJugador2 >= victoriasNecesarias) {
			return "Jugador 2";
		} else {
			return "No hay ganador aún";
		}
	}
}
