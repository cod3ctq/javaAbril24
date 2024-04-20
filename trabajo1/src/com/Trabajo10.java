package com;

import java.util.Scanner;

public class Trabajo10 {
	 public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			
			int mes;
			
			System.out.println("Agrega un numero de mes entre 1-12 ");
			mes= entrada.nextInt();
			
			if (mes == 1 || mes ==3 || mes==5 ||mes ==7 || mes==8 || mes== 10 || mes==12) {
				System.out.println("El mes " +mes+ " tiene 31 dias ");
			} else if (mes==2) {
				System.out.println("El mes " +mes+ " tiene 28 o 29 dias ");
			} else if (mes==4 ||mes==6 ||mes==9 || mes==11) {
				System.out.println("El mes " +mes+ " tiene 30 dias " );
			} else {
				System.out.println("Error ");
			}
			

}
}
