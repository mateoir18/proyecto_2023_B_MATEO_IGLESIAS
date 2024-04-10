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

		try {
			System.out.println(barajaEspanola.siguienteCarta());
		} catch (NoHayCartasException e) {
			
			e.printStackTrace();
		}

		// Cartas dadas

		try {
			System.out.println(barajaEspanola.darCartas(10));
		} catch (NoHayCartasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(barajaEspanola.darCartas(2));
		} catch (NoHayCartasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(barajaEspanola.darCartas(10));
		} catch (NoHayCartasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Cartas que ya han salido

		System.out.println(barajaEspanola.cartasMonton());

		// Las cartas disponibles en la baraja

		System.out.println(barajaEspanola.cartasDisponibles());

		// Cartas restantes en la baraja

		System.out.println(barajaEspanola.mostrarBaraja());

		try {
			System.out.println(barajaEspanola.siguienteCarta());
		} catch (NoHayCartasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
