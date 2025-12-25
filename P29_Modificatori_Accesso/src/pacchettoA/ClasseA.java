package pacchettoA;

import pacchettoB.*;

public class ClasseA {

	// Attributi con modificatori
	public String attributoPublic = "Public: Visibile ovunque (world).";
	protected String attributoProtected = "Protected: Visibile classe/pkg/subclass (altro pkg OK per subclass).";

	String attributoDefault = "Default: Solo classe/package (no subclass altro pkg)."; // Package-privato
	private String attributoPrivate = "Private: Solo questa classe.";

	/**
	 * Costruttore: Inizializza attibuti (demo).
	 */
	public ClasseA() {
		// Niente di speciale: attributi impostati a valori default
	}

	/**
	 * Metodo public: Testa accesso interno (stesso pkg/classe: tutto OK)
	 */
	public void testaAccessoInterno() {
		System.out.println("Da interno (ClasseA):");
		System.out.println(" Public: " + attributoPublic);
		System.out.println(" Protected: " + attributoProtected);
		System.out.println(" Default: " + attributoDefault);
		System.out.println(" Private: " + attributoPrivate);
	}

	/**
	 * Getter public per private (per accesso esterno limitato)
	 */
	public String getAttributoPrivate() {
		return attributoPrivate;
	}

}
