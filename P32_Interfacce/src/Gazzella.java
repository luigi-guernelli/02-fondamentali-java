/**
 * Classe Gazzella: animale concreto.
 * 
 * - extends Animale
 * - implements Preda
 */
public class Gazzella extends Animale implements Preda {

    public Gazzella(String nome, String specie, double peso) {
        super(nome, specie, peso);
    }

    @Override
    public void verso() {
        System.out.println(nome + " emette un verso di allarme: *snort*!");
    }

    @Override
    public void fuggi() {
        System.out.println(nome + " la gazzella scappa a zig-zag a grande velocità!");
    }

    @Override
    public void comportamentoDifesa() {
        System.out.println("Fugge in gruppo confondendo il predatore con movimenti imprevedibili.");
        nasconditi();  // Usa metodo default
    }
}