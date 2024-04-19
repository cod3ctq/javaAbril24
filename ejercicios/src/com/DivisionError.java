package com;

import java.util.Scanner;

public class DivisionError {
	public static void main(String[] args) {

		System.out.println("Dame un numero");
		Scanner teclado = new Scanner(System.in);
		double numero = teclado.nextDouble();

		System.out.println("Dame otro numero");
		Scanner teclado1 = new Scanner(System.in);
		double numero1 = teclado.nextDouble();

		if (numero1 == 0) {
			System.out.println("Error no se puede dividir el numero entre cero");
		} else {
			double resultado = numero / numero1;
			System.out.println("El resultado es: " + resultado);
		}
	}

}
