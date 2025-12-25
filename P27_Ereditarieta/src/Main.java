/**
 *  P27 Ereditarietà in Java (Inheritance).
 * 
 * - Superclasse: Persona (attributi base: nome, cognome; metodi base).
 * - Sottoclassi: Docente e Studente (ereditano da Persona, aggiungono attributi/metodi,
 *   override per personalizzare, super per costruttori).
 * 
 * Dimostrazione: Creiamo oggetti ispirati a 'Ritorno al Futuro' e chiamiamo metodi
 * per vedere ereditarietà/override in azione.
 */
public class Main {

    public static void main(String[] args) {
        // Creazione Docente: Emmet Brown (eredita da Persona)
        System.out.println("=== EMmet BROWN (Docente) ===");
        Professore brown = new Professore("Emmet", "Brown", "Fisica Quantistica");
        brown.presentazione();  // Override: Versione specifica per Docente
        brown.specializzazione();  // Metodo figlio
        brown.citazione();  // Override: Citazione epica di Brown

        System.out.println("\n=== GERALD STRICKLAND (Docente/Preside) ===");
        Professore strickland = new Professore("Gerald", "Strickland", "Disciplina Scolastica");
        strickland.presentazione();  // Override: Versione severa
        strickland.specializzazione();
        strickland.citazione();  // Override: Citazione da preside

        System.out.println("\n=== MARTY McFLY (Studente) ===");
        Studente marty = new Studente("Marty", "McFly", "Hill Valley High");
        marty.presentazione();  // Override: Versione da studente
        marty.specializzazione();  // Metodo figlio
        marty.citazione();  // Override: Citazione di Marty
    }
}


