/**
 * P28 Classe astratta Veicolo: Template per tutti i veicoli.
 * 
 * - Non istanziabile: 'new Veicolo()' erroe!
 * - Metodi astratti: Obbligano le sottoclassi a implementarli.
 * - Metodi normali: Ereditati e usabili direttamente.
 */
public abstract class Veicolo {
	String modello;
	
	Veicolo(String modello) { this.modello = modello; }

	abstract void azione1(); // Accensione senza corpo
	abstract void azione2(); // Movimentazione
	abstract void azione3(); // Stop
	abstract void azione4(); // Spegnimento
	
	// Metodo non - astratto: Ereditato e usabile (es. di ereditarietà)
	void infoVeicolo() {
		System.out.println("Info veicolo: " + this.modello + 
				            " (classe astratta da Veicolo).");
	}
}
