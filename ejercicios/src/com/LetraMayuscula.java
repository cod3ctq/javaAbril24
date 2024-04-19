package com;

import java.util.Scanner;

public class LetraMayuscula {
	public static void main(String[] args) {

		System.out.println("Escribe una cadena de caracteres");
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();

		if (texto.length() != 1) {
			System.out.println("La cadena no es una letra mayúscula");
		} else if ((texto.compareTo("A") >= 0) && (texto.compareTo("Z") <= 0)) {
			System.out.println("La cadena es una letra mayúscula.");
		} else {
			System.out.println("La cadena no es una letra mayúscula.");
		}
	}
}
