package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Primero_3 {

	public static void main(String[] args) {
		
		
		//filas, columnas
//		int[][] matriz1 = new int[5][3];//matriz vacia
//		
//		int[][] matriz2= {{3,5,3},{5,4,8},{9,8,7},{12,45,6}};
//		
		//System.out.println(Arrays.deepToString(matriz1));
		
		
//		for( int i= 0; i< matriz1.length; i++ ) {
//			for (int k = 0; k < matriz2[i].length; k++) {
//				
//				System.out.println("Fila: "+i+"columnas: " + k +  matriz2[i][k]);
//				
//				
//			}
//			
//			
//		}
		
		
		
		//Declarar y llenar 2 matrices (n,n) del tipo String
		//Numeros y letras al azar 
		//Matriz de resultados (int) 
	
		//A(0,0) - B(0,0)
	
		
		String[][] cadenas0 = { { "3", "p", "5" },
				                { "9", "u", "7" }, 
				                { "7", "8", "l" }, 
				                { "j", "12", "n" } };
		
		String[][] cadenas1 = {{"3","p","5"},
				              {"9","u","7"},
				              {"7","8","l"},
				              {"j","12","n"}};
		
	 int[][] convInt = new int[cadenas0.length][cadenas0.length];
	 
	 int numA = 0;
	 int numB = 0;
	 String numeros = "1234567890";
	 
	 
	 for (int i = 0; i < cadenas0.length; i++) {
		 
		 for (int j = 0; j < cadenas1[i].length; j++) {
			
			 if(numeros.indexOf(cadenas0[i][j])>=0 && numeros.indexOf(cadenas1[i][j])>=0){
				 
				 numA = Integer.parseInt(cadenas0[i][j]);
				 numB = Integer.parseInt(cadenas1[i][j]);
				 convInt[i][j] = numA+numB;
			 }else {
				 convInt[i][j] = 0;
			 }
			
			 
			 
			 /* 
			  * try{
			  *  numA = Integer.parseInt(cadenas0[i][j]);
				 numB = Integer.parseInt(cadenas1[i][j]);
				 convInt[i][j] = numA+numB;
			  * }catch(Exception ex){
			  * 
			  * ex.printStackTrace();
			  * resultado[i][i] = 0;
			  * System.out.println(" Errore Correction");		  * 
			  * }
			  * */
			 
		}
		
	}
	 
	 System.out.println(Arrays.deepToString(convInt));
	 
	 
		
	}
	
}



