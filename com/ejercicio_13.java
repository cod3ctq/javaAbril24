package com;

import java.util.Scanner;

public class ejercicio_13 {

	public static void main(String[] args) {

		System.out.println("ingresa el monto de la donacion: ");
		
		Scanner teclado = new Scanner(System.in);
		
		int donacion = teclado.nextInt();
		double treinta = 0.3;
		double cincuenta = 0.5;
		double veinte = 0.2;
		double sesenta = 0.6;
		double veinticinco = 0.25;
		double quince = 0.15;
		
		if (donacion >= 10000) {
			System.out.println("se destina al centro de salud: "+ treinta*donacion);
			System.out.println("se destina al lls niños totos: "+ cincuenta*donacion);
			System.out.println("se invertia con tu tia: "+ veinte*donacion);
			
		}
		
		else  {
			System.out.println("se destina al centro de salud: "+ sesenta*donacion);
			System.out.println("se destina al lls niños totos: "+ veinticinco*donacion);
			System.out.println("se invertia con tu tia: "+ quince*donacion);
			
			
			
		}

	}

}
