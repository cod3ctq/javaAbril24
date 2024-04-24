package com;

import java.util.Arrays;
import java.util.Iterator;

public class Principal_2 {
	
	public static void main(String[] args) {
		
		 int conversion;
		  int parInpar;
		  //[impar,impar,par,]
		
		String numeros = "73,4565,4,64,356,237,654073,90,576";
		  
		  String[] resultados = new String[9];
		  
	      
		  
		  String[] separacion = numeros.split(",");
		  
	System.out.println(Arrays.toString(separacion));
		  
	for(int i = 0; i< separacion.length; i++) {
		
		parInpar = Integer.parseInt(separacion[i]);
		

		
		if(parInpar%2 == 0) {
			resultados [i] = "Par";
		}else {
			resultados [i] = "Impar";	
		}
		
		//System.out.println(resultados [i]);
				
	}
	
    System.out.println(Arrays.toString(resultados));
	
		  
//		  for(String separacion1 : separacion) {
//			  System.out.println(separacion1+ " ");
//			  
//			  conversion = Integer.parseInt(separacion1);
//			  System.out.println("Numeros separados y ingresados por letras " + conversion);
//
//			  for (int i = 0; i < separacion1.length(); i++) {
//					
//				  parInpar = 
//				}
//			  
//		  }
		  
		 
		  
	}

}
