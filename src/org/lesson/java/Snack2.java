package org.lesson.java;

// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi, 
//e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.


public class Snack2 {

	public static void main(String[] args) {
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		for (int x=0; x < nomi.length; x++) {
			
			System.out.println("Invitato " + (x + 1) + ' ' + nomi[x] + ' ' + cognomi[x]);
		}

	}

}
