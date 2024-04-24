package com;

import java.util.Scanner;

public class AceptacionDeSolicitud {
	public static void main(String[] args) {

		System.out.println("Ingrese la nota");
		Scanner teclado = new Scanner(System.in);
		double nota = teclado.nextDouble();

		System.out.println("Ingrese la edad");
		Scanner teclado1 = new Scanner(System.in);
		int edad = teclado1.nextInt();

		System.out.println("Ingrese el sexo (M o F)");
		Scanner teclado2 = new Scanner(System.in);
		String sexo = teclado2.nextLine();

		if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Posible");
		} else if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Aceptada");
		} else {
			System.out.println("No aceptada");
		}
	}
}
