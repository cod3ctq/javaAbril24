package com;

import java.util.Scanner;

public class trabajo6 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		int precio,tamaño;
		String tipo;
		
		System.out.println("agrega precio inicial ");
		precio = entrada.nextInt();
		
		System.out.println("agrega tipo de uva ");
		tipo = entrada.next();
		
		System.out.println("agrega tamaño de uva ");
		tamaño = entrada.nextInt();
		
	    if (!((tipo .toUpperCase().equals("A") || tipo.toUpperCase().equals("B") && (tamaño ==1 || tamaño == 2)))) {
	    	System.out.println("Incorrecto ");
	    } else {
	    	if (tipo.toUpperCase().equals("A") && tamaño == 1) {
	    			precio = precio + 20;
	    			System.out.println("El precio final es: " +precio);
	    } else if (tipo.toUpperCase().equals("A") && tamaño == 2) {
	    	precio = precio + 30;
	    	        System.out.println("El precio final es: " +precio);
	    } else if (tipo.toUpperCase().equals("B") && tamaño == 1) {
	    	precio = precio - 30;
	    	        System.out.println("El precio final es: " +precio);
	    } else if (tipo.toUpperCase().equals("B") && tamaño == 2) {
	    	precio = precio - 50;
	    	        System.out.println("el precio final es: " +precio);
	    	
	    }
	   
	    }
	}
}


