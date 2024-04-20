package com;

import java.util.Scanner;

public class Ciclos_3 {
	
	public static void main(String[] args) {
		
//		System.out.println("introduce una palabra");
//		
//		Scanner teclado = new Scanner(System.in);  
//				
//		String palabra = teclado.nextLine().toLowerCase();
//		
//		
//		for (int i = 0; i < palabra.length(); i++) {
//			
//			for (int j = 0; j >palabra.length();j--) {
//				
//				if (palabra(i) == palabra(j)) {
//					
//					System.out.println("el tipo de palabra es palindromo " + palabra);
//					
//				}else {
//					System.out.println("el tipo de palabra no es palindromo "+ palabra);
//				}
//				
//			}
//			
//		}
		
		System.out.println("Introduce una palabra: ");
		
		 Scanner teclado = new Scanner (System.in);
		    
		    String palabra = teclado.nextLine().toLowerCase();
		    
		    
		     String reverso = "";
		        
		        for (int i = palabra.length() - 1; i >=0; --i) {
		//concatemas desde el ultimo indice hasta el primero para obtener la palabra invertida
		              reverso = reverso + palabra.charAt(i);
		          }
		    
		        if (palabra.equals(reverso)) {
		          System.out.println(palabra + " es palindromo");
		        }
		        else {
		          System.out.println(palabra + " no es palindromo");
		        }
		
	
		
	
		
		
	}

}
