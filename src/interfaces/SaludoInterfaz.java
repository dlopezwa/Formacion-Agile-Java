package interfaces;

public interface SaludoInterfaz {

	// NOVEDAD JAVA 8. Permite establecer el comportamiento de un m�todo de la interfaz por defecto.
	// Es un comportamiento "similar" al heredar de una clase abstracta que ya implementa alg�n m�todo.
	default void saludar() {
		System.out.println("Hola Mundo");
	}

	// Definici�n tradicional sin implementaci�n.
	void despedir();
}
