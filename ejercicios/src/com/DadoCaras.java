package com;

import java.util.Scanner;

public class DadoCaras {
	public static void main(String[] args) {

		//String dadoLetras = "uno,dos,tres,cuatro,cinco";
		

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero de la cara del dado");
		int entradaDado = teclado.nextInt();

		
		
		switch (entradaDado) {
		case 1:
			System.out.println("La cara opuesta de 1 es seis");
			break;
		case 2:
			System.out.println("La cara opuesta de 2 es cinco");
			break;
		case 3:
			System.out.println("La cara opuesta de 3 es cuatro");
		case 4:
			System.out.println("La cara opuesta de 4 es tres");
			break;
		case 5:
			System.out.println("La cara opuesta de 5 es dos");
			break;
		case 6:
			System.out.println("La cara opuesta de 6 es uno");
			break;
		default:
			System.out.println("numero incorrecto");
		}

	}
}
