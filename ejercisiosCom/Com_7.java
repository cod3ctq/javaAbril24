package ejercisiosCom;

import java.util.Scanner;

public class Com_7 {
public static void main(String[] args) {
	
	int alumnos = 0;
	int total = 0;
	int porAlumnos = 0;
	
	Scanner x = new Scanner(System.in);
	
	System.out.println("Ingrese cuantos alumnos estaran llendo al vieaje: ");
	alumnos=x.nextInt();
	
	if(alumnos>=100) {
		total = 65 * alumnos;
		porAlumnos = total/alumnos;
		System.out.println("El monto total de 100 alumnos o mas es: " + total+ " pago por alumno es: " + porAlumnos);
	}else if(alumnos>=50 || alumnos>=99) {
		total = alumnos * 70;
		porAlumnos = total/alumnos;
		System.out.println("El monto por los alumnos " + alumnos + " es de un total: " + total + " y su pago por cada alumno es " + porAlumnos);
	}else if(alumnos>=30 || alumnos>=49) {
		total = alumnos * 95;
		porAlumnos = total/alumnos;
		System.out.println("El monto por los alumnos " + alumnos + " es de un total: " + total + " y su pago por cada alumno es " + porAlumnos);
	}else if(alumnos<30) {
		total = alumnos * 4000;
		porAlumnos = total/alumnos;
		System.out.println("El monto por los alumnos " + alumnos + " es de un total: " + total + " y su pago por cada alumno es " + porAlumnos);
	}
	
	
}
}
