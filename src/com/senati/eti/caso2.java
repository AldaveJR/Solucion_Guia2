package com.senati.eti;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
	System.out.print("Ingrese Numero: ");
	int n = x.nextInt();
	String mensaje = "";
	//condicional compuesta
	if (n % 2 ==0)
		mensaje = "N�mero es par";
	else
		mensaje = "N�mero es impar";
	System.out.println("\nResultados");
	System.out.println("------------------");
	System.out.println("Condici�n... " + mensaje);
	

	}

}
