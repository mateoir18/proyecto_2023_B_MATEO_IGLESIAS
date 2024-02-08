package series;

public class Serie implements Entregable {

	private String titulo;
	private int n_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo = "";
		this.n_temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.n_temporadas = 3;
		this.entregado = false;
		this.genero = "";
	}

	public Serie(String titulo, int n_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.n_temporadas = n_temporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getN_temporadas() {
		return n_temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setN_temporadas(int n_temporadas) {
		this.n_temporadas = n_temporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie{" + "titulo='" + titulo + '\'' + ", n_temporadas=" + n_temporadas + ", entregado=" + entregado
				+ ", genero='" + genero + '\'' + ", creador='" + creador + '\'' + '}';
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
}
