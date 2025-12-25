/**
 * P25 Oggetti e Parametri
 * 
 * - Gli oggetti vengono passatti per reference: il metodo riceve un "puntatore"
 *   all'oggetto originale, non una copia. 
 * - Modifiche all'oggetto nel metodo influenzo l'originale.
 * - Utile per: condividire dati tra oggetti, simulare interazioni es.(dialoghi)
 */
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// Creazione di due istanze della classe Persona
		Persona persona1 = new Persona("Dante", "Cini", 2007, 18);
		Persona persona2 = new Persona("Selvaggia", "Nelli", 2007, 18);
		
		
		// Passaggio di oggetti come parametri: persona2 viene passata a persona1
		persona1.presentazione(persona2);
		
		//persona 1 viene passata a persona2
		persona2.risposta(persona1);
	}

}

