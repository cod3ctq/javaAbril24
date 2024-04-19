package com;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		// IF

		String x = "Puebla";
		/*
		 * System.out.println(x.length() > 10);
		 * 
		 * // SENTECIA IF ELSE--------- solo hay una condicion
		 * 
		 * if (x.length() > 10) { System.out.println("OK"); } else {
		 * System.out.println("Nop"); }
		 */

		// AND--------- si las 2 condiciones se cumplen es "verdadero" sino "falso"
		// TRUE TRUE : TRUE O TRUE FALSE : FALSE
		/*
		 * if (x.length() > 10 && x.equals("puebladezaragoza")) {
		 * System.out.println("OK");
		 * 
		 * } else { System.out.println("No"); }
		 */

		// OR (||)------ si se cumple una condicion u otra el resultado
		// sera"Verdadero";sino se cumplen ninguna sera "falso"
		/*
		 * if (x.length() > 10 || x.equals("Puebladezaragoza")) {
		 * System.out.println("VERDADERO");
		 * 
		 * } else { System.out.println("FALSO"); }
		 */

		// NEGACION (!)----- poner el signo despues del if y abrir nuevo parentesis
		/*
		 * if (!(x.equals("PuebladeZaragoza"))) { System.out.println("OK");
		 * 
		 * } else { System.out.println("NO"); }
		 */

		// IF ANIDADOS
		/*
		 * if (x.equals("Hola")) { System.out.println("UNO"); } else if
		 * (x.equals("HOla")) { System.out.println("DOS"); } else if (x.equals("HOLa"))
		 * { System.out.println("TRES"); } else if (x.equals("HOLA")) {
		 * System.out.println("CUATRO"); } else if (x.equals("hola")) {
		 * System.out.println("CINCO"); } else { System.out.println("NO CORRESPONDE"); }
		 */

		// SWITCH-------
/*
		switch (x) {
		case "Hola":
			System.out.println("caso 1");
			break;
		case "HOla":
			System.out.println("caso 2");
			break;
		case "HOLa":
			System.out.println("caso 3");
			break;
		case "HOLA":
			System.out.println("caso 4");
			break;
		case "hola":
			System.out.println("caso 5");
			break;
		default:
			System.out.println("NINGUNO ES IGUAL");

		}*/

		
//		Scanner sn = new Scanner(System.in);
//		System.out.println("mnsaje:");
//		
//		String m = sn.nextLine();
//		
//		System.out.println(m);
//		System.out.println("numero");
//		int d = sn.nextInt()
	}
		
}
