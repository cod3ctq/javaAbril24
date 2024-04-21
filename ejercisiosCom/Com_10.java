package ejercisiosCom;

import java.util.Scanner;

public class Com_10 {
public static void main(String[] args) {
	
	int dx;
	
	System.out.println("Un año tiene 12 messes y dias cortos ingrese un numero entero del 1 al 12: ");
	Scanner dias = new Scanner(System.in);
	dx = dias.nextInt();	
	
	if(dx==1 || dx==3 || dx == 5 || dx == 7 || dx == 8 || dx == 10 || dx==12) {
		System.out.println("El mess " + dx+ " tiene 31 dias");
		
	}else if(dx== 2) {
		System.out.println("El mess " + dx+ " tiene 28 dias");
	}else if(dx==4 || dx==6 || dx==9 || dx == 11){
		System.out.println("El mess " + dx+ " tiene 30 dias");
		
	}else {
		System.out.println("El mess " + dx + " no ahy mases dentro del año");
	}
	
}
}
