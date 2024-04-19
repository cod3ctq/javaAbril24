package com;

import java.util.Scanner;

public class ParOimpar {
	public static void main(String[] args) {

		System.out.println("Dame un numero");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El numero es par");

		} else {
			System.out.println("El numero es impar");
		}

	}

}
