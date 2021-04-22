package com.senati.eti;

import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("DATOS DEL ALUMNO");
		System.out.println(".............. ");
		System.out.print("Nombre..............: ");
		String nombre = x.nextLine();
		System.out.print("Nota1...............: ");
		int nota1 = x.nextInt();
		System.out.print("Nota2...............: ");
		int nota2 = x.nextInt();
		System.out.print("Asistencua[1-12].....: ");
		float na = x.nextFloat();
		
		float promedio = nota1 *0.3f + nota2 * 0.7f;
		float pa = na / 12 *100;
		String estado = "";
		
		if (promedio >= 13 && pa >= 70)
			estado = "Aprobado";
		else
			estado = "Desaprobado";
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Alumno... " + nombre);
		System.out.println("Promedio... " + promedio);
		System.out.println("Asistencia... " + pa + "%");
		System.out.println("Estado... " + estado);
		
		
		
	}

}
