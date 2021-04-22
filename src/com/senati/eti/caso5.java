package com.senati.eti;

import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("precio....: ");
		float precio = x.nextFloat();
		System.out.print("cantidad..: ");
		int cantidad = x.nextInt();
		
		float total = precio * cantidad;
	    float dscto = 0;
	    
	    if (cantidad >8)
	    	dscto = 0.1f* total;
	    
	    System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Total... " + total);
		System.out.println("Descuento... " + dscto);
		System.out.println("Neto... " + (total - dscto));

	}

}
