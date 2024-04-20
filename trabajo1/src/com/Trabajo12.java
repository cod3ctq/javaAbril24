package com;

import java.util.Scanner;

public class Trabajo12 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double peso, altura,imc;
		 
		System.out.println("Agrega tu peso ");
		peso = entrada.nextDouble();	
		
		System.out.println("Agrega tu altura ");
        altura = entrada.nextDouble();
       
        imc = Math.round((peso) / ((altura*altura)));
       
        
        if (imc < 16) {
        	System.out.println("Diagnostico: Criterio de ingreso en hospital, valor: "+imc);
        } else if (imc >= 16 && imc <=17) {
        	System.out.println("Diagnostico: Infrapeso Valor IMC: "+imc);
        } else if (imc >= 17 && imc <=18) {
        	System.out.println("Diagnostico: Bajo peso Valor IMC: "+imc);
        } else if (imc >= 18 && imc <=25) {
        	System.out.println("Diagnostico: Peso normal (Saludable) Valor IMC: "+imc);
        } else if (imc >= 25 && imc <=30) {
        	System.out.println("Diagnostico: Sobrepeso (Obesidad de grado 1) Valor IMC: "+imc);
        } else if (imc >= 30 && imc <=35) {
        	System.out.println("Diagnostico: Sobrepeso cronico (Obesidad de grado 2) Valor IMC: "+imc);
        } else if (imc >= 35 && imc <=40) {
        	System.out.println("Diagnostico: Obesidad premorbida (Obesidad de grado 3) Valor IMC: "+imc);
        } else if (imc > 40) {
        	System.out.println("Diagnostico: Obesidad morbida (Obesidad de grado 4) Valor IMC: "+imc);
        }
        
       
	}
}


        
	
	
	
	
	
	
	
	
	
