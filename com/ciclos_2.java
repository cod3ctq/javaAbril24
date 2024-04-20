package com;

import java.util.Scanner;

public class ciclos_2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero para iniciar la tabla de multiplicar:");
        int numero1 = scanner.nextInt();
        System.out.print("Hasta que numero desea multiplicar el " + numero1+":");
        int numero2 = scanner.nextInt();
        String n1 = Integer.toString(numero1);
        int resultado = 0;
        //System.out.print("Hasta que numero desea multiplicar el " + numero1+":");
        for (int i = 1; i <= numero2; i++) {
			resultado = i*numero1;
			System.out.println(i+"*"+n1+"="+resultado);
		}
	}

}
