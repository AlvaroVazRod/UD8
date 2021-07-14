package ejercicio1;

public class Persona {
	static final char hombre = 'H';
	protected String nombre;
	protected int edad;
	protected String DNI;
	protected char sexo;
	protected int peso;
	protected int altura;
	protected void comprobarSexo(char sexo) {
		sexo = Character.toUpperCase(sexo);
		char sexodif[] = {'H','M'};
		boolean sexoCorrecto = false;
		for (int i = 0; i < sexodif.length && !sexoCorrecto; i++) {
			if (sexodif[i]==sexo) {
				sexoCorrecto = true;
			}
		}
		if (sexoCorrecto) {
			this.sexo=sexo;
		}else {
			this.sexo=hombre;
		}
	}
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.sexo = hombre;
		this.peso = 0;
		this.altura = 0;
	}
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.DNI = "";
		this.peso = 0;
		this.altura = 0;
	}
	public Persona (String nombre, int edad,String DNI, char sexo, int peso, int altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.DNI = DNI;
		this.peso = peso;
		this.altura = altura;
	}

}
