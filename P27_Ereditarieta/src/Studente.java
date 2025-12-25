/**
 * P27 Sottoclasse Studente: Eredita da Persona.
 * 
 * - Ereditarietà: Usa attributi di Persona via super.
 * - Aggiunge: Istituto, classe, voti (array).
 * - Override: Personalizza presentazione e citazione per Marty McFly.
 */
public class Studente extends Persona {

    // Attributi aggiuntivi: Solo per Studente
    private String istituto;
    private String classe;
    private int annoScolastico;
    private double[] votiMateria;

    /**
     * Costruttore: Chiama super per Persona, poi aggiunge dettagli scolastici.
     * 
     * @param nome Il nome.
     * @param cognome Il cognome.
     * @param istituto L'istituto frequentato.
     */
    public Studente(String nome, String cognome, String istituto) {
        super(nome, cognome);  // Super: Inizializza ereditato
        this.istituto = istituto;
        this.classe = "1A";
        this.annoScolastico = 1985;  // Anno di Ritorno al Futuro
        this.votiMateria = new double[]{3.0, 6.0, 7.5};  // Voti mediocri di Marty
    }

    /**
     * Override: Presentazione specifica per Studente.
     * Usa ereditato (nome) + aggiunto (istituto).
     */
    @Override
    public void presentazione() {
        System.out.println("Chi sono: " + this.nome + " " + this.cognome + 
                           " (studente a " + this.istituto + ", classe " + this.classe + ").");
    }

    /**
     * Metodo aggiuntivo: Specializzazione storica/temporale per Marty.
     */
    public void specializzazione() {
        System.out.println("Specializzazione: Passato, Presente, Futuro – Viaggi nel tempo a Hill Valley!");
        System.out.println("Media voti: " + (votiMateria[0] + votiMateria[1] + votiMateria[2]) / 3 + "/10");
    }

    /**
     * Override: Citazione specifica per Studente (Marty).
     */
    @Override
    public void citazione() {
        System.out.println("Citazione: 'This is heavy, Doc!' - Marty McFly (pesante come un viaggio nel tempo).");
    }
}