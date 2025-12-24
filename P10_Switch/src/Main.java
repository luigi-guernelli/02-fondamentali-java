/**P10 Switch
 * Seleziona e esegue un case basato su valore es.(String, int).
 * Usa break per fermare; default per casi non matching.
 * - Permette di cambiare case in base alle casistiche e alla condizione che si è inserita
 */
public class Main {

	public static void main(String[] args) {
		
		String tipo = "Backend"; // Cambia per testare cases es.("Welcome")
		
		switch(tipo) {
		case "Welcome":
			System.out.println("Benvenuto in Java!"); // Output se tipo="Welcome"
			break;
		case "Description":
			System.out.println("Primo linguaggio di programmazione orientata agli oggetti!");	
			break;
		case "GoodBye":
			System.out.println("Arrivederci al prossimo proggetto");
			break;
			default:
				System.out.println("Messaggio nel case: " + tipo); // Output: Messaggio nel case: Backend
        }
	}
}
