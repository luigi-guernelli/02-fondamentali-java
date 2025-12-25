/**
 * P28 Classe Astratta e Metodi Astratti
 * 
 * - Classe astratta: Veicolo (templare incompleto, non istanziabile).
 * - Metodi astratti: Dichiarati senza corpo; sottoclassi devono implementarli
 * - Sottoclasse: Automobile es. (DeLorean - implementa tutto)
 * creare classe astratta veicolo
 * creare classi figle macchina tipo delorean
 * metodi astratti
 */
public class Main {

	public static void main(String[] args) {
		 System.out.println("=== CLASSE ASTRATTA E METODI DELLA CLASSE VEICOLO");
		Automobile delorean = new Automobile("DeLorean DMC-12");
		delorean.azione1(); // Accensione (astratto; override)
		delorean.azione2(); // Movimentazione
		delorean.azione3(); // Stop
		delorean.azione4(); // Spegnimento
		
		// Poliformismo Tratta un veicolo, ma chima metodi di Automobile
		Veicolo veicoloGenerico = delorean;
		veicoloGenerico.infoVeicolo(); // Metodo non-astrattio ereditato

	
	}
}


