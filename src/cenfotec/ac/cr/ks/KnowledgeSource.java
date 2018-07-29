package cenfotec.ac.cr.ks;

import cenfotec.ac.cr.patrones.Pizarra;

public class KnowledgeSource implements Pizarra {

	@Override
	public void inspect() {
		System.out.println("Inspeccionando pizarra");

	}

	@Override
	public void update() {
		System.out.println("Actualizando pizarra");

	}
	
	public void ejecutarAccion() {
		System.out.println("Ejecutando accion...");
	}

}
