package com;

import java.util.Scanner;

public class MayorIgual {
	public static void main(String[] args) {

		// Objetos de tipo Scanner para pedir datos en consola
		System.out.println("Dame un numero");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();

		System.out.println("Dame otro numero");
		Scanner teclado1 = new Scanner(System.in);
		int numero1 = teclado.nextInt();

		if (numero > numero1) {
			System.out.println("El numero 1 es mayor");
		} else if (numero < numero1) {
			System.out.println("El numero 2 es mayor");
		} else {
			System.out.println("Los numero son iguales");
		}
	}

}
