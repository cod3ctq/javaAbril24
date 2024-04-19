package ejercisiosCom;

import java.util.Scanner;

public class com_4 {
	public static void main(String[] args) {
		
		
		
		Scanner latter = new Scanner(System.in);
		
		System.out.println("Enter a letter to compare is capitalized ");
		
		//char latt= latter.nextLine().charAt(0);
		
		String latt= latter.nextLine();
		
		if(latt.length() !=1) {
			System.out.println("The latter is a lower case ");
		}else if((latt.compareTo("A")>=0) &&( latt.compareTo("Z")<=0)) {
			System.out.println("The latter is upper case ");
		}else {
			System.out.println("The latter is a lower case");
		}
		
		
		
	}

}
