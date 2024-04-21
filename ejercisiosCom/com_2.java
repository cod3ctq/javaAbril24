package ejercisiosCom;

import java.util.Scanner;

public class com_2 {
	public static void main(String[] args) {
		System.out.println("Ingrese un numero enteros");
		
		Scanner ingreso = new Scanner(System.in);
		int x = ingreso.nextInt();	
		
		if(x % 2 == 0) {
			System.out.println("Numero es par");
		}else {
			System.out.println("Numero es impar");
		}
	}

}
