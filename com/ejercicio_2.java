package com;

import java.util.Scanner;

public class ejercicio_2 {
	public static void main(String[] args) {
		
		int numero1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa un numero");
		
		numero1=teclado.nextInt();
		
		//metodo para verificar si es par o impar 
		if(numero1%2==0) {
			System.out.println(" este numero es par");
	}else {
		System.out.println("este numero es impar");
	}
	}
}
