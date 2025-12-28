/**
 * P30 Classe Persona con cui incapsulamento e metodi per copia.
 */
public class Persona {
	
	// Attributi
	private String nome;
	private String cognome;
	
	// Costruttore NORMALE
	Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		
	}
	
	// Costruttore di copia: Crea nuovo oggetto copiando un altro
	Persona(Persona originale) {
		this.copy(originale); // Riutilizza il metodo copy
	}

	
	// Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	// Metodo copy: Copia valori da un'altra Persona
	public void copy(Persona originale) {
		this.nome = originale.nome;       // oppure originale.getNome()
		this.cognome = originale.cognome; // oppure originale.getCognome()
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	// COMMENTO PER IL TEST
	/**
	 * Rimuovi temporaneamente il metodo toString() qui sotto (commentalo o cancellalo)
	 * e riesegui il programma.
	 * Vedrai in output qualcosa come: Persona@1B6d3586 o un codice simile.
	 * Questo è l'indirizzo di memoria dell'oggetto (versione default di Objkect.toString()).
	 * Poi ripristina il metodo per vedere la descrizione leggibile: Persone [nome=..., cognome=...]
	 */
	
	
	
	

}
