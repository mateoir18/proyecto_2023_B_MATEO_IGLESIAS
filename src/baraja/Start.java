package baraja;

public class Start {

	public static void main(String[] args) {

		Baraja barajaEspanola = new Baraja();

		// Genera una baraja

		System.out.println(barajaEspanola.generarBaraja());

		barajaEspanola.barajar();

		// Despues de barajarla

		System.out.println(barajaEspanola.toString());

		// Se muestran las dos siguientes cartas

		System.out.println(barajaEspanola.siguienteCarta());

		// Cartas dadas

		System.out.println(barajaEspanola.darCartas(10));
		System.out.println(barajaEspanola.darCartas(2));
		System.out.println(barajaEspanola.darCartas(10));

		// Cartas que ya han salido

		System.out.println(barajaEspanola.cartasMonton());

		// Las cartas disponibles en la baraja

		System.out.println(barajaEspanola.cartasDisponibles());

		// Cartas restantes en la baraja

		System.out.println(barajaEspanola.mostrarBaraja());

		System.out.println(barajaEspanola.siguienteCarta());

	}

}
