import java.util.ArrayList;

/**
 * P16 ArrayList
 * è una struttura dati dinamica che permette di memorizzare
 * una collezione di elementi ridimensionabile autonomicamente.
 * 
 * Caratteristiche:
 * - accettano solo tipi reference (oggetti);
 * - permette inserimentom modifica e rimozione degli elementi;
 * - mantiene l'ordine di inserimento;
 * - puo essere utilizzata anche in forma multidimensionale (ArrayList di ArrayList)-
 * 
 * In quest'esempio si mostrano:
 * - crazione di un ArrayList
 * - uso dei metodi: add(), get(), set(), remove(), clear()
 * - iterazioni con ciclo for;
 * - utilizzo degli ArrayList 2D (bidimensionali).
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		// Creazione di un ArrayLsit di String
		ArrayList<String> persone = new ArrayList<String>();
		System.out.println("=== ArrayList<String> ===");
		
		// .add aggiunta elementi
		persone.add("Maya");
		persone.add("Selvaggia");
		persone.add("Dante");
		persone.add("Antonio");
		
		System.out.println("Dopo add(): " + persone);
		
		// .set modifica di un elemento
		persone.set(3, "Ludovica"); // set: permette di modificare l'indice
		System.out.println("Dopo set(3, \"Ludovica\"): " + persone);
		
		// .remove rimozione di un elemento
		persone.remove(0); 
		System.out.println("Dopo remove(0): " + persone);
		
		// persone.clear(); .clear pulizia di tutti l'elenco degli ArrayList
		
		// interazione con for
		System.out.println("\nIterazione con for:");
		for(int i=0; i<persone.size(); i++) {
			System.out.println("Indice " + i + " -> " + persone.get(i));
		}
		
		
		// ArrayList di Integer (Wrapper)
		ArrayList<Integer> numeri = new ArrayList<Integer>();
		System.out.println("\n=== ArrayList di Integer ===");
		
		numeri.add(10);
		numeri.add(100);
		numeri.add(1000);
		
		for(int i=0; i<numeri.size(); i++) {
			System.out.println("Numero[" + i + "]" + numeri.get(i));
		}
		
		
		// ArrayList bidimensionale (ArrayList di ArrayList)
		System.out.println("\n=== ArrayList bidimensionali (Aule) ===");
		
		ArrayList<ArrayList<String>> aule = new ArrayList();
		
		ArrayList<String> classeA = new ArrayList<String>();
		classeA.add("Luca");
		classeA.add("Marco");
		
		ArrayList<String> classeB = new ArrayList<String>();
		classeB.add("Rocco");
		classeB.add("Franco");
		
		// inserimento delle classi nell'ArrayList principale
		aule.add(classeA);
		aule.add(classeB);
		
		// Cicli for annidati
		for(int i = 0; i < aule.size(); i++) {
			System.out.println("\nClasse " + (i + 1) + ":");
			
			for(int j = 0; j < aule.get(i).size(); j++) {
			
				System.out.println(" Studente " + (j + 1) + ": " + aule.get(i).get(j));
			}
		}
		

	}
}
