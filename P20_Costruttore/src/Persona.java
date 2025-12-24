/**
 * P20 Classe Persona
 * 
 * Rappresenta una persona con attributi inizializzati
 * tramite costruttore.
 */
public class Persona {
	
	// Attributi (caratteristiche dell'oggetto)
	String nome;
	String cognome;
	String  segnoZodiacale;
	
	int eta;
	
	/**
	 * Costruttore della classe Persona.

	 * @param nome
	 * @param cognome
	 * @param segnoZodiacale
	 * @param eta
	 */
	Persona(String nome, String cognome, String segnoZodiacale, int eta) {
		
		// this fa riferimento all'istanza corrente		
		this.nome = nome;
		this.cognome = cognome;
		this.segnoZodiacale = segnoZodiacale;
		this.eta = eta;
	}
}
