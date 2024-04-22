package com;

import java.util.Scanner;

public class Ciclos_5 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        //num teclado 2 y 10
        if (numero1 > numero2) { // num1 2 num2 10
            int temp = numero1; // temp = 2
            numero1 = numero2; // num 1 = 10 
            numero2 = temp; // num2 = 2
        }
        
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
            	System.out.println("Números pares entre " + numero1 + " y " + numero2 + " son:" +i);
            }
        }
	}

}
