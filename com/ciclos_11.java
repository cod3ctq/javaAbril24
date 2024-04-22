package com;

import java.util.Scanner;

public class ciclos_11 {
	
	public static void main(String[] args) {
		
	

	System.out.println("Dibuja un cuadrado");
	Scanner sc = new Scanner(System.in);
	System.out.println("Teclea tamaño del cuadrado");
	int lado1 = sc.nextInt();
	
	for (int i = 0; i < lado1; i++) {
		for (int j = 0; j < lado1; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
	
}
