/**
 * P23 Metodo toString
 * 
 * Il metodo toString() è ereditato da Object e permette di definire
 * una rappresentazione testuale personalizzata dell'oggetto,
 * utile per stampare, loggin o debug es.(println(persona)) chiama toString() implicitamente
 */
public class Main {

	public static void main(String[] args) {
		
		// Creazione di un'stanza della classe Persona
		Persona persona1 = new Persona("Marco","Giammaria",1990,35);
		System.out.println("" + persona1);
	}

}
