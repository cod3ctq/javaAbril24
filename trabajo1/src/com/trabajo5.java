package com;

import java.util.Scanner;

public class trabajo5 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner (System.in);
//		
//		int nota, sexo, edad;
//		
//		System.out.println("Ingresa tu edad: ");
//		edad = sc.nextInt();
//		
//		System.out.println("Ingresa tu nota: ");
//		nota = sc.nextInt();
//		
//		System.out.println("Ingresa tu sexo: ");
//		sexo = sc.nextInt();
//		
//		
//		
//		if ((nota >= 5) && (edad >= 18) && (sexo == 'm')) {
//			System.out.println("POSIBLE ");
//		
//		}else if ((nota >= 5) && (edad >= 18) && (sexo == 'f')) {
//			System.out.println("ACEPTADA ");	
//		
//		} else {
//			System.out.println("NO ACEPTADA ");
//		}

		
		
		    Scanner scanner = new Scanner(System.in);
		    int nota;
		    int edad;
		    String sexo;

		// Solicitud de datos al usuario
		   
		    System.out.print("Edad: ");
		    edad = scanner.nextInt();
		    System.out.print("Nota: ");
		    nota = scanner.nextInt(); scanner.nextLine();
		    System.out.print("Sexo (M o F): ");
		    sexo = scanner.nextLine();
		    
		// Realizamos Cálculos y mostramos en pantalla
		    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
		      System.out.println("El valor de sexo introducido es incorrecto.\n"
		          + "por favor, reenvíe el formulario.");
		    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
		      System.out.println("POSIBLE");
		    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
		       System.out.println("ACEPTADA");
		    }else {
		        System.out.println("NO ACEPTADA");
		    }
		    }
		  
}

