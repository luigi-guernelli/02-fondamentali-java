import java.util.Iterator;

/**
 * P24 Array di oggetti
 * Array vuoto: Dichiarato con 'new Tipo[dimensione]' slot iniziale null, poi popolato assegnando oggetti
 * Array peino: {obj1, obj2} Inizializzato direttamente con oggetti nel codice
 * Accesso: Via inidice es.((array[0] -basaed: 0 a lenght-1), restituisce un riferimento all'oggetto)
 * 
 * Gli array sono zero-based (indici da 0 a lunghezza-1)
 * Usa toString() per print automatici.
 */
public class Main {

	public static void main(String[] args) {
		
		// TipoArray[vuoto]: Crea 3 slot null di tipo Persona
		Persona[] personeEmpty = new Persona[3];
		System.out.println("=== ARRAY VUOTO (prima dell'assegnazione) ===");
		System.out.println("Lunghezza: " + personeEmpty.length); // Output: 3 slot vuoti
		
		// Creazione degli oggetti Persona
		Persona persona1=new Persona("Giovanni","Rossi",1988,37);
		Persona persona2=new Persona("Mario","Verdi",1987,38);
		Persona persona3=new Persona("Maria","Luisa",2000,25);
		
		// Assegnazione: Popola l'array com riferimenti agli oggetti
		personeEmpty[0] = persona1;
		personeEmpty[1] = persona2;
		personeEmpty[2] = persona3;
		
		System.out.println("=== ARRAY VUOTO (dopo assegnazione) ===");
		for (int i = 0; i < personeEmpty.length; i++) {
			System.out.println("Elemento [" + i + "]: " + personeEmpty[i]);
		}
		
		// Array con elementi presenti: Inizializzazione diretta
		Persona[] personeFull = {persona1, persona2, persona3};
		
		System.out.println("=== ARRAY FULL ===");
		System.out.println("Lunghezza: " + personeFull[2]); // Output: 3
		for (int i = 0; i < personeFull.length; i++) { // Ultimo elemento
			System.out.println("Elemento [" + i + "]: " + personeFull[i]);
			
		}
		
	}

}
