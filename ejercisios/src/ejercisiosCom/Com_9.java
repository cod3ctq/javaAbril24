package ejercisiosCom;

import java.util.Scanner;

public class Com_9 {

	public static void main(String[] args) {
		
		int dia;
		
		
		System.out.println("En una semana hay 7 dias ingrese el dia que se encuentrera regresar el dia: ");
		
		Scanner dx = new Scanner(System.in);
		
		dia = dx.nextInt();
		
		switch(dia) {
		case 1:
                System.out.println("Ested dia: " +"["+ dia + "]" +" es Lunes");
			break;
		case 2:
			System.out.println("Ested dia: " +"["+ dia + "]" +" es Martes");
			break;
		case 3:
			System.out.println("Ested dia: " +"["+ dia + "]" +" es Miercoles");
			break;
		case 4:
			System.out.println("Ested dia: " +"["+ dia + "]" +" es Jueves");
			break;
		case 5:
			System.out.println("Ested dia: " +"["+ dia + "]" +" es Viernes");
			break;
		case 6:
			System.out.println("Ested dia: " +"["+ dia + "]" +" es Sabado");
			break;
		case 7:
			System.out.println("Ested dia: " +"["+ dia + "]" +" es Domingo");
			break;
			default:
			System.out.println("Error numero no esta dentro de una seman");
		}

	}
}
