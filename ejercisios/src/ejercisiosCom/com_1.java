package ejercisiosCom;

import java.util.Scanner;

public class com_1 {

	public static void main(String[] args) {
		
		
		
		System.out.println("Ingrese dos numero enteros");
		
		Scanner ingreso = new Scanner(System.in);
		
		int x = ingreso.nextInt();	
		
		System.out.println("Numero ingresado es: " + x);
		
       Scanner ingreso1 = new Scanner(System.in);
		
		int y = ingreso1.nextInt();	
		
		System.out.println("Numero ingresado es: " + y);

		
		if(x > y) {
			
			System.out.println("Numero es mayor " + x);
			
		}else if (x< y){
			System.out.println("Numero es menor " + y);
		}else{
			System.out.println("Numero son iguales " + x +" " + y);
		}
		
		
		
	}
}
