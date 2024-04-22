package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	
//	int[] x = new int [5];
//	
//	int[]y = {10,5,0,11,350,1,52,65,998,48,51,357,78};
//	
//	Object[] detodo = new Object[5];
	
//	detodo[0] = "ertgetg";
//	detodo[1] = true;
//	detodo[2] = 2356.2578;
//	detodo[3] = 'G';
	
	
	
//	x[0] = 110;
//	x[1] = 105;
//	x[2] = 90;
//	x[3] = 80;
//	x[4] = 70;
	
	
////	
////	
	//System.out.println(x[3]);
////		//Arrays es una clase
//    System.out.println(Arrays.toString(detodo));
////		
////	
//	
	
	// ingresar nombre por teclado en una array
	
	// escribir las bocales para que seleciones las que se encunetarn en le nombre
	
	  
	  String[] abc= {"A","B" ,"C","D"," E","F","G","H","I","J","K","L","M","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	  String cifrado = " ";
	  
	   //String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	  
	  System.out.println("Ingrese su nombre: " );
	  Scanner teclado = new Scanner(System.in);//Scanner declarado
	  String nombre = teclado.next();//Ingreso del dato por teclado
	  
		char nmb[]  = nombre.toCharArray();	//ARRAY
		//
		
		for(int i = 0; i< nmb.length; i++) {
			System.out.println("Posicion del arreglo = " + i + " : " + "[ " + nmb[i] + " ]" );
		
		//Itera sobre el abecedario	
		for (int j = 0; j < abc.length; j++) {
			
			if(nmb.equals(abc[j])) { //cuando esto se cumpla
				cifrado = cifrado + abc[j+1];	
			}
			
			
		}	
	}
		
		System.out.println(cifrado);
	
 }
}
