/**
 * P27 Sottoclasse Docente: Eredita da Persona.
 * 
 * - Ereditarietà: Usa attributi di Persona (nome, cognome) via super.
 * - Aggiunge: Materia insegnata, array classi.
 * - Override: personalizza presentazione e citazione.
 * - Esempi: Emmet Brown (scienza folle), Gerald Strickland (disciplina).
 */
public class Professore extends Persona {

    // Attributi aggiuntivi: Solo per Docente
    private String materia;
    private String[] classi = {"1A", "2B", "3C"};  // Array ereditabile se pubblico

    /**
     * Costruttore: Chiama super per inizializzare Persona, poi aggiunge materia.
     * 
     * @param nome Il nome.
     * @param cognome Il cognome.
     * @param materia La materia insegnata.
     */
    public Professore(String nome, String cognome, String materia) {
        super(nome, cognome);  // Super: Inizializza la superclasse
        this.materia = materia;
    }

    /**
     * Override: Presentazione specifica per Docente (eredita da Persona, ma la sovrascrive).
     * Usa attributi ereditati (nome, cognome) e aggiunti (materia).
     */
    @Override
    public void presentazione() {
        System.out.println("Chi sono: Professor " + this.nome + " " + this.cognome + 
                           " (insegno " + this.materia + ").");
    }

    /**
     * Metodo aggiuntivo: Restituisce specializzazione (usa attributo proprio).
     * 
     * @return La materia come stringa.
     */
    public String specializzazione() {
        System.out.println("Specializzazione: " + this.materia + 
                           " (classi: " + String.join(", ", this.classi) + ").");
        return this.materia;
    }

    /**
     * Override: Citazione specifica per Docente.
     * Dipende dalla materia (dimostra polimorfismo: stessa chiamata, output diverso).
     */
    @Override
    public void citazione() {
        if (this.materia.equals("Fisica Quantistica")) {
            System.out.println("Citazione: '1.21 gigawatt! Non è energia, è potenza!' - Emmet Brown");
        } else if (this.materia.equals("Disciplina Scolastica")) {
            System.out.println("Citazione: 'Mai in ritardo, mai in prigione!' - Gerald Strickland");
        } else {
            System.out.println("Citazione: Nessuna frase epica...");
        }
    }
}