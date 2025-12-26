/**
 * P30 Classe  con incapsulamento.
 * Attributi private: Nascosti all'esterno (non accessibili direttamente).
 * Getter: Restituiscono valore (lettura).
 * Setter: Modificano valore (scrittura, con possibile validazione futura).
 * Incapsulamento: "nasccondere lo stato interno e fornire interfaccia pubblica".
 */
public class Persona {
	
	// Attributo private: Visibili solo dentro questa classe
	private String nome;
	private String cognome;
	
	/**
	 * Costruttore: Inizializza attributi private.
	 * 
	 * @param nome    -> persona
	 * @param cognome -> persona
	 */
	Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;

	}
	
	//Getter nome: Restituisce valore (lettura sicura)
	public String getNome() {
		return nome;
	}
	
	// Setter nome: Modifica valore
	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	
	//Setter nome: Modifica valore con (eventuale validazione)
//		public void setNome(String nome) {
//	        if (nome != null && !nome.trim().isEmpty()) {
//	            this.nome = nome.trim();
//	        } else {
//	            System.out.println("Errore: Nome non valido!");
//	        }
//	    }
		
	// Getter cognome
	public String getCognome() {
		return cognome;
	}
	
	// Setter cognome
	public String setCognome(String cognome) {
		return this.cognome = cognome;
	}
	
//	// Setter cognome (con validazione base)
//    public void setCognome(String cognome) {
//        if (cognome != null && !cognome.trim().isEmpty()) {
//            this.cognome = cognome.trim();
//        } else {
//            System.out.println("Errore: Cognome non valido!");
//        }
//    }

}