package piedrapapeltijera;

public class Start {

	public static void main(String[] args) {
		
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Arbitro arbitro = new Arbitro(3);

        while (!arbitro.haTerminado()) {
            jugador1.generarJugada();
            System.out.println(jugador1.getJugada());
            jugador2.generarJugada();
            System.out.println(jugador2.getJugada());
            arbitro.evaluarJugada(jugador1, jugador2);
            System.out.println("-------------");
        }

        System.out.println("El ganador es: " + arbitro.getGanador());
    }

	}


