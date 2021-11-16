package org.generation.italy;
import java.util.Scanner;
public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//variabile km da percorrere
		double kmDaPercorrere;
		System.out.print("Inserisci il numero di km che vuoi percorrere: ");
		kmDaPercorrere = scanner.nextDouble();
		
		//variabile eta
		int eta;
		System.out.print("Inserisci la tua eta: ");
		eta = scanner.nextInt();
		
		System.out.println("I km che vuoi percorrere: " + kmDaPercorrere);
		System.out.println("La tua eta: " + eta);
		
		//variabile costo a km
		double costoAKm = 0.21;
		
		//variabile prezzo del biglietto con calcolo
		double prezzoBiglietto;
		prezzoBiglietto = costoAKm * kmDaPercorrere;
		System.out.println("Il prezzo del biglietto: " + prezzoBiglietto + " €");
		
		//variabili sconto
		double scontoMinorenni = 0.2;
		double scontoOver65 = 0.4;
		
		double percMinorenni = prezzoBiglietto * scontoMinorenni;
		double prezzoMinorenni= prezzoBiglietto - percMinorenni;
		
		double percOver65 = prezzoBiglietto * scontoOver65;
		double prezzoOver65 = prezzoBiglietto - percOver65;
		
		if( eta < 18){
			System.out.println("Il prezzo del biglietto scontato sara: " + prezzoMinorenni + " €");
		} else if( eta >= 65) {
			System.out.println("Il prezzo del biglietto scontato sara: " + prezzoOver65 + " €");
		} else {
			System.out.println("il prezzo del biglietto sara: " + prezzoBiglietto + " €");
		}
		scanner.close();
		

	}

}
