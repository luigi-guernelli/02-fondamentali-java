// P01_Main:  classe di avvio del programma.
// Fondamentali OOP in Java con output da console
public class Main { 
	
	
	/**
	 * Metodo main: punto di ingresso del programma
	 * Stampa messaggi di esempio in console usando System.out.
	 *
	 * @param args -> argomenti passati dalla riga di comando (non usati qui)
	 */
	public static void main(String[] args) {
		
		// Si manda un messaggio al sistema per mostrarlo in output da console
		// println manda a capo il messaggio
		System.out.println("Benvenuto nella classe Main; l'inizio di ogni progetto!");
		
		// print non manda a capo il messaggio
		System.out.print("Messaggio nella seconda riga - ");
		System.out.print("il comando print non manda il messaggio a capo");
		
		// \n Newline manuale: ovvero il testo va a capo
		System.out.print("\nNewLine serve per mandare a capo il testo");
		
		
		// // Commento in single-line
		System.out.println("\n// lo slash serve per commentare il codice");
		System.out.print("=============================================");
		
		// /**/ Commento multi-line  per commentare piu righe
		System.out.println("\n/* \n* lo slash con l'asterisco \n* viene utilizzato per commentare piu righe \n*/");
		
	}

}
