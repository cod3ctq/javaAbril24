package com;

import java.util.Scanner;

public class Trabajo2_entrega9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero,num2;
		
		System.out.println("agrega un numero ");
		numero = entrada.nextInt();
		
		System.out.println("agrega otro numero ");
		num2 = entrada.nextInt();
		
		
		while (numero != 0 && num2 !=0) {
			if(numero %2 ==0 && num2 !=0) {
				System.out.println("el numero " +numero+ " es par ");
			}
			else {
				System.out.println("el numero " +numero+ " es impar ");
			}
			System.out.println("agrega un numero ");
			numero = entrada.nextInt();
		}
		
		
}
}