package interfaces;

public interface SaludoInterfaz {

	// NOVEDAD JAVA 8. Permite establecer el comportamiento de un método de la interfaz por defecto.
	// Es un comportamiento "similar" al heredar de una clase abstracta que ya implementa algún método.
	default void saludar() {
		System.out.println("Hola Mundo");
	}

	// Definición tradicional sin implementación.
	void despedir();
}
