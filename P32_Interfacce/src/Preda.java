/**
 * Interfaccia Preda.
 * 
 * Definisce il contratto per tutte le prede:
 * devono saper fuggire e avere un comportamento di difesa.
 */
public interface Preda {

    void fuggi();
    void comportamentoDifesa();

    default void nasconditi() {
        System.out.println("La preda cerca riparo tra la vegetazione...");
    }
}