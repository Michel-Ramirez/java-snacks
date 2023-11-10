package org.lesson.java;

import java.util.Scanner;

//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci in numero: ");
		String valueStr = in.nextLine();
		int valueInt = Integer.valueOf(valueStr);
		
		in.close();
		
		if (valueInt % 2 == 0) {
			System.out.println(valueInt);
			
		} else {
			System.out.println(valueInt + 1);
		}
		
	}

}
