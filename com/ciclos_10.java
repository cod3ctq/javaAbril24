package com;

import java.util.Scanner;

public class ciclos_10 {
	
	public static void main(String[] args) {
		
	    Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número. si es 0 sera valor nulo: ");
        numero = teclado.nextInt();

        while (numero != 0) {

            if (numero > 0) {
                System.out.print("Positivo");
            } else {
                System.out.print("Negativo");
            }
            if(numero % 2 == 0){
                System.out.println(" Par");
            }else{
                System.out.println(" Impar");
            }

            System.out.print("Introduce un número. si es 0 sera valor nulo: ");                                  
            numero = teclado.nextInt();
        }
		
	}

}
