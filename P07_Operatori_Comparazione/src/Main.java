/**P07: Operatori di comparazione: 
 * >  maggiore
 * <  minore
 * >= maggiore uguale
 * <= minore uguale
 * == uguale
 * != diverso
 * - accettano come risultato solo il tipo boolean
 */
public class Main {
	public static void main(String[] args) {
		
		System.out.println("=== Operatori di comparazione ===");
		
		// Esempi base  restituiscono il tipo boolean (true o false)
		boolean maggiore = 2 > 1;
		System.out.println("2 > 1: " + maggiore);        // true
		
		boolean minore = 1 < 2;
		System.out.println("1 < 2: " + minore);          // ture
		
		boolean maggioreUguale = 9 >= 10;
		System.out.println("9 >= 10: " + maggioreUguale); // false
		
		boolean minoreUguale = 10 <= 9;
		System.out.println("10 <= 9: " + minoreUguale);  // false
		
		boolean ugualeA = 2 == 2;
		System.out.println("2 == 2" + ugualeA);		    // true
		
		boolean diversoDa = 10 != 10;
		System.out.println("10 != 10: " + diversoDa);   // false
		
		System.out.println("\n=== Funzione tra x e y ===");
		int x = 2;
		int y = 1;
		boolean risultato = x > y;
		System.out.println("x > y: " + risultato);     // true

	}
}
