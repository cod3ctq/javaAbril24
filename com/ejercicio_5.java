package com;

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		
		int  edad;
		char sexo;   //declaracion de variables 
		int nota;
		
		System.out.println("Ingresa tu Edad");
		Scanner edad1 = new Scanner(System.in); //ingreso de dato
		
		edad = edad1.nextInt(); //almacenamiento de dato en la variable
		
		System.out.println("Ingresa tu Sexo");
		Scanner sexo1 = new Scanner(System.in);
		//el scanner revisa lo que uno teclea 
		
		
		//charAt solo lee un carater o letra
		sexo = sexo1.next().charAt(0);
		
		System.out.println("Ingresa tu nota");
		Scanner nota1 = new Scanner(System.in);
		
		
		nota = nota1.nextInt();
		
		if (nota >= 5 && edad >= 18 && sexo == 'M') {
			System.out.println("Solicitud posiblemete Aceptada");
		}else if (nota >= 5 && edad >= 18 && sexo == 'F'){
			System.out.println("Solicitud Aceptada");
		} else {
			System.out.println("Solicitud Denegada");
		}
		
		
		
//		if ( edad>=18) {
//			System.out.println("Dato Correcto");
//			
//		}else {
//			System.out.println("Dato Correcto");
//		}
	}
}
