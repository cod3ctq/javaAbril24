package com;

import java.util.Scanner;

public class trabajo3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double division, numero1,numero2,resultado;
		
		System.out.println ("dijita un numero ");
		numero1 = entrada.nextInt();
		
		System.out.println ("dijita otro numero ");
		numero2 = entrada.nextInt();
		
		if (numero2 ==0) {
			System.out.println ("error en la operacion " );
		}
		else {
			division = numero1 / numero2;
			System.out.println ("el resultado es " +division);
		}

		

}
}
