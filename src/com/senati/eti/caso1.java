package com.senati.eti;

import java.util.Scanner;

public class caso1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Ingrese edad: ");
		int edad = x.nextInt();
		
		String mensaje = "menor de edad";
		//condicional simple
		if (edad>=18)
			mensaje = "Mayor de edad";
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Condición... " + mensaje);
		

	}

}
