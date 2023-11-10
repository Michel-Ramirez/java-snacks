package org.lesson.java;

// Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari

public class Snack3 {

	public static void main(String[] args) {
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//variabile di appoggio per la somma
		int sum = 0;
		//Incremento di 2 in modo da prendere sempre i numeri dispari
		for (int x=0; x < numbers.length; x+=2) {

			sum += numbers[x];
			
			
		}
		
		//stampo la somma dei numeri
		System.out.println("Somma dei numeri dispari: " + sum);
		
	}

}
