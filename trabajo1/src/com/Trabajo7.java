package com;

import java.util.Scanner;

public class Trabajo7 {
    public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int alumnos;	
		
	System.out.println("Agrega numero de alumnos: ");
	alumnos = entrada.nextInt();
	
	if (alumnos >= 100) {
		alumnos = alumnos * 65;
		System.out.println("El costo por cada alumnos es de 65 y el costo total es: " +alumnos);
	
	} else if ( alumnos >= 50 && alumnos <= 99) {
		alumnos = alumnos * 70;
	System.out.println("El costo por cada alumnos es de 70  y el costo total es: " +alumnos);
	
	} else if (alumnos >= 30 && alumnos <= 49) {
		alumnos = alumnos * 95;
		System.out.println("El costo por cada alumnos es de 95 y el costo total es: " +alumnos);
	}
	else {
		double precio = 4000/alumnos;
		System.out.println("El costo por cada alumnos es: " +precio);
	}
	}
		
		
		
		

}

