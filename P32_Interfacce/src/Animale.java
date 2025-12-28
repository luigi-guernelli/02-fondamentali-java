/**
 * Classe astratta Animale: base comune per tutti gli animali dello zoo futuro.
 * 
 * Contiene attributi e comportamenti condivisi.
 * Non istanziabile direttamente (serve come template).
 */
public abstract class Animale {

    protected String nome;
    protected String specie;
    protected double peso;

    public Animale(String nome, String specie, double peso) {
        this.nome = nome;
        this.specie = specie;
        this.peso = peso;
    }

    // Metodo comune a tutti gli animali
    public void verso() {
        System.out.println(nome + " emette il suo verso caratteristico.");
    }

    // toString per stampa leggibile
    @Override
    public String toString() {
        return String.format("%s (%s) - Peso: %.1f kg", nome, specie, peso);
    }
}