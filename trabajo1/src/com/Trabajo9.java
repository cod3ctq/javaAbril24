package com;

import java.util.Scanner;

public class Trabajo9 {
	 public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			
			int dia;
			
			System.out.println("Agrega un dia de la semana del 1 al 7: ");
			dia = entrada.nextInt();
			
			switch (dia) {
			case 1: 
				System.out.println("El dia 1 es: lunes ");
				break;
			case 2: 
				System.out.println("El dia 2 es: martes ");
				break;
			case 3: 
				System.out.println("El dia 3 es: miercoles ");
				break;
			case 4: 
				System.out.println("El dia 4 es: jueves ");
				break;
			case 5: 
				System.out.println("El dia 5 es: viernes ");
				break;
			case 6: 
				System.out.println("El dia 6 es: sabado ");
				break;
			case 7: 
				System.out.println("El dia 7 es: domingo ");
				break;
				default: 
					System.out.println("Error ");
				
				
			}
			
			
}
}

