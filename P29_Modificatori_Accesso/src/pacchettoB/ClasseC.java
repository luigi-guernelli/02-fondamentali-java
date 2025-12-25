package pacchettoB;

import pacchettoA.ClasseA;

/**
 * P29: ClasseC extends ClasseA	(pacchettoB estende da pacchettoA).
 * Come subclass (altro pkg): Accede public/protected; non default/private.
 */
public class ClasseC extends ClasseA {
	
	/**
	 * Costruttore: Chiama super (eredita attributi).
	 */
	public ClasseC() {
		super(); // Chiama costruttore ClasseA
	}
	
	// Override: Testa accesso ereditato da (subclass altro pkg).
	public void testaAccessoEreditato() {
		System.out.println("Da subclass (altro pkg):");
		System.out.println(" Public: " + attributoPublic); // OK (ereditato)
		System.out.println(" Protected: " + attributoProtected); // OK (protected per subclass)
		// attributoDefault; // ERRORE: Default package-private (no altro pkg)
		// attributoPrivate; // ERRORE: Private (solo superclass)
		System.out.println(" Private (via getter public ereditato): " + getAttributoPrivate());
	}
	
	

}
