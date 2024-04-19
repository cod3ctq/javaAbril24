package com;

import java.util.Scanner;

public class IndiceMasaC {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el peso: ");
		double peso = teclado.nextInt();
		//System.out.println(peso);
		System.out.println(peso*peso);
		
		System.out.println("Dame la altura: ");
		double altura = teclado.nextInt();
		System.out.println(altura);
	double imc = (peso*peso)/(altura);
	System.out.println(imc);
		//System.out.println(imc + "hola");
		
		if(imc < 16) {
			System.out.println("Criterio de ingreso en hospital");
		} else if (imc >= 16 && imc <= 17) {
			System.out.println("infrapeso");
		} else if (imc >= 17 && imc <= 18) {
			System.out.println("bajo peso");
		} else if (imc >= 18 && imc <= 25 ) {
			System.out.println("peso normal(saludable)");
		} else if (imc >= 25 && imc <= 30) {
			System.out.println("sobrepeso (obesidad de grado I)");
		} else if (imc >= 30 && imc <= 35) {
			System.out.println("sobrepeso cronico (obesidad de grado II)");
		} else if (imc >= 35 && imc <= 40) {
			System.out.println("obesidad premorbida(obesidad de grado III)");
		} else if(imc > 40) {
			System.out.println("obesidad morbida(obesidad de grado IV)");
		}
	}
}
