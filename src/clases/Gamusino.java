package clases;

public class Gamusino {

	private String nombre;
	private int peso;
	private int altura;

	public Gamusino(String nombre, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Gamusino [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
