package com;

import java.util.Scanner;

public class Ejercicio_14 {
	
	public static void main(String[] args) {
		
		System.out.println("ingresa el nuemero de horas trabajadas");
		
		Scanner teclado = new Scanner(System.in);
		
		int horas = teclado.nextInt();
		int dif = horas-40;
		
		if (horas <=40) {
			
			System.out.println("el calculo de tus horas trabajadas es: "+ horas*16);
			
		}
		else { 
			System.out.println("el calculo de tus horas trabajadas es: " + (dif*(20)+(640)));
			
		}
		


		
		
		
		
	}

}
