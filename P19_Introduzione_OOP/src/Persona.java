/**
 * P19 Classe Persona
 * 
 * Rappresenta un'entità reale (una persona) con:
 * - attributi (stato)
 * - metodi (comportamento)
 */
public class Persona {
	
	// Attributi (caratteristiche dell'oggetto)
	String nome = "Luca";
	String cognome = "Rossi";
	String  penna = "Blue";
	
	int eta = 23;
	
	// Metodo: presentazione della persona
	void presentazione() {
		System.out.println("Benvenuto sono " + nome + " " + cognome);
	}
	
	// Metodo: azione svolta dalla persona
	void azione() {
		System.out.println("Sta scrivendo con la penna " + penna);
	}

}
