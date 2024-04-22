package ejercisiosCom;

import java.util.Scanner;

public class Com_12_1 {
public static void main(String[] args) {
	
	
	
	
	System.out.println("Ingrese el monto de donacion ");
	
	Scanner ingre = new Scanner(System.in);
	
	double donacion = ingre.nextDouble();
	
	double trienta = 0.3;
	double cincuenta = 0.5;
	double invercion = 0.2;
	
	
	if(donacion >= 10000) {
		
		System.out.println(" 30% se destina al centro de salud " +  donacion * (trienta)) ;
		System.out.println("50% al comedor de niños "+ donacion * (cincuenta));
		System.out.println("El resto se invierte en la bolsa " + donacion * (invercion));
		
		
	}else {
		System.out.println(" 25% se destina al centro de salud " +  donacion * (0.25)) ;
		System.out.println("50% al comedor de niños "+ donacion * (0.6));
		System.out.println("El resto se invierte en la bolsa " + donacion * (0.15));
	}
	
}
}
