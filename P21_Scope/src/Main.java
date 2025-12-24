/**
 * P21 Scope delle variabili
 * 
 * Scope globale: le variabili definite a livello di classe sono accessibili da tutto il codice della classe. 
 * 
 * Scope locale: le varaibili all'interno di un  metodo sono visibili solo in quel metodo
 */
public class Main {

	public static void main(String[] args) {

		// Creazione di un'istanza della classe Persona
		Persona persona1 = new Persona("Luca", "Rossi");

		// Chiamata ai metodi per dimostrare l'accesso agli attributi globali
		persona1.saluta();
		persona1.calcolaEta(2025, 1990); // Esempio: anno corrente e anno di nascita

	}
}

