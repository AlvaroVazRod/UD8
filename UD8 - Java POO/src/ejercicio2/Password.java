package ejercicio2;
import java.util.Random;

public class Password {
	static Random randomizador = new Random();
	protected int longitud;
	protected int contrase�a;

	public Password() {
		this.longitud=8;
		this.contrase�a=0;
	}
	public Password(int longitud) {
		this.longitud=longitud;
		this.contrase�a=randomizador.nextInt(longitud-1);
	}
}
