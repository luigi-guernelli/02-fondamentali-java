/*
 * P38 Iteratori
 * 
 * L'Iterator è un oggetto che permette di scorrere una collezione
 * es.(ArrayList, HashSet) in modo sequenziale.
 * 
 * Vantaggi:
 * - Scorrimento sicuro (anche durante rimozione)
 * - Metodo remove().
 * - Astrazione: funziona con qualsiasi collezione che implementa Iterable.
 * 
 * Metodi principali:
 * - hasNext() -> true se c'è un elemento successivo.
 * - next()    -> restituisce l'elemento successivo (avanza il cursore).
 * - remove()  -> rimuove l'ultimo elemento restituito da next().
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=== ITERATORI IN JAVA ===");
		
		// Creazione di una lista
		ArrayList<String> persone = new ArrayList<String>();
		persone.add("Luca");
		persone.add("Marco");
		persone.add("Anna");
		persone.add("Francesca");
		persone.add("Giovanni");
		
		System.out.println("Lista originale: " + persone);
		System.out.println();
		
		// 1. Scorrimento semplice con Iterator
		System.out.println("1. Scorrimento semplice (next()):");
		
		Iterator<String> it = persone.iterator();
		
		// Stampa i primi 4 elementi manualmente
		System.out.println("  Primo: " + it.next());
		System.out.println("  Secondo: " + it.next());
		System.out.println("  Terzo: " + it.next());
		System.out.println("  Quarto: " + it.next());
		
			
		// Se viene chiamato next() di nuovo -> Giovanni
		// Mentre se viene chiamato oltre -> NoSuchElementException!
		
		System.out.println();
		
		// 2. Scorrimento completp con while + hashNext()
		System.out.println("2. Scorrimento completo con while:");
		
		Iterator<String> it2 = persone.iterator(); // Nuovo iterator
		while (it2.hasNext()) {
			String persona = it2.next();
			System.out.println("  -> " + persona);
			
		}
		System.out.println();
		
		// 3. Rimozione sicura durante iterazione
		System.out.println("3. Rimozione sicura con iterator.remove():");
		
		Iterator<String> it3 = persone.iterator();
		while (it3.hasNext()) {
			String persona = it3.next();
			if (persona.equals("Anna") || persona.equals("Marco")) {
				it3.remove(); // Rimuove in modo sicuro.
				System.out.println("  Rimosso: " + persona);
			}
		}
		
		// 4. Confronto con for-each (non permette remove sicuro)
		System.out.println("\n4. ATTENZIONE: for-each NON permette remove sicuro!");
		
		/*
		 * Questo causerebbe ConcurrentModificationException:
		 * for (String p: persone) {
		 *   if(p.equals("Giovanni")) persone.remove(p);
		 *   }
		 */
		
		System.out.println("Usa sempre Iterator.remove() per rimuovere durante iterazione!");
	
	}
}
