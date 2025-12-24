/**
 * P12 Ciclo FOR 
 * Il ciclo for permette di eseguire ripetutamente un blocco di istruzioni
 * per un numero definito di volte, finchè una determinata condizione rimane vera.
 * 
 * Esempio di cicli:
 * - for semplice contatore for (initialization (i = 0); condition (i < 5); increment (i++));
 * - for annidato di righe e colonne (un for dentro un altro for);
 * - il funzionamento di righe e colonne in una struttura annidata.
 * 
 * Il ciclo esterno gestisce le "righe", mentre quello interno gestisce le "colonne". * 
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("=== Ciclo for/foreach/for annidati ===");
		
		// For semplice: init; cond; increment;
		for (int i = 0; i < 4; i++) {
			System.out.println("\nRiga: " + i); // Nuova riga per ogni i
			
			// For annidato: per ogni riga, colonne j da 0 a 3
			for (int j = 0; j < 4; j++) {
				System.out.println("Colonna: " + j); // Stampa su stessa riga
			}
			
			System.out.println(""); // Nuova riga
		}
		
		System.out.println("\n Struttura completa (4 righe * 4 colonne).");

	}
}
