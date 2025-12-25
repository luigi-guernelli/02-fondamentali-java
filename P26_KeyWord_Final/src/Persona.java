/**
 * P26 Classe Persona per dimostrare 'final' e 'static'
 */
public class Persona {
	String nome;
	String cognome;
	final String idPersona; // inizializzato nel costruttore, non modificabile : andrebbe impostato come
							// private
	static int numeroPersone = 0; // condiviso da tutte le istanza; inizia a 0

	/**
	 * Costruttore per inizializzare gli attributi della persona
	 * 
	 * Incrementa il contatore static e imposta l'ID final
	 * 
	 * @param nome    -> della persona
	 * @param cognome -> della persona
	 */
	public Persona(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;
		this.idPersona = "ID_" + numeroPersone; // final: assegnato una volta sola
		numeroPersone++; // static: incrementa il contatore condiviso

		// Stampa debug
		System.out.println("Creata persona con ID: " + this.idPersona + " (contatore: " + (numeroPersone - 1) + ")");

	}

//	 Metodo static: accessibile senza istanza, stampa il contatore condiviso.
	static void mostraNumeroPersone() {
		System.out.println("Totale persone create: " + numeroPersone);
	}

	@Override
	// Metodo: toString
	public String toString() {
		return "Nome: " + this.nome + " Cognome: " + this.cognome + " || (ID: " + this.idPersona  + ")"; 
	}

}
