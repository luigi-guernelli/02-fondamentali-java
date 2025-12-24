/**
 * P19 Introduzione l'Object Oriented Programming
 * Classe di avvio del programma. 
 * 
 * Mostra:
 * - come creare un oggetto (istanza di classe).
 * - come richiamare metodi tramite un oggetto.
 * - il collegamento tra Main e una classe esterna.
 */
public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto (istanza della classe Persona)	
		Persona persona1 = new Persona();
	
		// Chiamata dei metodi dall'oggetto
		persona1.presentazione();
		persona1.azione();
		 
	}

}
