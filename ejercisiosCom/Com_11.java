package ejercisiosCom;

import java.util.Scanner;

public class Com_11 {
public static void main(String[] args) {
	
	int locacion=0;
	int cantidad = 0;
	int total;
	
	Scanner pais = new Scanner(System.in);
	
	System.out.println("Ingrese monto que va enviar no mas de 5K: ");
	cantidad = Integer.parseInt(pais.nextLine());
	
	
	if(cantidad >5) {
		System.out.println("No se puede mas de 5K en este momento ");
	}else {
		
		
		System.out.println("Ingrese pais: 1 = América del Norte, "
		+ " 2 América Central"
		+ " 3 América del Sur"
		+ " 4 Europa"
		+ " 5 Asia");
		locacion = Integer.parseInt(pais.nextLine());
		
		switch(locacion) {
		
		case 1:
			total = cantidad * 24000;
			System.out.println("América del Norte por " +cantidad  + " da un total de " + total + " cada K cuesta 24,000"  );
			break;
			
		case 2:
			total = cantidad * 20000;
			System.out.println("América Central por " +cantidad  + " da un total de " + total + " cada K cuesta 20,000" );
			break;
			
		case 3:
			total = cantidad * 21000;
			System.out.println("América del Sur por " +cantidad  + " da un total de " + total + " cada K cuesta 21,000"  );
			break;
			
		case 4:
			total = cantidad * 10000;
			System.out.println("América del Norte por " +cantidad  + " da un total de " + total + " cada K cuesta 10,000"  );
			break;
			
			
		case 5:
			total = cantidad * 18000;
			System.out.println("Asia por " +cantidad  + " da un total de " + total + "cada K cuesta 18,000" );
			break;
		}
		
			
		
	}
	
	
	
	
	
	
	
	
	
	


		
		
	

}
}
