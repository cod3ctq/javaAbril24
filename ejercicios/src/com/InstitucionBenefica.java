package com;

import java.util.Scanner;

public class InstitucionBenefica {
	public static void main(String[] args) {
		
		System.out.println("Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños y el resto se invierte en la bolsa.\r\n"
				+ "Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños y el resto se invierte en la bolsa.\r\n"
				+ "");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el monto de la donacion");
		double donacion = teclado.nextDouble();
		
		double porcentaje = 0.30;
		double porcentaje1 = 0.50;
		double porcentaje2 = 0.20;
		
		double porcentaje3 = 0.25;
		double porcentaje4 = 0.60;
		double porcentaje5 = 0.15;
		
		if (donacion >= 10000) {
			System.out.println("se destina al centro de salud " + porcentaje*100 + " % que es igual a: "+ donacion*porcentaje);
			System.out.println("se destina al comedor de ninis " + donacion*porcentaje1);
			System.out.println("se invertira en la bolsa " + donacion*porcentaje2);
		} else {
			System.out.println("se destina al centro de salud " + donacion*porcentaje3);
			System.out.println("se destina al comedor de ninis " + donacion*porcentaje4);
			System.out.println("se invertira en la bolsa " + donacion*porcentaje5);
		}
		
		
	}
}
