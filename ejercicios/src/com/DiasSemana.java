package com;

import java.util.Scanner;

public class DiasSemana {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero correspondiente a un dia de la semana entre 1 y 7");
		int dia = teclado.nextInt();

		switch (dia) {
		case 1:
			System.out.println("1 es igual a Lunes");
			break;
		case 2:
			System.out.println("2 es igual a Martes");
			break;
		case 3:
			System.out.println("3 es igual a Miercoles");
			break;
		case 4:
			System.out.println("4 es igual a Jueves");
			break;
		case 5:
			System.out.println("5 es igual a Viernes");
			break;
		case 6:
			System.out.println("6 es igual a Sabado");
			break;
		case 7:
			System.out.println("7 es igual a Domingo");
			break;
		default:
			System.out.println("Error ingresa un numero entre 1 y 7");

		}
	}
}
