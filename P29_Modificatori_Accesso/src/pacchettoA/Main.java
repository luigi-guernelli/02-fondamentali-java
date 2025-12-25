package pacchettoA;

import pacchettoB.ClasseB;
import pacchettoB.ClasseC;

public class Main {
	/**
	 * Metodo main: Crea istanze; testa accesso attributio da diversi contesti.
	 * 
	 * @param args Argomenti riga di comando (non usati)
	 */
	public static void main(String[] args) {
		System.out.println("=== TEST ACCESSO DA STESSO PACKAGE (Main in pacchettoA) ===");
		ClasseA objA = new ClasseA();
		objA.testaAccessoInterno(); // Accede tutto (stesso pkg/classe)

		System.out.println("\n=== TEST DA ALTRO PACKAGE VIA ISTANZA (ClasseB in pacchettoB) ===");
		ClasseB objB = new ClasseB();
		objB.testaAccessoIstanza(); // Solo public/protected

		System.out.println("\n=== TEST EREDITARIETA' DA ALTRO PACKAGE (ClasseC extends ClasseA) ===");
		ClasseC objC = new ClasseC();
		objC.testaAccessoEreditato(); // Public/protected si; default/private no
	}
}
