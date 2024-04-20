package com;

import java.util.Scanner;

public class ciclos_6 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        int numeros = 0;
        int mayor = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);
        if (numero1 < numero2) {
        	
        	for (int i = menor; i <= mayor ; i++) {
				
				System.out.println(i);
			}
			
		}else {
			System.out.println("No se puede ordenar de menor a mayor desde un numero alto al principio");
		}
	}

}
