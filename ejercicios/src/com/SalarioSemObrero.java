package com;

import java.util.Scanner;

public class SalarioSemObrero {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese las horas trabajadas en esta semana ");
		int horastrabajadas = teclado.nextInt();
		//System.out.println(horastrabajadas);
		int difehoras = horastrabajadas-40;
		//System.out.println(difehoras);
		int base= 640;
		
		if (horastrabajadas<= 40 ) { 
			
			System.out.println("La paga por la semana trabajada es de " +(horastrabajadas * 16) );
			
		} else if(horastrabajadas > 40 ) {
			
			System.out.println("La paga por la semana trabajada es de " + ((horastrabajadas - 40)*(20 ) + base) + " por " + horastrabajadas + " horas");
		}
				
	}

}
