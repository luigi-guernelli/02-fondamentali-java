import java.util.Scanner;

/** P04
 * User input
 * Importare java.util.Scanner per leggere da console.
 * Creare un oggetto Scanner per input: nome, cognome, eta, citta.
 * 
 * Nota: nextInt() lascia la newline nel buffer; nextLine() lo consuma.
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Input String (nextLine() legge intera riga)
		System.out.print("Inserisci il tuo nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Inserisci il tuo cognome: ");
		String cognome = scanner.nextLine();
		
		// Input int (nextInt() legge numero)
		System.out.print("Inserisci la tua età: ");
		int eta = scanner.nextInt();
		
		// Attenzione non inserendo questo comando il sistema crea un bug
		// Consuma newline residuo per evitare bug su input successivo		
		scanner.nextLine(); 
		
		// Input String post-int
		System.out.print("Inserisci la tua città: ");
		String citta = scanner.nextLine();
		
		// Output di riepilogo
		System.out.println("Benvenuto: " + nome + " " + cognome +
				" | Hai (" + eta + ") anni" + " | Vivi a: " + citta);
		
		
		scanner.close(); // Chiude Scanner per liberare risorse.

	}

}
