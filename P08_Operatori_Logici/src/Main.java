
/** P08 Operatori Logici:
 * 
 * Usati per combinare condizioni (reestituisce boolean)
 * 
 * AND -> (&&): true se entrambe true.
 * OR  -> (||): true se almento una true.
 * NOT -> (!): inverte (true -> false, flase -> true). 
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("=== OPERATORI LOGICI ===");
		
		// AND (&&): true solo se entrambe true
		boolean and = 3 < 10 && 3 % 2 == 0; 
		// cond1:(TRUE && TRUE = true) boolean x = 3 < 10  && 3 % 2 == 1; 
		// cond2:(FALSE && FALSE = false) boolean x = 9 < 10  && 3 % 2 == 0; 
		System.out.println("AND &&: " + and);
		
		// OR (||): true se almeno una e true
		boolean or = 3 < 10 || 3 % 2 == 0;
		// (TRUE || FALSE = true)
		// se all'interno della variabile ce una condizione true l'OR restituisce comunque la condizione reale
		System.out.println("OR ||: " + or);
		
		// NOT (!): inverte il valore
		boolean not = 3 < 10 || 3 % 2 == 1;
		// cond0: (TRUE || TRUE )
		// la negazione sta chiedendo se la condizione e falsa
		System.out.println("NOT (!variabile) es: syso(!y): " + !not);
		
		// Condizione piu complessa: Priorità con parentesi; valuta da sinistra
		//					 true && false = false	||   true && true = true 
		boolean condizione = (3 < 10 && 3 % 2 == 0) || (6 < 10 && 6 % 2 == 0);
		System.out.println("Macro condizione:"
				+ "(3 < 10 && 3 % 2 == 0) || (6 < 10 && 6 % 2 == 0): " + condizione);
		// quindi tra le condizione false || true la condizione true
	}

}
