package org.lesson.java;

//Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e 
//mostri a video la stringa generata (secondi → “`hh:mm:ss`”) 

public class Snack7 {

	public static void main(String[] args) {
		
		int seconds = 25000;
		
		//ottengo le ore dividendo i secondi per i secondi presenti un 1h
		int h = seconds / 3600;
		
		//ottengo i minuti effettuando il modulo dei secondi rimasti e divido per 60 in modo da ottenere i minuti
		int m = (seconds % 3600) / 60;
		
		//eseguo il modulo del secondi restanti
		int sRemaining = seconds % 60; 
		
		String time = String.format("%02d:%02d:%02d", h, m, sRemaining);
		
		System.out.println(time);

	}

}
