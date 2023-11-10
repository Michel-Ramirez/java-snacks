package org.lesson.java;

import java.util.Scanner;

//Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
//Continuare a chiedere una nuova stringa finché non si inserisce lo `0`.

public class Snack5 {

	public static void main(String[] args) {
		
		
		// inizializzo boolenano per l'arresto per programma
		boolean abort = true;
		
		//Inizializzo variabili di appoggio per il conteggio
		int chAlfanumeric = 0;
		int chNumeric = 0;
		int chSimbol = 0;
		
		//Inizio ciclo fin che:
		while (abort) {
			
			Scanner in = new Scanner(System.in);
			System.out.print("Digita parola: ");
			String word = in.nextLine();
			
			//Se è stato digitato 0 allora arresto il programma
			if (word.equals("0")) {
				
				System.out.println("Programma terminato");				
				abort = true;
				in.close();
				break;
			}
			
			
			int lng = word.length();
			
			//trasformo la parola in un arrai di lettere
			char[] charArray = word.toCharArray();
			
			
			for (int x=0; x<lng; x++) {
		
				char ch = charArray[x];
		
				//effettuo controllo utilizzando dei metodi nativi
				if(Character.isLetter(ch)) {
					chAlfanumeric++;
				} else if(Character.isDigit(ch)) {
					
					chNumeric++;
				} else {
					
					chSimbol++;
				}
				
			}
			
			
			
			System.out.println("Lettere contenute N: " + chAlfanumeric);
			System.out.println("Numeri contenuti N: " + chNumeric);
			System.out.println("Simboli contenuti N: " + chSimbol);
			
			System.out.println("Per interrompere il programma digitare 0");
			System.out.println("-------------------------------------------------------------------------");
			
		}
	}
}
