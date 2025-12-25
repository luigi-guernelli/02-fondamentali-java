/**
 * P28 Sottoclasse concreta Automobile: Estende Veicolo (eredita e implementa).
 * 
 * - Ereditarietà: Usa attributi/metodi di Veicolo.
 * - @Override: Implementa TUTTI i metodi astratti
 * - Es: DeLorean - azioni future e presenti
 */
public class Automobile extends Veicolo {
	
	/**
	 *  Costruttore che richiama i parametrei della superClass per inizializzare Veicolo
	 * 
	 * @param modello -> il modello dell'auto es.(DeLorean DMC-12)
	 */
	public Automobile(String modello) {
		super(modello); // Super eredita inizializzazione
	}

	@Override
	void azione1() {
		System.out.println("Azione1: L' automobile viene accessa!");
	}

	@Override
	void azione2() {
		System.out.println("Azione2: L' automobile viene messa in movimento!");	
	}

	@Override
	void azione3() {
		System.out.println("Azione3: L'automobile viene fermata a causa di un ostacolo!");
	}
	
	@Override
	void azione4() {
		System.out.println("Azione4: L'automobile viene spenta per fine del test!");
	}

}
