package contraseñas;

import java.util.Random;

public class Password {

	private int longitud;
	private String contraseña;

	public Password() {
		this.longitud = 8;
		this.contraseña = generarContraseña();
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña();
	}

	public boolean esFuerte() {
		int cuentaMayusculas = 0, cuentaMinusculas = 0, cuentaDigitos = 0;

		for (int i = 0; i < this.contraseña.length(); i++) {
			char c = this.contraseña.charAt(i);

			if (Character.isUpperCase(c)) {
				cuentaMayusculas++;
			} else if (Character.isLowerCase(c)) {
				cuentaMinusculas++;
			} else if (Character.isDigit(c)) {
				cuentaDigitos++;
			}
		}

		return cuentaMayusculas > 2 && cuentaMinusculas > 1 && cuentaDigitos > 5;
	}

	public String generarContraseña() {
		String conjuntoContraseña = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random rnd = new Random();

		char[] password = new char[this.longitud];
		int len = conjuntoContraseña.length();
		for (int i = 0; i < this.longitud; i++) {
			password[i] = conjuntoContraseña.charAt(rnd.nextInt(len));
		}
		return new String(password);
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public int getLongitud() {
		return this.longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña();
	}
}
