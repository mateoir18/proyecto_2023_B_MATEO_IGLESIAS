package baraja;

import java.util.ArrayList;

import baraja.Carta.palo;
import baraja.Carta.valor;

public class Baraja {

	ArrayList<String> baraja = new ArrayList<String>(40);
	ArrayList<String> monton = new ArrayList<String>();

	public ArrayList<String> generarBaraja() {
		for (valor valores : valor.values()) {

			for (palo palos : palo.values()) {

				String carta = valores + " de " + palos + "\n";

				baraja.add(carta);
			}

		}
		return baraja;
	}

	public void barajar() {

		for (int i = 0; i < baraja.size(); i++) {

			baraja.get(i);

			int posicion = (int) (Math.random() * baraja.size());

			baraja.set(posicion, baraja.get(i));

		}
	}

	public String siguienteCarta() {
		String carta = "";
		if (!baraja.isEmpty()) {
			carta = baraja.get(0);
		} else {
			System.out.println("No hay mas cartas");
		}
		return carta;
	}

	public int cartasDisponibles() {

		return baraja.size();

	}

	public ArrayList<String> darCartas(int numCartas) {

		ArrayList<String> cartasDadas = new ArrayList<String>();

		for (int i = 0; i < numCartas; i++) {

			String carta = "";
			if (!baraja.isEmpty()) {
				carta = baraja.get(0);
				baraja.remove(carta);
				monton.add(carta);
				cartasDadas.add(carta);

			} else {
				System.out.println("No hay mas cartas");
			}

		}

		return cartasDadas;

	}

	public ArrayList<String> cartasMonton() {

		return monton;

	}

	public ArrayList<String> mostrarBaraja() {

		return baraja;

	}

	@Override
	public String toString() {
		return "Baraja [" + baraja + "]";
	}

}
