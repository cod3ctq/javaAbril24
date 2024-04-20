package com;

import java.util.Scanner;

public class ejercicio_8 {
	
	public static void main(String[] args) {
		
		System.out.println("ingrese un numero del 1 al 6");
		
		Scanner teclado = new Scanner(System.in);
		int dado = teclado.nextInt();
		
		
		//System.out.println("cara obtenida de dado");
		
		if (dado >=1 && dado <= 6) {
			
			
			
			//se hace uso de switch para comparar varios casos
			switch (dado) {
			
			    case 1:
				    System.out.println("la cara opuesta al uno es el seis");
				break;
				
			    case 2:
			    	System.out.println("la cara opuesta al dos es el cinco");
			    break;
			    
			    case 3:
			    	System.out.println("la cara opuesta al tres es el cuatro");
			    break;
			    
			    case 4:
			    	System.out.println("la cara opuesta al cuatro es el tres");
			    break;
			    
			    case 5:
			    	System.out.println("la cara opuesta al cinco es el dos");
			    break;
			    
			    case 6:
			    	System.out.println("la cara opuesta al seis es el uno");
			    
			
			
			}
			
		}else {
			System.out.println("numero invalido");
		}
		
		
		
		
	}

}
