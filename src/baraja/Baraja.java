package baraja;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

	private ArrayList<Carta> cartas;
	private int cartaActual;

	public Baraja() {
		this.cartas = new ArrayList<>();
		String palos[] = { "Espadas", "Bastos", "oros", "copas" };
		for (String palo : palos) {
			for (int i = 1; i <= 12; i++) {
				if (i != 8 && i != 9) {
					this.cartas.add(new Carta(i, palo));
				}

			}
		}
		this.cartaActual = 0;
	}

	public void barajar() {
		Collections.shuffle(this.cartas);
		this.cartaActual = 0;

	}

	public Carta SiguienteCarta() {
		if (this.cartaActual < this.cartas.size()) {
			return this.cartas.get(this.cartaActual++);
		} else {
			System.out.println("No hay más cartas");
			return null;
		}
	}

	public int cartasDisponibles() {
		return this.cartas.size() - this.cartaActual;
	}

	public ArrayList<Carta> darCartas(int n) {
		ArrayList<Carta> cartasADar = new ArrayList<>();
		if (this.cartasDisponibles() < n) {
			System.out.println("No hay suficientes cartas.");
		} else {
			for (int i = 0; i < n; i++) {
				cartasADar.add(this.SiguienteCarta());
			}
		}
		return cartasADar;
	}

	public void cartasMonton() {
		if (this.cartaActual == 0) {
			System.out.println("No ha salido ninguna carta.");
		} else {
			for (int i = 0; i < this.cartaActual; i++) {
				System.out.println(this.cartas.get(i));
			}
		}
	}

	public void mostrarBaraja() {
		for (int i = this.cartaActual; i < this.cartas.size(); i++) {
			System.out.println(this.cartas.get(i));
		}
	}

}
