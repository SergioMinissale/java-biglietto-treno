package org.generation.italy;
import java.util.Scanner;
public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double kmDaPercorrere;
		System.out.print("Inserisci il numero di km che vuoi percorrere: ");
		kmDaPercorrere = scanner.nextDouble();
		int eta;
		System.out.print("Inserisci la tua eta: ");
		eta = scanner.nextInt();
		System.out.println("I km che vuoi percorrere: " + kmDaPercorrere);
		System.out.println("La tua eta: " + eta);
		
		double costoAKm = 0.21;
		double prezzoBiglietto;
		prezzoBiglietto = costoAKm * kmDaPercorrere;
		System.out.println("Il prezzo del biglietto: " + prezzoBiglietto + " €");

	}

}
