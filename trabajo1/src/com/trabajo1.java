package com;

import java.util.Scanner;

public class trabajo1 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int numero1,numero2;
		
		System.out.println("dijita un numero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("dijita un numero: ");
		numero2 = entrada.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("son numero iguales");
		
		}else if (numero1 > numero2) {
			System.out.println("el numero mayor es: " +numero1);
		}else if  (numero2 > numero1) {
			System.out.println("el numero mayor es: " +numero2);
		}
		}
		
	}

