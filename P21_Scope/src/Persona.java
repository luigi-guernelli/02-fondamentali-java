/**
 * Classe Persona che dimostra la differenza tra scope globale e locale.
 * 
 * - Attributi globali (campi della classe): accessibili da tutti i metodi della
 * classe - Variabili locali (definite nei metodi): visibili solo all'interno
 * del metodo in cui sono dichiarate.
 */
public class Persona {

	// Attributi scope globale: accessibili da tutta la classe
	String nome;
	String cognome;

//	Costruttore per inizializzare gli attributi gloabali
	Persona(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;

	}

	// Metodo che utilizza una variabile locale (scope locale) per stampare un saluto
	void saluta() {
		String welcome = "Benvenuto"; // Variabile locale: esiste solo in questo metodo
		System.out.println(welcome + " " + this.nome + " " + this.cognome);
	}

	// Metodo che calcola l'età utilizzando parametri locali
	void calcolaEta(int annoCorrente, int annoNascita) {

		// I parametri annoCorrente e annoNascita hanno scope locale visibili sono in questo metodo
		int risultato = annoCorrente - annoNascita; // Variabile locale per il calcolo
		
		String mese = "Aprile"; // Variabile locale usato solo qui
		this.meseNascita("Il mese di nascita è: " + mese);

		System.out.println("Età calcolata: " + risultato + " anni!");
	}
	
	// Metodo Ausiliario per stampare il mese di nascita
	// Il parametro 'meseNascita' ha scope locale al metodo
	void meseNascita(String meseNascita) {
		System.out.println("" + meseNascita);
	}

}
