package com;

public class principal {

	public static void main(String[] args) {

		// IF ------ (SI SE CUMPLE LA CONDICION)

		String x = "holA";
		/*
		 * System.out.println(x.length() > 10);
		 * 
		 * // SENTENCIA IF ELSE ---- (UNA SOLA CONDICION) if (x.length() > 10) {
		 * System.out.println("OK"); } else { System.out.println("NO");
		 * 
		 * }
		 */

		// AND --- (SI LAS DOS CONDICIONES SE CUMPLEN ES VERDADERO, UNA O NINGUNA ES
		// FALSO)
		/*
		 * if (x.length() > 10 && x.equals("puebladezaragoza")) {
		 * System.out.println("OK");
		 * 
		 * } else { System.out.println("NO"); }
		 */

		// OR (||) ---DEBE CUMPLIR UNA U OTRA CONDICION Y SERA VERDADERO (>10=letras de
		// la variable)
		/*
		 * if (x.length() > 10 || x.equals("puebladezaragoza")) {
		 * System.out.println("VERDADERO");
		 * 
		 * } else { System.out.println("FALSO"); }
		 */

		// NEGACION ----- (SIGNO ! DESPUES DE IF Y ABRIR NUEVO PARENTES)
		/*
		 * if (!(x.equals("Puebla"))) { System.out.println("OK");
		 * 
		 * } else { System.out.println("NO"); }
		 */

		// IF ANIDADOS ---- ENCUENTRA LA VARIABLE CORRECTA ENTRE TODAS LAS OPCIONES
		/*
		 * if (x.equals("HOLA")) { System.out.println("uno");
		 * 
		 * } else if (x.equals("HOLa")) { System.out.println("dos");
		 * 
		 * } else if (x.equals("HOla")) { System.out.println("tres");
		 * 
		 * } else if (x.equals("Hola")) { System.out.println("cuatro");
		 * 
		 * } else if (x.equals("hola")) { System.out.println("cinco"); } else {
		 * System.out.println("No corresponde"); }
		 */

		// SWITCH ------- ENCUENTRA LA PRIMER VARIABLE CORRECTA

		switch (x) {
		case "HOLA":
			System.out.println("caso 1");
			break;
		case "HOLa":
			System.out.println("caso 2");
			break;
		case "HOla":
			System.out.println("caso 3");
			break;
		case "Hola":
			System.out.println("caso 4");
			break;
		case "hola":
			System.out.println("caso 5");
			break;
		default:
			System.out.println("Ninguno es igual");
		}
	}
}