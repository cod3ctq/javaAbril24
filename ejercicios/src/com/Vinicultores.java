package com;

import java.util.Scanner;

public class Vinicultores {
	public static void main(String[] args) {
		
		double precio;
		double kilo;
		String tipo;
		int tamano;
		
		System.out.println("Ingrese el precio inicial");
		Scanner teclado = new Scanner(System.in);
		precio = teclado.nextDouble();
		
		System.out.println("Ingrese los kilogramos");
		Scanner teclado1 = new Scanner(System.in);
		kilo = teclado1.nextDouble();
		
		System.out.println("Ingrese el tipo (A o B)");
		Scanner teclado2 = new Scanner(System.in);
		tipo = teclado2.nextLine();
		
		System.out.println("Ingrese el tamaño (1 o 2)");
		Scanner teclado3 = new Scanner(System.in);
		tamano = teclado3.nextInt();
		
		if (tipo.equalsIgnoreCase("A") && tamano == 1) {
			System.out.println("El precio final de la uva es de: " + (precio + 20) * (kilo) );
		} else if (tipo.equalsIgnoreCase("A") && tamano == 2) {
			System.out.println("El precio final de la uva es de: " + (precio + 30) *  (kilo));
		} else if (tipo.equalsIgnoreCase("B") && tamano == 1) {
			System.out.println("El precio final de la uva es de: " + (precio - 30) * (kilo));
		} else if (tipo.equalsIgnoreCase("B") && tamano == 2) {
			System.out.println("El precio final de la uva es de: " + (precio -50) * (kilo));
		}
		
		
		
	}

}
