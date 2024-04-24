package com;

import java.util.Scanner;

public class trabajo2 {
		
		public static void main(String[] args) {
				
				Scanner entrada = new Scanner (System.in);
				int numero;
				
				System.out.println ("dijita un numero ");
				numero = entrada.nextInt();
				
				if (numero % 2 == 0) {
					System.out.println ("el numero "+numero+" es par");
				}
				else {
					System.out.println ("el numero "+numero+" es impar");
				}

}
}
