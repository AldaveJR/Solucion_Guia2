package com.senati.eti;

import java.util.Scanner;

public class caso7 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Ingrese sueldo....: ");
		float sueldo = x.nextFloat();
		float impuesto = 0;
		// && ->  Ylogico
		// || -> or O  logico ( | -> alt+124)
		if (sueldo <=1500 )
			impuesto = 0.03f * sueldo;
		else if (sueldo > 1500 && sueldo <=3000)
			impuesto = 0.08f * sueldo;
		else
			impuesto = 0.12f * sueldo;
		  System.out.println("\nResultados");
			System.out.println("------------------");
			System.out.println("sueldo... " + sueldo);
			System.out.println("impuesto... " + impuesto);
			System.out.println("Neto... " + (sueldo - impuesto));
		

	}

}
