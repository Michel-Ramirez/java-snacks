package org.lesson.java;

//Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//
//Possibile usare solo :
//- cicli
//- chartAt
//- if/switch

public class Snack6 {

	public static void main(String[] args) {
		
		String numberStr = "123";
		
		int numberInt = 0;
		
		for (int x=0 ; x<numberStr.length(); x++) {
			
			//suddivido ogni carattere della stringa 
			char ch = numberStr.charAt(x);
			
			// sottraggo il valore di ch il valore Unicode di 0 es. [1 -> unicode = 49 / 0 -> unicode = 48 => ottengo 1]
			int valueInt = ch - '0';
				
			//moltiplico per 10 da spostare il valore decimale e sommo il valore finale per otterene in numero completo in intero
			numberInt = numberInt * 10 + valueInt;
				
			
		}
		
		System.out.println(numberInt);
	}

}
