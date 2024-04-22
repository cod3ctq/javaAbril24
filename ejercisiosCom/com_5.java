package ejercisiosCom;

import java.util.Scanner;

public class com_5 {

	public static void main(String[] args) {
		
		
		
		Scanner edad = new Scanner(System.in);
		
		System.out.println("Ingrese la edad tiene que aser mayor de 18 años ");
		
		int x = edad.nextInt();
		
		
		
       Scanner nota = new Scanner(System.in);
       System.out.println("Ingrese una nota");
       
		int y = nota.nextInt();
		
		
         Scanner  sex= new Scanner(System.in);
         System.out.println(" Ingrese su genero con simbolo M o F ");
		String  s = sex.nextLine();
		
		if(x >= 18 && y >= 5 && s.equalsIgnoreCase("M") ) {
			System.out.println("POSIBLE");
		}else if (x >= 18 && y >= 5 && s.equalsIgnoreCase("F")) {
			System.out.println("ACEPTABLE");
			
		} else {
			System.out.println("NO ACEPTADO");
		}
	}
}
