package baraja;

public class NoHayCartasException extends Exception {
	
	public NoHayCartasException(String mensaje) {
		super(mensaje);
	}

}