package com;

public class ciclos_4 {
	
	public static void main(String[] args) {
		int hora;
		int minutos;
		int segundos;
		for (hora = 0; hora < 24; hora++) {
			for (minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
                    System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
                    try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
