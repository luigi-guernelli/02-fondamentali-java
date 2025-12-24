
/**P12V01 Istruzioni break e cotinue
 * 
 * Continue: salta l'iterazione corrente e passa subito alla successiva es.(ignora valore).
 * Break: termina immediatamente il ciclo, interrompendo tutte le successive iterazioni.
 * 
 * Usati in for/while per controllo flusso; evitano loop infiniti o filtri.
 */
public class Main {

	public static void main(String[] args) {
		// int i = 0;
		for (int i = 0; i < 15; i++) {
			if (i == 4) {
				continue; // Salta stampa per i=4, continua con i=5
				// break; // Alternativa: ferma ciclo a i=4 (non esegue resto)
			}
			System.out.println("Visualizziamo un punto di break nel ciclo for: " + i);
			
			/**
			 *  In questo esempio il ciclo for scorre i numeri da 0 a 14.
			 *  quando la variabile 'i' raggiunge il valore 4, il comando continue evita la stampa
			 *  dell'elemento e passa all'iterazione successiva
			 *  
			 *  Se al posto di 'continue' venisse utilizzato 'break', il ciclo si interromperebbe
			 *  al valore 4
			 *  
			 *    Output con continue: Stampa 0-3, 5-14 (salta 4)
			 *    Con break: Stampa 0-3, poi esce ()non 4+
			 */
		}
	}

}
