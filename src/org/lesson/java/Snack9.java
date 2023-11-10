package org.lesson.java;

// Dato un array di numeri interi, dividere i numeri in due nuovi array: uno contenente solo numeri pari e l'altro solo numeri dispari.

public class Snack9 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	
		
		int[] arrEven = new int[arr.length];
		int[] arrOdd = new int[arr.length];
	
		int indexEven = 0; 
		int indexOdd = 0;
		
		
		for (int x=0 ; x<arr.length; x++) {
			
			if(arr[x] % 2 == 0) {
				arrEven[indexEven] = arr[x];
				indexEven++;
			} else if(arr[x] % 3 == 0) {
				arrOdd[indexOdd] = arr[x];
				indexOdd++;
			}
			
		}
	}

}
