/**
 * P35: Lavorare con i file
 * 
 * Operazioni base: verificarem scrittura, lettura, eliminazione
 * Usa classe GestoreFile per separare logica dal main 
 */
public class Main {

	public static void main(String[] args)  {
	System.out.println("=== LAVORARE CON I FILE IN JAVA ===\n");	
	
	String nomeFile = "log.txt";
	GestoreFile gestore = new GestoreFile(nomeFile);
	
	// 1. Verifica esistenza
	gestore.verificaEsistenza();
	
	// 2. Scrivi - Sovrascrivi 
	gestore.scriviFile("Benvenuto nel file di prova!", false);
	
	// 3. Aggiungi righe (append)
	gestore.scriviFile("Aggiunto: ID = 01, ruolo = HelpDesk", true);
	gestore.scriviFile("Aggiunto: ID= 02, ruolo = Insegnante", true);
	
	// 4. Leggi contenuto
		gestore.leggiFile();
		
	// 5. (Opzionale) Elimina alla fine
	//	gestore.eliminaFile();
	}
	
}
