/**
 * P25 Classe Persona
 * 
 * Rappresenta un'entità reale (una persona) con:
 * - Attributi (caratteristiche) stato dell'oggetto 
 * - Metodi (comportamento): i metodi ricevono oggetti come parametri 
 * 		per simulare interazioni es.presentazioni.
 */
public class Persona {
	
	// Attributi (caratteristiche dell'oggetto)
	// scope globale all'interno della classe
	String nome;
	String cognome;
	int annoNascita;
	int eta;
	
	// Costruttore per inizializzare gli attributi della persona
	public Persona(String nome, String cognome, int annoNascita, int eta) {
	
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
		this.eta = eta;
	}
	
	
	// I metodi accedono agli attributi dell'oggetto passato via parametro
	
	/**
	 * Metodo che simula una presentazione: riceve un oggetto Persona come parametro
	 * e stampa un saluto usando i suoi attributi
	 * 
	 * Passaggio per riferimento: 'personaSiPresenta' è un riferimento all'oggetto originale
	 * 
	 * @param personaSiPresenta -> L'oggetto Persona a cui si presenta.
	 */
	void presentazione(Persona personaSiPresenta) {
		// Accede agli attributi dell'oggetto passato (personaSiPresenta)
		// e a quelli dell'oggetto chhimato (this)
		System.out.println("Buongiorno " + personaSiPresenta.nome + " io sono " + this.nome + " " 
							+ this.cognome + ".");
	}
	
	/**
	 * Metodo che simula una risposta: riceve un oggetto Persona come parametro
	 * e stampa un messaggio di piacere usando i suoi attributi
	 * 
	 * @param personaRisponde -> L'oggetto Persona che ha inizializzato la conversazione
	 */
	void risposta(Persona personaRisponde) {
		System.out.println("Piacere " + personaRisponde.nome + " io sono " + this.nome + " " 
							+ this.cognome + ".");
	}
	/**
	 * Override del metodo toString() ereditato da Object.
	 * 
	 * Restituisce una rappresentazione testuale leggibile dell'oggetto.
	 * Utile per stampare automatiche es.(println(array[i])).
	 * 
	 * @return Una stringa formattata con i dettagli della persona
	 */
	
	@Override
	
	// Metodo: toString
	public String toString() {
				return this.nome + " " + this.cognome +
				" (nato nel " + this.annoNascita + ", eta " + this.eta + ")";
	}	

}
