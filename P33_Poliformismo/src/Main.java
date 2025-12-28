/**
 * P36 Poliformismo
 * Il poliformismo permette di trattare oggetti di sottoclassi diverse
 * tramite iuna reference della superclasse o (interfaccia).
 * 
 * A runtime, Java chiama il metodo della classe reale dell'oggetto
 * (override), non della varaibile di riferimento.
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("=== FASE DEL POLIFORMISMO ===");
		
		// Creazione degli oggetti
		Insegnante insegnante1 = new Insegnante("Mario","Rossi");
		Studente studente1 = new Studente("Giovanni","Verdi");
		Studente studente2 = new Studente("Anna","Bianchi");
		
		//Array polimorfico: tutti sono "Persona"
		Persona[] classe = {studente1, studente2, insegnante1};
		
		System.out.println("Saluti individuali: ");
		studente1.saluta();   // Metodo all'interno della classe Studente.java
		insegnante1.saluta(); // Metodo all'interno della classe Insegnante.java
		
		System.out.println("\nSaluto collettivo (poliformismo con Array):)");
		// Ciclo polimorfico: stessa chiamata, comportamento diverso!
		for (Persona persona : classe) {
				persona.saluta(); // chiamata toString() della classe reale
		}
		
		System.out.println("\nStampa oggetti (toString implicito): ");
		for (Persona persona : classe) {
			System.out.println(persona);
		}
	}

}
