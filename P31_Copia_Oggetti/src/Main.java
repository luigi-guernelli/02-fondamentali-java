/**
 * P31 Copia degli oggetti
 * Dimostra differenza tra assegnamento (=) e vera copia.
 * Usa: Metodo copy() e Costruttore di copia
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("=== COPIA OGGETTI ===");
		
		// Creazione oggetto originale
		Persona persona1 = new Persona("Selvaggia","Cini");
		System.out.println("Originale: " + persona1);
		
		
		// 1. Copia tramite metodo copy()
		Persona persona2 = new Persona("Dante","Nelli"); // Valori iniziali diversi
		persona2.copy(persona1); // Copia valori di persona1
		System.out.println("Dopo il metodo copy: (persona2) = " + persona2);
		
		
		// Modifica originale
		persona1.setNome("Ludovica");
		System.out.println("Dopo modifica persona1: ");
		System.out.println("persona1: " + persona1); // Nome cambiato
		System.out.println("persona2: " + persona2); // Nome resta "Selvaggia" -> COPIA INDIPENDENTE!
		
		System.out.println("=== COSTRUTTORE DI COPIA ===");
		// 2. Copia tramite costruttore di copia
		Persona persona3 = new Persona(persona1); // Copia diretta;
		System.out.println("persona3 (copia di persona1): " + persona3);
		
		
		// Modifica originale
		persona1.setCognome("Rossi");
		System.out.println("Dopo modifica cognome persona1:");
		System.out.println("persona1: " + persona1);
		System.out.println("persona3: " + persona3); // Cognome resta "Cini" -> indipendente
	}
	

}
