package com;

import java.util.Scanner;

public class ejercicio_10 {
	
	public static void main(String[] args) {
		
		System.out.println("ingrese el numero de mes deseado");
	
		
		Scanner teclado = new Scanner(System.in);
		int mes = teclado.nextInt();
		
		if (mes >=1 && mes <=12) {
			
			switch (mes) {
			
			case 1:
				System.out.println(" Enero tiene 31 dias naturales");
			break;
			
			case 2:
				System.out.println(" Febrero tiene 28 dias naturales");
			break;
			
			case 3:
				System.out.println(" Marzo tiene 31 dias naturales");
			break;
			
			case 4:
				System.out.println(" Abril tiene 30 dias naturales");
			break;
			
			case 5:
				System.out.println(" Mayo tiene 31 dias naturales");
			break;
			
			case 6:
				System.out.println(" Junio tiene 30 dias naturales");
			break;
			
			case 7:
				System.out.println(" Julio tiene 31 dias naturales");
			break;
			
			case 8:
				System.out.println(" Agosto tiene 31 dias naturales");
			break;
			
			case 9:
				System.out.println(" Septiembre tiene 30 dias naturales");
			break;
			
			case 10:
				System.out.println(" Octubre tiene 31 dias naturales");
			break;
			
			case 11:
				System.out.println(" Noviembre tiene 30 dias naturales");
			break;
			
			case 12:
				System.out.println(" Diciembre tiene 31 dias naturales");
			break;
			
			}
			
		} else {
			System.out.println("mes no inexistente");
		}
		
		
	}

}
