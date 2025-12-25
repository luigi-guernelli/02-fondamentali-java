/**
 * P27 Superclasse Persona: Base per tutte le persone.
 * 
 * Fornisce attributi ereditati (nome, cognome) e metodi base (es. presentazione generica).
 * Le sottoclassi li ereditano e possono override (sovrascrivere).
 */
public class Persona {

    // Attributi protetti: Ereditati dalle sottoclassi (scope globale, accessibili via super)
    protected String nome;
    protected String cognome;

    /**
     * Costruttore base: Inizializza nome e cognome.
     * 
     * @param nome Il nome della persona.
     * @param cognome Il cognome della persona.
     */
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    /**
     * Metodo base: Presentazione generica.
     * Verrà override nelle sottoclassi per personalizzarla.
     */
    public void presentazione() {
        System.out.println("Chi sono: " + this.nome + " " + this.cognome + " (Persona generica).");
    }

    /**
     * Metodo base per citazione: Versione vuota, da override.
     */
    public void citazione() {
        System.out.println("Chi sono: " + this.nome + " " + this.cognome + " (Nessuna citazione specifica).");
    }
}