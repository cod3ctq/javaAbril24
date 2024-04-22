package com;

import java.util.Scanner;

public class ejercicio_6 {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int kilos;
		    double precioInicial;
		    String tipo;
		    int tamano;
		// Solicitud de datos al usuario
		  //  System.out.println("Calculo de ganancia de uva entregada:");
		    System.out.print("Introduce los Kg. de uva entregada: ");
		    kilos = sc.nextInt();
		    System.out.print("Precio por Kg. inicial: ");
		    precioInicial = sc.nextDouble();
		    System.out.print("Uva de valor \"A\" ó \"B\": ");
		    tipo = sc.next(); sc.nextLine();
		    System.out.print("Tipo de uva \"1\" ó \"2\": ");
		    tamano = sc.nextInt();
		// Realizamos Cálculos y mostramos en pantalla
		    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
		        (tamano == 1 || tamano == 2))) {
		      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
		    } else {
		      if (tipo.toUpperCase().equals("A") && tamano == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
		      } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
		        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
		      } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
		        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
		      }
		    }
		
	}

}
