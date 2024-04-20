package com;

import java.util.Scanner;

public class cilcos_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Teclea una edad");
		int edad = sc.nextInt();
		int suma = 0;
		int promedio = suma/edad;
		for (int i = 0; i < edad ; i++) {
			System.out.println("Ingrese otra edad" + edad);
			suma += edad + i;
			System.out.println("Termino" + suma);
		}
		
	}
}
