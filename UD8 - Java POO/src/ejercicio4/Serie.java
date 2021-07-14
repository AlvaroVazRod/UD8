package ejercicio4;

public class Serie {
	protected static int temporada = 3;
	protected static boolean entrega;
	protected String titulo;
	protected int numeroTemporadas;
	protected boolean entregado;
	protected char genero;
	protected String creador;

	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = temporada;
		this.entregado = entrega;
		this.genero = ' ';
		this.creador = "";
	}
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = temporada;
		this.entregado = entrega;
		this.genero = ' ';
		this.creador = creador;
	}
	public Serie ( String titulo,int numeroTemporadas, char genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entrega;
		this.genero = genero;
		this.creador = creador;
	}
}
