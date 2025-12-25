/**
 * P26 Final e Static Keyword
 * 
 * - final: rende una variabile costante (non modificabile dopo l'inizializzazione).
 * Utile per valori immutabili come ID univoci o costanti.
 * 
 * 
 * - static: rende un attributo/metodo appartenente alla classe (non all'istanza).
 * Condiviso tra tutte le istanza; accessibile senza creare oggetti es.(Classe.nomeStatico)
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("=== KEYWORD || final || static ===");
		// Creazioni di istanze: Ogni costruttore incremente il contatore static
		Persona persona1= new Persona ("Luca", "Rossi");
		Persona persona2= new Persona ("Gennaro", "Esposito");
		Persona persona3= new Persona ("Elisa", "Capelli");

		// Stampa oggetti usa toString() "incluso"
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);

		System.out.println("Numero persone create: " + Persona.numeroPersone);
		
		// Chiamata a metodo static: Accessibile via nome della classe
		Persona.mostraNumeroPersone();
		

	}

}




