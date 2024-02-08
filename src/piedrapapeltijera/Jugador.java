package piedrapapeltijera;

public class Jugador {

	private String jugada;

	public Jugador() {

	}

	public String generarJugada() {
		String[] jugadas = { "piedra", "papel", "tijera" };
		this.jugada = jugadas[(int) (Math.random() * jugadas.length)];
		return this.jugada;
	}

	public String getJugada() {
		return this.jugada;
	}
}
