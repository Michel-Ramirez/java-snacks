package org.lesson.java;

import java.util.Scanner;

// Dati due numeri interi acquisiti dall'utente (`Scanner`), calcolare la somma di tutti i numeri compresi tra questi due valori (inclusi).

//Esempio di input: 1 e 4
//Output: 10 (1+2+3+4)

public class Snack10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digita il primo numero: ");
		int firstN = in.nextInt();
		
		System.out.print("Digita il secondo numero: ");
		int secN = in.nextInt();
	
		// utilizzo il metodo Math.min o max per determinare quale tra i numeri in input è più grande o più piccolo e lo assegno alle variabili
		int min = Math.min(firstN, secN);
		int max = Math.max(firstN, secN);
		
		int sum = 0;
		
		//ciclo utilizzando min come inizializzazione di partenza essendo il numero minimo
		// sfrutto max come condizione per far si che l'iterazione duri massimo il N dei numero pari
		//sfrutto l'iterazione per incrementare i numeri nella somma.
		for (int x=min ; x <= max ; x++ ) {
			sum += x;
		}
		
		System.out.println("Numero più basso inserito: " + min + "numero più grande inserito: " + max + "\n" + "La somma dei numeri di questi due valori compresi è: " + sum);
	}

}
