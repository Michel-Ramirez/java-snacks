package org.lesson.java;

import java.util.Scanner;

//Data in input una stringa verificare se è palindroma

public class Snack4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digita la parola: ");
		String word = in.nextLine();
		
		in.close();
		
		//Pulisco la parola trasformandola in lowercase
		
		String clearWord = word.toLowerCase();
		
		//prendo la lunghezza della parola
		int lng = clearWord.length();
		
		
		//Imposto una variabile di appoggio a false in modo da cambiargli il booleano per esegiuire il risultato
		boolean isPalindrome = false;
		
		
		// clico dividendo la lenght in due sezioni da poterle comparare
		for (int x=0; x<lng / 2; x++) {
			
			
			//eseguo la comparazione
		 if (clearWord.charAt(x) != clearWord.charAt(lng - 1 - x)) {
			
			 isPalindrome = false;
			 break;
			
		 } 
		
		 isPalindrome = true;
		
		}
		
		
		if (isPalindrome) {
			System.out.println("La parola è palindroma!");
		} else {
			System.out.println("La parola NON è palindroma!");
		}
		
		
	}

}
