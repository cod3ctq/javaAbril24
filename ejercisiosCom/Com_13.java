package ejercisiosCom;

import java.util.Scanner;

public class Com_13 {
public static void main(String[] args) {

	
	System.out.println("Ingreser su horas trabajadas ");
 
 Scanner entrada = new Scanner(System.in);
 
 int horas = entrada.nextInt();
 int extras = horas - 40;
	
 if(horas <= 40) {
	
	System.out.println("Total de ganacias de horas: " + horas *16+ " $");
	
 }else {
	 
	 
	 System.out.println(" Ganado en horas extras " + (extras*(20)+ (640)) + " $");
 }
 
 
	
}
}
