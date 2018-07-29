package cenfotec.ac.cr.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cenfotec.ac.cr.controller.Controller;

public class Main {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static Controller mainController = new Controller();

	public static void main(String[] args) throws Exception {
		int opc;

		do {
			mostrarMenu();
			opc = leerOpcion();
			ejecutarAccion(opc);
		} while (opc != 2);
	}

	public static void mostrarMenu() throws IOException {

		System.out.println();
		System.out.println("------  1.    CORRER PROCESO  -----");
		System.out.println("------  2.         SALIR      -----");
	}

	public static int leerOpcion() throws IOException {

		int opcion;

		System.out.println("Seleccione accion a realizar");
		opcion = Integer.parseInt(in.readLine());

		return opcion;
	}

	public static void ejecutarAccion(int pOpcion) throws Exception {

		switch (pOpcion) {

		case 1:
			mainController.empezarProceso();
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			break;

		default:
			System.out.println("Opcion invalida");

		}

	}

}
