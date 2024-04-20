package com;

import java.util.Scanner;

public class ejercicio_7 {
	
	public static void main(String[] args) {
	 
		
		Scanner teclado  = new Scanner(System.in);
		
		int numeroalumnos = 0;
		
		//pedimos ingresar los datos
		System.out.println("Numero de alumnos: ");
		numeroalumnos = teclado.nextInt();
		
		
		//creamos la condicion 
		
		if (numeroalumnos >= 100) {
			System.out.println("el costo de boleto por alumno es de 65 pesos");
			
			}else if (numeroalumnos <100 && numeroalumnos >=50) {
				System.out.println("el cosoto del boleto por alumno es de 70 pesos");
				
			}else if (numeroalumnos <50 && numeroalumnos >=30) {
				System.out.println("el costo de boleto por alumno es de 95 pesos");
				
			}else {
				System.out.println("el costo de la renta del autobus sera de $4000");
			}
		
		
		
		
		
		
		
		
		
	}

}
