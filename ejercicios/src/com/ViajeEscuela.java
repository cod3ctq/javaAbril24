package com;

import java.util.Scanner;

public class ViajeEscuela {
	public static void main(String[] args) {
		
		System.out.println("COMPAÑIA DE VIAJES\r\n"
				+ "La forma de cobrar es la siguiente:\r\n"
				+ "* Si son 100 alumnos o más, el costo por cada alumno es de 65 pesos.\r\n"
				+ "* De 50 a 99 alumnos, el costo es de 70 pesos.\r\n"
				+ "* De 30 a 49 alumnos, el costo es de 95 pesos.\r\n"
				+ "* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 pesos, sin importar el número de alumnos.\r\n"
				+ "");
		 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un el numero de alumnos");
		double alumnos = teclado.nextDouble();
		
		if (alumnos >= 100) {
			System.out.println("La cantidad de alumnos es de " + alumnos + " y el precio total es de " + "$" +(alumnos*65) + " pesos");
		} else if(alumnos >= 50 && alumnos <= 99) {
			System.out.println("La cantidad de alumnos es de " + alumnos + " y el precio total es de " + "$" +(alumnos*70) + " pesos");
		} else if(alumnos >= 30 && alumnos <= 49) {
			System.out.println("La cantidad de alumnos es de " + alumnos + " y el precio total es de " + "$" +(alumnos*95) + " pesos");
		} else {
			System.out.println("Hay menos de 30 alumnos y el precio por cada uno es de " + "$" +(4000/alumnos) + " pesos");
		}
	}
}
