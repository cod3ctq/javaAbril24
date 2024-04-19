package com;

import java.util.Scanner;

public class CompaniaDeTransporteInt {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Zonas de envio\n" + "1 América del Norte\n" + "2 América Central\n" + "3 América del Sur\n"
				+ "4 Europa\n" + "5 Asia");

		System.out.println("---------------------------");
		System.out.println("selecciona una zona");
		int zona = teclado.nextInt();

		System.out.println("---------------------------");
		System.out.println("selecciona el peso en KG");
		int peso = teclado.nextInt();

		if (peso > 5) {
			System.out.println("No puede ser transportado por cuestiones de logistica y seguridad");
		} else if (peso < 1) {
			System.out.println("El peso del paquete debe ser minimo de un 1KG");
		} else {

			switch (zona) {
			case 1:
				System.out.println("El paquete enviado a América del Norte " + "con un peso de " + peso + "kg tiene un costo de: "  + "$" + (24 * peso) + " pesos");
				break;

			case 2:
				System.out.println("El paquete enviado a América Central " + "con un peso de " + peso + "kg tiene un costo de: "  + "$" + (20 * peso) + " pesos");
				break;

			case 3:
				System.out.println("El paquete enviado a América del Sur " + "con un peso de " + peso + "kg tiene un costo de: "  + "$" + (21 * peso) + " pesos");
				break;
			case 4:
				System.out.println("El paquete enviado a Europa " + "con un peso de " + peso + "kg tiene un costo de: "  + "$" + (10 * peso) + " pesos");
				break;
			case 5:
				System.out.println("El paquete enviado a Asia " + "con un peso de " + peso + "kg tiene un costo de: "  + "$" + (18 * peso) + " pesos");
				break;
			default :
				System.out.println("ERROR - Ingrese una zona correcta");
				break;
			}
		}

	}
}
