package com;

import java.util.Scanner;

public class Trabajo2_entrega2 {

public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
		int num,i,multi;
		
		System.out.println("Introduce un numero ");
		num = entrada.nextInt();
		
		System.out.println("Introduce una iteracion ");
		i = entrada.nextInt();
		
		for (int j=1; j <= i; j++) {
			multi = num * i;
			System.out.println(+num+ +i+ " es: " +multi );
		}
}
}
