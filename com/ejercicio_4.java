package com;

import java.util.Scanner;

public class ejercicio_4 {
	public static void main(String[] args) {
		String cadena;
		
		System.out.println("Ingrese frase");
		Scanner frase = new Scanner(System.in);
		cadena= frase.next();
		
		// el isUpperCase lee la cadena 
		//el charArt detecta el numero de mayusculas que detecta en la cadena
		if(Character.isUpperCase(cadena.charAt(0))) {
			System.out.println("hay mayusculas");
		}else {
			System.out.println("no hay mayusculas");
		}
	}

}
