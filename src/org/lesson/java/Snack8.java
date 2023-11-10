package org.lesson.java;

import java.util.Scanner;

//Dato un input stringa, il programma deve sostituire tutti i caratteri 'a' con 'o' e viceversa, quindi stampare la nuova stringa.

public class Snack8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Digita una parola: ");
		String word = in.nextLine();

		in.close();
		
		String clearWord = word.toLowerCase();
		
		// strasformo la stringa in array
		char[] wordArr = clearWord.toCharArray();
		
		
		for (int x=0; x<wordArr.length; x++) {
			
			// condizioni per sostituire i caratteri paragonandoli e riassegnandoli
			if (wordArr[x] == 'a') {
				wordArr[x] = 'o';
			} else if (wordArr[x] == 'o') {
				wordArr[x] = 'a';
			}
			
		}

		System.out.println(wordArr);
	}

}
