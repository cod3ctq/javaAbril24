package ejercisiosCom;

import java.util.Scanner;

public class Com_6 {

	public static void main(String[] args) {
		
		double A = 0.20;
		double B = 0.30;
		double precio;
		int tamano = 1;
		double kilo=0;
		double monto = 0 ;
		String tipo = "";
		
		
		Scanner entrada = new Scanner(System.in);
		 System.out.println("Ingrese el precio de la Uvas: ");
		 precio = entrada.nextInt();		
	 
		 
		 System.out.println("Ingrese los kilos que quieres de Uvas: ");
		 kilo = entrada.nextInt();
		 
		 
		 System.out.println("Ingrese tamaño de la Uva que es del 1 o 2");
		 tamano = entrada.nextInt();
		
		 System.out.println("Ingrese el tipo de la Uva que hay A o B");
		 tipo = entrada.next();
		
		if (tipo.equalsIgnoreCase("A") && tamano == 1) {
			
			monto = precio + (A * kilo);
			
	        System.out.println(" Precio final de la Uva A: " + monto);   
			
		}else if(tipo.equalsIgnoreCase("B") && tamano == 2) {
			
			monto = precio + (B * kilo);
			
			System.out.println("Precio final de la Uva B: " + monto);
		}else {
			System.out.println("La inbformacion ingresada es incorrecta");
		}
		
	}
	
	
	
}
