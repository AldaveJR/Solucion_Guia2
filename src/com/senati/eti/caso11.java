package com.senati.eti;

import java.util.Scanner;

public class caso11 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = x.nextInt();
		String dia = "";
		// condicional multiple ( se usa el switch)
		switch (n) {
		    case 1:
		    	dia = "domingo";
		    	break;
		    case 2:
		    	dia = "lunes";
		    	break;
		    case 3:
		    	dia = "Martes";
		    	break;
		    case 4:
		    	dia = "Miercoles";
		    	break;
		    case 5:
		    	dia = "Jueves";
		    	break;
		    case 6:
		    	dia = "Viernes";
		    	break;
		    case 7:
		    	dia = "Sabado";
		    	break;
		    default:
		    	dia = "Desconocido";
		    	
		}
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Dia de la semana...: " + dia);

	}

}
