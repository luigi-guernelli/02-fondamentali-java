/**
 * Interfaccia Predatore.
 * 
 * Definisce il "contratto" per tutti i predatori:
 * devono sapere cacciare e avere un comportamento di caccia.
 */
public interface Predatore {

    // Metodi astratti (obbligatori da implementare)
    void caccia();
    void comportamentoCaccia();

    // Metodo default (Java 8+): comportamento comune, ma sovrascrivibile
    default void insegue() {
        System.out.println("Il predatore insegue silenziosamente la preda...");
    }
}