/**
 * P17 Metodi o funzioni: 
 * Blocco di codice con un nome che esegue una specifica operazione 
 * - puo ricevere parametri 
 * - può restituire un valore (return) oppure (void) vuoto
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("=== Metodi; parametri; static; void; return ===");

		// Chiamata a un metodo void con parametro
		creaUnMetodo("Introduzione al metodo");

		// Chiamata di un mmetodo void con parametri
		calcoloValori(1, 2, 3);

		// Chiamata di un metodo con return
		int totaleAddizione = risultato(5, 5);
		System.out.println("Il totale: " + totaleAddizione);

	}

	/**
	 * Metodo void che riceve un parametro String. Non restituisce alcun valore, ma
	 * esegue una stampa.
	 * 
	 * @param testo parametro passato al metodo
	 */
	static void creaUnMetodo(String testo) {
		// cosa sono i parametri?
		System.out.println(testo);
	}

	/**
	 * Metodo void che riceve tre parametri interi, calcola la loro somma e stampa
	 * il risultato
	 * 
	 * @param a primo valore
	 * @param b secondo valore
	 * @param c terzo valore
	 */
	static void calcoloValori(int a, int b, int c) {
		int addizione = a + b + c; // es. 1+2+3=6
		int risultato = addizione;
		System.out.println("Metodo per calcolare tre valori: (a,b,c): " + risultato);
	}

	/**
	 * Metodo per ricevere due numeri interi e restituisce la loro somma.
	 * 
	 * @param a primo numero
	 * @param b secondo numero
	 * @return somma di a e b
	 */
	static int risultato(int a, int b) {

		return a + b; // es. 5+5=10

	}
}
