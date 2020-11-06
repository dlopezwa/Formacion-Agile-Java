import clases.Acciones;
import interfaces.SaludoInterfaz;

public class Ejemplo1App{

	public static void main(String[] args) {
		Acciones accion = new Acciones();

		// La clase Accion implementa ina interfaz que tiene un comportamiento por defecto para el método saludar.
		accion.saludar();
		accion.despedir();
	}

}
