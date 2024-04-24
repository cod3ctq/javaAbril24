package com;

import java.util.Scanner;

public class ejercicio_9 {
	
	public static void main(String[] args) {
		
		System.out.println("ingresa el numero de día que deseas observar");
		
		//solicitamos datos y hacemos uso de scaner
		Scanner teclado = new Scanner(System.in);
		int dia = teclado.nextInt();
		
		
		if (dia >=1 && dia <=7) {
			
			switch(dia) {
			
			case 1:
				System.out.println("el dia seleccionado es Lunes");
			break;
			
			case 2:
				System.out.println("el dia seleccionado es Martes");
			break;
			
			case 3:
				System.out.println("el dia seleccionado es Miercoles");
			break;
			
			case 4:
				System.out.println("el dia seleccionado es Jueves");
			break;
			
			case 5:
				System.out.println("el dia seleccionado es Viernes");
			break;
			
			case 6:
				System.out.println("el dia seleccionado es Sabado");
			break;
			
			case 7:
				System.out.println("el dia seleccionado es Domingo");
			break;
			
			
			}
			
		}else {
			System.out.println("numero invalido");
		}
		
		
		
		
		
		
		
	}

}
