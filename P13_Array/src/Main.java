/**P13 Array
 * Array 1D Un array e una struttura dati indicizzata che permette di
 * memorizzare piu valori dello stesso tipo all'interno di un'unica variabile
 * 
 * Concetti mostrati: 
 * - Dichiarazione e creazione di un array; 
 * - Accesso agli elementi tramite indice; 
 * - Modifica degli elementi; - Uso delle proprietà length per conoscere la dimensione dell'array; 
 * - Iterazioni tramite ciclo for tradizionale e for enhanced (foreach)
 * 
 * Nota sugli indici: Gli array utilizzano indici a partire da 0. Per questo, il
 * primo elemento si trova alla posizione 0, l'ultimo si trova a length -1.
 *
 */
public class Main {
	public static void main(String[] args) {

		// 1 Creazione di un array vuoto di tre elementi (inizializzati a 0)
		int[] numeri = new int[3];
		System.out.println("Lunghezza array numeri: " + numeri.length);

		// 2 Assegnazione valori tramite indice
		numeri[0] = 10;
		numeri[1] = 20;
		numeri[2] = 30;

		// 3 Accesso agli elementi
		System.out.println("Valore iniziale di numeri[1]: " + numeri[1]);

		// 4 Modifica di un elemento già presente
		numeri[1] = 100;
		System.out.println("Valore modificato di numeri[1]: " + numeri[1]);

		// 5 Creazione di un array già inizializzato con valori
		int[] index = { 10, 20, 30, 40 };

		// Accesso ad un elemento tramite posizione
		System.out.println("Elemento index[0]: " + index[0]);

		// Lunghezza dell'array
		System.out.println("Lunghezza array index: " + index.length);

		// 6 Iterazione con for tradizionale usa (l'indice)
		System.out.println("\n-- Ciclo for tradizionale sull'array index --");
		for (int i = 0; i < index.length; i++) {
			System.out.println("index[" + i + "] = " + index[i]);
		}

		// 7 Iterazione con for enhanced (foreach)
		System.out.println("\n-- Ciclo foreach sull'array numeri --");
		for (int numero : numeri) {
			System.out.println("Valore: " + numero);
		}
	}
}