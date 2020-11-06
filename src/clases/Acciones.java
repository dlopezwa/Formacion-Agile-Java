package clases;

import interfaces.SaludoInterfaz;

public class Acciones implements SaludoInterfaz{

	public Acciones() {}

	@Override
	public void despedir() {
		System.out.println("Adios!!!");
	};

}
