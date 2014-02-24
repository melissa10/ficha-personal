package meli;

import java.util.Scanner;

public class melissa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese nombre:");
		Scanner Scanner1 = new Scanner (System.in);
		String nombre1=Scanner1.next();

		System.out.println("Ingrese edad:");
		Scanner Scanner2 = new Scanner (System.in);
		int edad1=Scanner2.nextInt();

		System.out.println("Ingrese sexo:");
		Scanner Scanner3 = new Scanner (System.in);
		char sexo1=Scanner3.next().charAt(0);

		System.out.println("Ingrese casada:");
		Scanner Scanner4 = new Scanner (System.in);
		boolean casada=Scanner4.nextBoolean();
		

		System.out.println("Ficha personal");
		System.out.println("Nombre"); System.out.println(nombre1);
		System.out.println("Edad:"); System.out.println(edad1);
		System.out.println("Sexo:"); System.out.println(sexo1);
		System.out.println("Casada:"); System.out.println(casada);
		
		}

}
	


	


