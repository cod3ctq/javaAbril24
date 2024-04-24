package com;

import java.util.Scanner;

public class trabajo4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String cadena;
		
		System.out.println("dijita una cadena ");
		cadena = entrada.next();
		
		if (Character.isUpperCase(cadena.charAt(0))){
		System.out.println("si es una letra mayuscula ");
		}
		else {
			System.out.println("no hay letra mayuscula ");
			
		}
		
	}

}
