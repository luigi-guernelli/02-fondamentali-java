import java.io.Closeable;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * P34 Gestione delle eccezioni (Exception Handling).
 * 
 * Le eccezioni sono errori che accadono durante l'esecuzione (runtime). Senza
 * gestione, il programma si ferma con uno stack trace.
 * 
 * Con try-catch-finallu possiamo: - try: codice a rischio - catch: gestire
 * eccezioni specifiche - fianlly: codice sempre eseguito es.(chiudere risorse)
 * 
 * Esempio: ArithmeticException e InputMismatchException try catch e finally
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("=== GESTIONE ECCEZIONI::EXCEPTION HANDLING ===");
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Inserisci il primo numero: ");
			int numero1 = input.nextInt();

			System.out.print("Inserisco il secondo numero: ");
			int numero2 = input.nextInt();

			int risultato = numero1 / numero2; // Possibile AritmeticException
			
			System.out.println("Risultato della divisione: "
								+ numero1 + " / " + numero2 + " = " + risultato);

		} catch (ArithmeticException aritmetic) {
			// Divisione per zero
			System.err.println("  - Errore matematico: Secondo numero prodotto deve essere diverso da 0.");
			System.err.println("   Dettaglio: " + aritmetic.getMessage());
		
		} catch (InputMismatchException inputEx) {
			// Input non numerico es.(lettere)
			System.err.println("  - Errore input: Il valore inserito non è numerico.");
			System.err.println("   Dettaglio: " + inputEx.getMessage());	
		
		} catch (Exception exc) {
			// Qualsiasi altra eccezione (catch generale - sempre per ultimo!)
			System.err.println("  - Errore imprevisto: durante l'esecuzione!");
			System.err.println("   Tipo: " + exc.getMessage());
			
		} finally {
			// finally: sempre eseguito anche se c'è: (return) o eccezione non gestita
			System.out.println("Blocco 'finally' eseguito: pulisco le risorse.");
		}

		input.close(); // Chiusura dello Scanner
		System.out.println("\nProgramma terminato normalmente (grazie alla gestione eccezioni)!");
	}	

}
