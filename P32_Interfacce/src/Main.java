/**
 * P32: Interfacce in Java.
 * 
 * Le interfacce definiscono "cosa" un oggetto deve saper fare (contratto),
 * senza dire "come" farlo.
 * 
 * Una classe può implementare più interfacce (multipla eredità di comportamento).
 * 
 * Demo: Simulazione ecosistema predatori/prede.
 * - Leone (predatore)
 * - Gazzella (preda)
 * 
 * Mostra polimorfismo: possiamo trattare oggetti diversi tramite la stessa interfaccia.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== SIMULAZIONE ECOSISTEMA - INTERFACCE ===\n");

        // Creazione di un predatore
        Leone leone = new Leone("Lion", "Panthera leo", 190.5);
        System.out.println(leone);  // Usa toString()
        leone.verso();
        leone.caccia();             // Metodo dell'interfaccia Predatore
        leone.comportamentoCaccia();

        System.out.println("\n" + "-".repeat(50) + "\n");

        // Creazione di una preda
        Gazzella gazzella = new Gazzella("Gazel", "Gazella thomsonii", 25.0);
        System.out.println(gazzella);
        gazzella.verso();
        gazzella.fuggi();            // Metodo dell'interfaccia Preda
        gazzella.comportamentoDifesa();

        System.out.println("\n" + "-".repeat(50) + "\n");

        // Polimorfismo con interfacce
        System.out.println("=== POLIMORFISMO CON INTERFACCE ===");
        Predatore predatore = leone;        // Leone È-UN Predatore
        Preda preda = gazzella;             // Gazzella È-UNA Preda

        predatore.caccia();
        predatore.comportamentoCaccia();

        preda.fuggi();
        preda.comportamentoDifesa();
    }
}