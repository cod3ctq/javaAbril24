package com;

import java.util.Iterator;

public class ejercicio_clase {

	public static void main(String[] args) {
		
		//todas las variables 

		String datos = "3245fc23v45Tnji8712y80945(/I%&56vecw5¿90'¿89.0¨)=.ioñloi1251325.09¨?9´'076";
		String numeros = "0123456789";
		String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String contenedor = "";
		int sumatoria = 0;
		int contador1 = 0;
		int contador2 = 0;
		double promedio = 0.0;
		int numeroActual = 0;

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		int n7 = 0;
		int n8 = 0;
		int n9 = 0;
		int n0 = 0;

		for (int i = 0; i < datos.length(); i++) {
			contenedor = Character.toString(datos.charAt(i));
			if (numeros.indexOf(contenedor) >= 0) { // Si es un numero...
				contador1++;

				numeroActual = Integer.parseInt(contenedor);
				sumatoria = sumatoria + numeroActual;

				switch (numeroActual) {

				case 1:
					n1++;
					break;
				case 2:
					n2++;
					break;
				case 3:
					n3++;
					break;
				case 4:
					n4++;
					break;
				case 5:
					n5++;
					break;
				case 6:
					n6++;
					break;
				case 7:
					n7++;
					break;
				case 8:
					n8++;
					break;
				case 9:
					n9++;
					break;
				case 0:
					n0++;
					break;

				}

			} else if (abc.indexOf(contenedor) >= 0) {
				contador2++;
			}

		}
		promedio = (sumatoria / contador1);
		System.out.println("promedio es: " + promedio);
	}

}