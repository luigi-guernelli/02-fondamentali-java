/**
 * Classe Leone: animale concreto.
 * 
 * - extends Animale → eredita attributi e metodi comuni
 * - implements Predatore → deve implementare tutti i metodi dell'interfaccia
 */
public class Leone extends Animale implements Predatore {

    public Leone(String nome, String specie, double peso) {
        super(nome, specie, peso);
    }

    @Override
    public void verso() {
        System.out.println(nome + " ruggisce potentemente: ROOOOAR!");
    }

    @Override
    public void caccia() {
        System.out.println(nome + " il leone tende un agguato alla preda.");
    }

    @Override
    public void comportamentoCaccia() {
        System.out.println("Caccia in branco, coordinandosi con gli altri leoni.");
        insegue();  // Usa metodo default dell'interfaccia
    }
}