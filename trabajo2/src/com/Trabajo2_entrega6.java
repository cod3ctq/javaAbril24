package com;



public class Trabajo2_entrega6 {
public static void main(String[] args) {
		


		int inicial = 1000, guardar;
		int i = 0;
		
		
		while (i < 13) {
		guardar = inicial * 2 / 100;
		guardar = guardar + inicial;
		guardar = guardar * i;
		i++;
		
		System.out.println("Al cabo de " +i+ " meses se tiene la cantidad de dinero de: "+guardar);
		}
		
					
}
}