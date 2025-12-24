/**
 * P24 Classe Persona
 * 
 * Rappresenta un'entità reale (una persona) con:
 * - attributi (stato)
 * - metodi (comportamento)
 */
public class Persona {
	
	// Attributi (caratteristiche dell'oggetto)
	// scoper globale all'interno della classe
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

	/**
	 * Override del metodo toString() ereditato da Object.
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
