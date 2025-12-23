/**P05: Operatori aritmetici: + - * / %
 * - Shorthand: *= 
 * - Incremento | Decremento (++ ; --)
 * - Esempi di espressioni matematiche.
 */
public class Main {

	public static void main(String[] args) {
		
		// Valori basi
		int x = 10;
		int y = 5;
		
		// Operazioni base
		int somma = x + y;
		int sottrazione = x - y; 
		int moltiplicazione = x * y; 
		double divisione = x / y; 
		double modulo = x % y; // il modulo e il risultato della divisione con il resto 0 / 1
		
		System.out.println("=== Operatori aritmetici e funzioni ===");
		System.out.println("I valori degli attributi sono: \n(x = 10); " + "(y = 5); " + "(z = 3);\n" );
		
		System.out.println("Operazioni effettuate con valori di default: + - * / ");
		
		System.out.println("La somma di (" + x + " + " + y + ") è: " + somma);
		System.out.println("La sottrazione di (" + x + " - " + y + ") è: " + sottrazione);
		System.out.println("La moltiplicazione di (" + x + " * " + y + ") è: " + moltiplicazione);
		System.out.println("La divisione di (" + x + " / " + y + ") è: " + divisione);
		System.out.println("Il modulo di (" + x + " % " + y + ") è: " + modulo);
		
		// Incremento e decremento (postfisso: usa valore attuale, poi modifica)
		somma++;
		System.out.println("Incrementiamo la somma di 1: " + somma); // Da 15 a 16
		
		sottrazione--;
		System.out.println("Decrementiamo la somma di 1: " + sottrazione); // Da 5 a 4
		
		// Espressione es. Priorità (parentesi, * / prima di  + -)
		int z = 3;
		int funzioneX = ((x + y) * z + (8 - 2) / z);
		System.out.println("La funzione ((x + y) * z + (8 - 2) / z) come valore finale da: " + funzioneX); // (15*3 + 6/3) = 45 + 2 = 47
    }
}