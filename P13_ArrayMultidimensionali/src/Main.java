/**
 * P13 Array Multimedionsali
 * 
 * Un array 2D può essere immaginato come una tabella di righe e colonne. In
 * questo esempio:
 * - viene creato un array 2D vuoto;
 * - si assegnano valori a ogni cella;
 * - accediamo a singoli elementi; - iteriamo con cicli for annidati;
 * - creiamo anche un array 2D inizializzato letteralmente; 
 * - utilizziamo il ciclo foreach per scorrere una matrice.
 * 
 * Sintassi generale: tipo[][] nome = new tipo [righe][colonne];
 */
public class Main {

	public static void main(String[] args) {

		// Creazione di un array vuoto (3 clssi, 5 studenti per classe)
		String[][] classi = new String[3][5]; // classi e studenti

		System.out.println("=== Classi e Studenti in ArrayMultimediosanali[][] ===");
		
		// Popolazione della matrice classe per classe
		// classi[0] -prima classe - classi[x][y] -> y-esimo studente della classe x
		classi[0][0] = "Mario";
		classi[0][1] = "Bianca";
		classi[0][2] = "Giovanni";
		classi[0][3] = "Rosa";
		classi[0][4] = "Marco";
		System.out.println("Studente della prima classe[0]: " + classi[0][0]);

		// classe[1] -> seconda classe - classi[x][y] -> y-esimo studente della classe x
		classi[1][0] = "Bruno";
		classi[1][1] = "Anna";
		classi[1][2] = "Antonio";
		classi[1][3] = "Marcella";
		classi[1][4] = "Gianluca";
		System.out.println("Studente della seconda classe[1]: " + classi[1][0]);

		// classe[2] -> terza classe - classi[x][y] -> y-esimo studente della classe x
		classi[2][0] = "Daniela";
		classi[2][1] = "Maurizio";
		classi[2][2] = "Celeste";
		classi[2][3] = "Dante";
		classi[2][4] = "Selvaggia";
		System.out.println("Studente delle terza classe[2]: " + classi[2][0]);

		// Cicli for annidato per mostrare tutti gli studenti
		System.out.println("=== For annidato: stampa di tutte le classi e studenti ===");
		
		for (int classe = 0; classe < classi.length; classe++) {
			System.out.println("\nClasse " + (classe + 1) + ":"); // nuova riga
		
			for (int studente = 0; studente < classi[classe].length; studente++) {
				System.out.println("- " + classi[classe][studente]);
			}
		}
		
		// Creazione di un array 2D tramite inizializzazione letterale
		System.out.println("\n=== Array 2D inizializzato direttamente ===");
		
		String[][] classi1 = { 
				{ "Luca", "Anna", "Marco" },
				{ "Mario", "Giovanni", "Rosa" },
				{ "Tommaso", "Luisa", "Romina" } 
			};
		
		// Ciclo foreach
		for (String[] classe : classi1) {
			System.out.println("\nNuova classe: ");
			
			for (String studente : classe) {
				System.out.println("Nome: " + studente);
			}
		}
	}
}
