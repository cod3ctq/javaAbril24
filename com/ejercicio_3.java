package com;

import java.util.Scanner;    //importar libreria 

public class ejercicio_3 {
	
	public static void main(String[] args) {
		
		double numero1;   //variables declaradas
		double numero2;
		double resultado;
		
		Scanner teclado = new Scanner(System.in); //metodo para ingresasr informacion por el teclado
		System.out.println("ingresa un numero");
		
		numero1=teclado.nextInt(); //ingreas y almacenar dato de entrada en la variable
		
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("ingresa un numero");
		
		numero2=teclado.nextInt();
		
		if(numero2==0) {    //condicion a cumplir
			System.out.println("numero invalido");
			
		}else {
			resultado = numero1/numero2;
			System.out.println(resultado);
		}
		
		
		
	}

}
