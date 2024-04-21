package ejercisiosCom;

import java.util.Scanner;

public class Com_12 {

	public static void main(String[] args) {

		int imc = 0;
		int peso = 0;
		int altura = 0;

		System.out.println("Se carculara su masa se le pedirara datos");

		Scanner dat = new Scanner(System.in);

		System.out.println("Ingrese el peso: ");
		peso = dat.nextInt();

		System.out.println("Ingrese su altura en numero entero: ");

		altura = dat.nextInt();

		imc = peso / (altura) ^ 2;

		if (imc < 16) {

			System.out.println("Criterio de ingreso en hospital del " + imc);

		} else if (imc < 16 || imc < 18) {
			System.out.println("Infrapeso de " + imc);
		} else if (imc < 18 || imc < 25) {
			System.out.println("Peso normal (saludable) de " + imc);
		} else if (imc < 25 || imc < 30) {
			System.out.println("Sobrepeso (obesidad de grado I) de " + imc);
		} else if (imc < 30 || imc < 35) {
			System.out.println("Sobrepeso crónico (obesidad de grado II) de " + imc);
		} else if (imc < 35 || imc < 40) {
			System.out.println("Obesidad premórbida (obesidad de grado III) de " + imc);
		} else if (imc > 40) {
			System.out.println("Obesidad mórbida (obesidad de grado IV) de " + imc);
		}

	}
}
