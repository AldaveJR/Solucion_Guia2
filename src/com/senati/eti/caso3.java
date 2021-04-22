package com.senati.eti;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("primer Numero: ");
		int num1 = x.nextInt();
		System.out.print("segundo Numero: ");
		int num2 = x.nextInt();
		
		String resultado = "";
		//condicional anidada
		if (num1 == num2)
			resultado = "Los numeros son iguales";
		else if (num1> num2)
			resultado = "El primero numero es mayor";
		else 
			resultado = "El segundo numero es mayor";
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Respuesta... " + resultado);
			    
		

	}

}
