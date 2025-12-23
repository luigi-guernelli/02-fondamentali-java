
/** P02 Variabili / Attributi :
 * - sono contenitori con specifiche diverse
 * - dichiarazione, assegnazione e inizializzazione
 * - variabili con diversi tipi di dati
 * - nomenclatura delle variabili
 */
public class Main {

	public static void main(String[] args) {
		
		// Tipi di dati utilizzati
		int x; // dichiarazione della variabile intera x
		x = 45; // assegnazione di un valore alla variabile
		
		// x = 100; lasciando questa variabile il valore inserito viene riassegnato.
		
		int y = 23; // inizializzazione delle variabili
		double z = 12.2; // tipo double per numeri decimali
		String saluto = "ciao"; // tipo String per testo 
		
		// Output valori iniziali
		System.out.println("Il valore di x: " + x);
		System.out.println("Il valore di y: " + y);
		System.out.println("Il valore di z: " + z);
		
		// Utilizzando sempre il tipo int inseriamo numeri negativi es.(-10) o (0)
		// Si puo mandare a schermo anche la stessa variabile con un valore diverso
		//mandando in output la variabile
		x = 100;
		System.out.println("Possiamo riassegnare il valore di (x) e mandarlo in output: " + x + 
				"\nsemplicemente riassegno la variabile a un altro contenitore");
		
		
		System.out.println("Il valore della Stringa saluto è: " + saluto);
		
	}

}
