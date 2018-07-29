package cenfotec.ac.cr.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cenfotec.ac.cr.ks.KnowledgeSource;

public class Controller {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	KnowledgeSource ks;

	public void empezarProceso() throws NumberFormatException, IOException {
		loop();
		nextSource();
	}

	public void loop() {
		System.out.println("Realizando chequeo periodico de cambios en la pizarra...");
	}

	public void nextSource() throws NumberFormatException, IOException {
		int decision;
		System.out.println("Buscando nueva fuente de conocimiento...");
		ks = new KnowledgeSource();
		System.out.println("");
		System.out.println("Verificar si la fuente de conocimiento puede contribuir...");
		System.out.println("Revisando condicionales de la fuente de conocimento...");
		System.out.println("");
		System.out.println("Cumple con las condiciones establecidas? SI (1) ||  NO (2): ");
		System.out.println("");
		decision = Integer.parseInt(in.readLine());
		if (decision == 1) {
			System.out.println("Contribuyendo...");
			System.out.println("");
			ks.ejecutarAccion();
			System.out.println("");
			ks.update();
			System.out.println("");
		} else {
			System.out.println("El conocimiento aportado no ayudaba a la solucion del problema...");
		}

	}

}
