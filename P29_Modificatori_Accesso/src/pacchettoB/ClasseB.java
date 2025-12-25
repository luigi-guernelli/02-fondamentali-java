package pacchettoB;

import pacchettoA.ClasseA;
/**
 * P29: ClasseB (pacchettoB) - Testa accesso a ClasseA da altro package (non subclass)
 * Può accedere solo public (istanza); protected/default/private no.
 */
public class ClasseB {
	
	/**
	 * Metodo: Testa accesso via istanza di ClasseA (altro pkg).
	 */
	public void testaAccessoIstanza() {
		ClasseA objA = new ClasseA();
		System.out.println("Da altro pkg (non subclass, istanza):");
		System.out.println(" Public: " + objA.attributoPublic); // OK
		// objA.attributoProtected; // ERRORE: non visibile (protected, non subclass)
		// objA.attributoDefault; // ERRORE: package-private
		// objA.attributoPrivate; // ERRORE: Private
		System.out.println(" Private (via getter public): " + objA.getAttributoPrivate());
	}

}


