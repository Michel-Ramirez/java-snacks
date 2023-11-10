package org.lesson.java;

import java.util.Random;

// Dato un array di numeri interi casuali compresi tra 0 e 100, 
// scrivi un programma che trovi e stampi il numero massimo, minimo e il valore medio.

public class Snack11 {

	public static void main(String[] args) {
		
		//dichiaro un nuovo array vuoto di 10 posti
		int[] arrNumb = new int[10];
		
		//metodo di randomisazione di un numero
		Random randN = new Random();

		for (int x=0; x<arrNumb.length; x++ ) {
			
			//richiamo il metodo di randomisazione indicandogli il numero massimo quindi gen un numero da 0 a 100
			// registra al index [x] il numero randomizzato
			arrNumb[x] = randN.nextInt(101);
			
		}
		
		// inizializzo le variabili di appoggio utilizzando il index [0] del array in modo da valutare successivamente qual è il num min o max
		// Non la inizializzo a 0 perché non esisterà numero minore di 0
		
		int min = arrNumb[0];
		int max = arrNumb[0];
		
		for (int x=1; x<arrNumb.length ; x++) {
		
			//controllo quali sono i numeri min o maggiori
			if (arrNumb[x] < min) {
				min = arrNumb[x];
			} else if (arrNumb[x] > max) {
				max = arrNumb[x];
			}
		}
		
		System.out.println("Numero minimo " + min);
		System.out.println("numero massimo " + max);
		
	}

}
