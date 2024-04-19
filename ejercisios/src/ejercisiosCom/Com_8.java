package ejercisiosCom;

import java.util.Scanner;

public class Com_8 {
public static void main(String[] args) {
	
	
	
	int lados;
	
	
	
	 Scanner lansados = new Scanner(System.in);
	
	 System.out.println("Ingrese un numero del 1 al 6 para mirar resultado de un lansamiento de dado: ");
	 
	 lados = lansados.nextInt();
	 
	String conVerString= "";
	
	
	switch (lados) {

	case 1:
           System.out.println("El lado es de la cara del dao es numero 1");
		break;

	case 2:
		 System.out.println("El lado es de la cara del dao es numero 2");
		break;
	case 3:
		 System.out.println("El lado es de la cara del dao es numero 3");
		break;
	case 4:
		 System.out.println("El lado es de la cara del dao es numero 4");
		break;
	case 5:
		 System.out.println("El lado es de la cara del dao es numero 5");
		break;
	case 6:
		 System.out.println("El lado es de la cara del dao es numero 6");
		break;
		
	default:
		 System.out.println("ERROR: número incorrecto!!");
	}
}
}
