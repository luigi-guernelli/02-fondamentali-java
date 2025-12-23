/** P06: Math class
 * Metodi statici: 
 * - abs (valore assoluto);  
 * - min (minimo); 
 * - max (massimo); 
 * - pow (potenza); 
 * - sqrt (radice-quadra).
 * - Costante: PI (3.14159...);ù
 * 
 * Nota: Math è una classe utility; metodi invocati con Math.nomeMetodo().
 */
public class Main {

	public static void main(String[] args) {
	//Math.
		System.out.println("=== Utilizzo dei principali metodi Math ====");
		
		// Assoluto: toglie il segno negativo 
		System.out.println(Math.abs(-55));

		// Min/Max: tra due valoriù
		System.out.println(Math.min(55,21)); 
		System.out.println(Math.max(55,21));
	
		// Potenza: base ^ esponente
		System.out.println(Math.pow(2,3)); 
		
		// Radice quadrata
		System.out.println(Math.sqrt(25)); 
		
		// Costante PI (greca)
		System.out.println(Math.PI);
	}

}
