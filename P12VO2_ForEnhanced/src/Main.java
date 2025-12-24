/**
 * P12V02 For Enhanced
 *  Esempio di utilizzo del ciclo "for enhanced" (foreach).
 * 
 * Il ciclo for enhancede permette di scorrere facilmente tutti gli elementi
 * di una collezione o array senza dover gestire indici, condizioni o incrementi.
 * 
 * In questo esempio viene iterato un array di numeri interi e il valore di goni
 * elemento viene stampato a video.
 * 
 * Struttura: for (tipo var : collezione) { . . . } - var assume ogni elemento.
 * Vantaggi: Codice piu pulito, riduce errori su indici.
 */
public class Main {

	public static void main(String[] args) {
		
		// Array di numeri interi
		int[] numeri = {10,  20, 30, 40, 50};
				
		System.out.println("=== Ciclo for enhanced (foreach) ===");
		
		// Foreach: numero è variabile temporanea  per ogni elemento
		// ":" significa "in" o "apaprtiene a" (da numeri)
		for (int numero: numeri) // for each 
		{
			System.out.println("\nElemento array in numeri: " + numero);
			
		}
		
		System.out.println("\nIterazione completata (" + numeri.length + " elementi).");
	}
}
