package ejercisiosCom;

import java.util.Scanner;

public class com_3 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese dos numeros");
		
		Scanner numero1 = new Scanner(System.in);
		int x = numero1.nextInt();
		
		Scanner numero2 = new Scanner(System.in);
		int y = numero2.nextInt();
		
		

		if( y == 0) {
			System.out.println("Error");
			
		}else {
			int resultado = x/y;
			
			System.out.println("Resultado de la division " + resultado);
		}
	}
}
