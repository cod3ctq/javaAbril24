package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal_1 {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  // Pedro picapiedra
  String[] original = new String[16];
  String c = "";
  String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
    "s", "t", "u", "v", "w", "x", "y", "z" };
  String cifrado = "";

  // Llenar el arreglo orginal
  for (int i = 0; i < original.length; i++) {
   System.out.println("Ingresa una letra");
   original[i] = sc.nextLine().toLowerCase();
  }

  System.out.println(Arrays.toString(original));
  // Iterar sobre el original para acceder a una letra a la vez
  for (int i = 0; i < original.length; i++) {
   c = original[i];
   // System.out.println(c);
   // Itera sobre el abecedario

   if (c.equals(" ")) {
    cifrado = cifrado + "-";
   } else if (c.equals("z")) { // cuando esto se cumpla
    cifrado = cifrado + "a";
   } else {
    // Itero sobre el abc para determinar
    // en que posicion esta la letra actual
    for (int j = 0; j < abc.length; j++) {
     if (c.equals(abc[j])) {
      cifrado = cifrado + abc[j + 1];
     }
    }
   }
  }
  System.out.println(cifrado);
 }
}


/*
 convertir numeros a String 
 *
 *
 */






