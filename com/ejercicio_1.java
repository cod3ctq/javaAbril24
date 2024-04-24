package com;

import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String [] arg) {
		
		
		
		int numero1;
		int numero2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa un numero");
		
		numero1=teclado.nextInt();
		
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("ingresa un numero");
		
		numero2=teclado2.nextInt();
		
		if(numero1>numero2) {
			System.out.println(numero1 + "\tEs mayor que\t" + numero2);
			
		}else if(numero1<numero2) {
			System.out.println(numero2 + "\tEs mayor que\t" + numero1);
		}else if(numero1 == numero2) {
			System.out.println("\tLos numeros digitados son iguales\t");
		}
		
	}
}
