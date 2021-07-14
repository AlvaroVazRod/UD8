package ejercicio2;
import java.util.Random;

public class Password {
	static Random randomizador = new Random();
	protected int longitud;
	protected int contraseña;

	public Password() {
		this.longitud=8;
		this.contraseña=0;
	}
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña=randomizador.nextInt(longitud-1);
	}
}
