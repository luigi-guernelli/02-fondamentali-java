/**
 * P22 Overload Costructors
 * 
 * Creare una classe con multipli costruttori
 * 
 * Gli overload permettono di definire più costruttori con parametri diversi,
 * per inizializzare l'oggetto in modi flessibili es.(con pochi o tutti i dettagli)
 */
public class Main {

	public static void main(String[] args) {
		// Esempio con costruttore completo e (7 paramteri)
		Piatto piatto1 = new Piatto("bruschetta","pasta","carne",
									"verdure","stagione","torta","amaro");
		
		// Stampa il menu per visualizzare i valori
		piatto1.stampaMenu();
		
		// Esempio con costruttore completo con solo (2 paramteri)
		Piatto piatto2 = new Piatto("patè","riso");
		piatto2.stampaMenu(); // Gli altri campi useranno i default o rimarranno null


	}

}


