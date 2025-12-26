/**
 * P30 Incapsulamento
 * Nasconde dettagli interni della classe (attributi private) e fornisce accesso controllato tramite metodi pubblici (getter/setter).
 * 
 * Ventaggi:
 *  - Protegge dati da modifiche dirette/inconsistenti.
 *  - Permette validazione/logica nei setter.
 *  - Rende classe più sicura e mantenibile.
 * 
 */
public class Main {
	
	/**
	 * Metodo main: Punto di ingresso.
	 * Crea istanza Persona; usa getter per leggere, setter per modificare.
	 * Dimostra: Accesso indiretto (no persona.nome diretto).
	 * 
	 * @param args Argomenti riga di comando (non usati).
	 */
	public static void main(String[] args) {
		
		// Creazione oggetto (costruttore inizializza attributi private)
		Persona persona = new Persona ("Selvaggia", "Nelli");
		
		System.out.println("=== INCAPSULAMENTO GETTER E SETTER ===");
		// Getter: Leggere valori (accesso in lettura)
		System.out.println("Nome completo iniziale: " + persona.getNome() + " " + persona.getCognome());
		
		// Setter: Modifica valori (accesso in scrittura)
		persona.setNome("Dante");
		persona.setCognome("Cini");
		
		// Getter dopo modifica
		System.out.print("Nome completo modifiato: " + persona.setNome("Dante ") + persona.setCognome("Cini"));
	}

}


