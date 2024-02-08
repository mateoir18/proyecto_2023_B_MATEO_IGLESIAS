package contraseñas;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número de contraseñas que quieres generar:");
		int num = scanner.nextInt();

		Password[] passwords = new Password[num];
		boolean[] esFuerte = new boolean[num];

		for (int i = 0; i < num; i++) {
			passwords[i] = new Password();
			esFuerte[i] = passwords[i].esFuerte();
		}

		for (int i = 0; i < num; i++) {
			System.out.println("contraseña" + (i + 1) + " > " + (esFuerte[i] ? "fuerte" : "débil"));
		}

		scanner.close();
	}
}
