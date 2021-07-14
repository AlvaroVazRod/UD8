package ejercicio2;
import java.util.Random;

public class Password {
	static Random randomizador = new Random();
	protected int longitud;
	protected int contraseņa;

	public Password() {
		this.longitud=8;
		this.contraseņa=0;
	}
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseņa=randomizador.nextInt(longitud-1);
	}
}
