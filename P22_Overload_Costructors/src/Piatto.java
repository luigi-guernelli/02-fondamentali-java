/**
 * P22 Classe Piatto che dimostra l'overload dei costruottori
 * 
 * Ogni costruttore inizializza i campi in modo diverso:
 * - Costruottore base: solo antipasto e primo piatto.
 * - Costruootr completo: tutti i campi del menu.
 * 
 * I campo rappresentano i componenti di un menu tipico
 */
public class Piatto {
	
	String antipasto;       // es= "bruschetta/podoro/patè";
	String primoPiatto;     // es= "pasta/riso/";
	String secondoPiatto;   // es= "carne/pesce";
	String contorno;        // es= "verdura/insalata";
	String frutta;          // es= "stagione";
	String dolce;           // es= "torta/tiramisù";
	String liquore;		    // es= "amaro/limocello"
	
	/**
	 * Costruttore base (overload con 2 parametri).
	 * Inizializza solo antipasto e primo piatto; gli altri campi rimangono null
	 * 
	 * @param antipasto il tipo di antipasto
	 * @param primoPiatto il tipo di primo piatto
	 */
	Piatto(String antipasto, String primoPiatto) { this.antipasto = antipasto;  this.primoPiatto = primoPiatto; }
	// Gli altri campi non vengono inizializzati qui (rimangono null)
	
	
	/**
	 * Costruttore completo (overload con 7 parametri)
	 * Inizializza tutti i campi del menu.
	 * 
	 * @param antipasto
	 * @param primoPiatto
	 * @param secondoPiatto
	 * @param contorno
	 * @param frutta
	 * @param dolce
	 * @param liquore
	 */
	Piatto(String antipasto, String primoPiatto, String secondoPiatto, 
			String contorno, String frutta, String dolce, String liquore){
		this.antipasto = antipasto;
		this.primoPiatto = primoPiatto;
		this.secondoPiatto = secondoPiatto;
		this.contorno = contorno;
		this.frutta = frutta;
		this.dolce = dolce;
		this.liquore = liquore;
		
	}
	
	// Metodo per stampare il menu completo
	// Utile per visualizzare i valori inizializzati
	public void stampaMenu() {
		System.out.println("=== MUNE PIATTO ===");
		
		// Operatore ternario: se 'antipasto' != null, usa il valore; altrimenti "Non specificato"
		// Sintassi: condizione ? valore_se_vero : valore_se_falso		System.out.println("Antipasto: "  + (antipasto !=null ? antipasto : "Non specificato"));
		System.out.println("PrimoPiatto: "  + (primoPiatto !=null ? primoPiatto : "Non specificato"));
		System.out.println("SecondoPiatto: "  + (secondoPiatto !=null ? secondoPiatto : "Non specificato"));
		System.out.println("Contorno: "  + (contorno !=null ? contorno : "Non specificato"));
		System.out.println("Frutta: "  + (frutta !=null ? frutta : "Non specificato"));
		System.out.println("Dolce: "  + (dolce !=null ? dolce : "Non specificato"));
		System.out.println("Liquore: "  + (liquore !=null ? liquore : "Non specificato"));
		System.out.println("======================\n");
		
		// Usa ternario per null: `campo != null ? campo : "Non specificato"`.
		
	}

}

