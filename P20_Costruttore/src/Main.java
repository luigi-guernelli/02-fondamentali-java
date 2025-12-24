/**
 * P20 Costruttore
 * Un costruttore è un metodo speciale che ha lo stesso nome della classe
 * non ha tipo di ritorno viene eseguito automaticamente quando fai "new"
 * serve a inizializzare l'oggetto
 *
 * Classe di avvio del programma
 * Mostra:
 * - la creazione di oggetti tramite costruttore;
 * - il passaggio di parametri al momento dell'istanza;
 * - l'uso degli attributi inizializzati.
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto Persona tramite costruttore (passa parametri)
		Persona persona1 = new Persona("Mario", "Rossi", "Scorpione", 50);
		Persona persona2 = new Persona("Anna", "Rosa", "Acquario", 35);
		
		// Uso degli attributi dell'oggeto inizializzati
		System.out.println(
				"Ciao, mi chiamo " + persona1.nome + " " + persona1.cognome + 
				", sono del segno dello " + persona1.segnoZodiacale + 
				" e ho " + persona1.eta + " anni!"
				);
		
		System.out.println(
                "Ciao, mi chiamo " + persona2.nome + " " + persona2.cognome +
                ", sono del segno dello " + persona2.segnoZodiacale +
                " e ho " + persona2.eta + " anni!"
                );
		}

}


