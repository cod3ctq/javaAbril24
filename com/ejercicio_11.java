package com;

import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Calcula la tarifa para el envío según peso y zona de destino.");
		System.out.println("Zonas de envío:");
		System.out.println("1.- América del Norte");
		System.out.println("2.- América Central");
		System.out.println("3.- América del Sur");
		System.out.println("4.- Europa");
		System.out.println("5.- Asia");

		/*
		 * ZONA UBICACIÓN COSTO/KILOGRAMO 
		 * 1 América del Norte 24.00 euros 
		 * 2 América Central 20.00 euros 
		 * 3 América del Sur 21.00 euros 
		 * 4 Europa 10.00 euros 
		 * 5 Asia 18.00 euros
		 */
		int zona;
		double peso;

		System.out.println("ingresa el peso en kilogramos de tu paque:");
		peso = teclado.nextInt();
		
		if (peso >5 || peso <1 ) {
			System.out.println("peso no permitido" );
		} else {
			System.out.println("ingresa la zona de envio");
			zona = teclado.nextInt();
			switch (zona) {

			case 1:
				System.out.println("El costo de envio de " + peso
						+ " Kg del paquete a la zona de America del norte es de:" + peso * 24);
				break;
				
			case 2:
				System.out.println("El costo de envio de " + peso
						+ " Kg del paquete a la zona de América Central es de:" + peso * 20);
				break;
				
			case 3:
				System.out.println("El costo de envio de " + peso
						+ " Kg del paquete a la zona de America del sur es de:" + peso * 21);
				break;
				
			case 4:
				System.out.println("El costo de envio de " + peso
						+ " Kg del paquete a la zona Europa es de:" + peso * 10);
				break;
				
			case 5:
				System.out.println("El costo de envio de " + peso
						+ " Kg del paquete a la zona de Asia es de:" + peso * 18);
				break;
				
			}
			
		}

	}

}
