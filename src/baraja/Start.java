package baraja;

public class Start {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		baraja.barajar();
		System.out.println(baraja.SiguienteCarta());
		System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

	}

}
