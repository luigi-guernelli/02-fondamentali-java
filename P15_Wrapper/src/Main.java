/**
 * P15 Wrapper Class
 * Trasformano i "tipi primitivi" in oggetti: int, double, float, boolean, long, char, ecc...
 * Le wrapper class permettono di utilizzare dati primitivi come reference
 * boolean -> Boolean
 * char    -> Char
 * int     -> Integer
 * double  -> Double
 * 
 * Le wrapper servono perchè:
 * 1. Java lavora molto con oggetti
 * 2. Le collezioni (ArrayList, List, Map) non accettano primitivi
 * 3. Le wrapper hanno metodi utili
 * 4. Consentono conversioni e parsing
 * le wrapper sono piu pesanti dei tipi primitivi nei calcoli.
 */
public class Main {

	public static void main(String[] args) {
		 
		System.out.println("=== Classi Wrapper ===");
		// 1️ Dichiarazione di variabili Wrapper (autoboxing)
        Boolean vero = true;
        Character carattere = 'a';
        Integer numeroIntero = 5;
        Double numeroDecimale = 10.5;

        // 2️ Uso dei metodi delle Wrapper
        System.out.println("Valore Boolean: " + vero);
        System.out.println("Carattere maiuscolo: " + Character.toUpperCase(carattere));
        System.out.println("Numero intero come double: " + numeroIntero.doubleValue());
        System.out.println("Numero decimale come int: " + numeroDecimale.intValue());

        // 3️ Confronto con i tipi primitivi
        int primitivo = 10;
        Integer wrapper = primitivo; // autoboxing

        System.out.println("Primitivo: " + primitivo);
        System.out.println("Wrapper: " + wrapper);

        // 4️ Wrapper + String (metodi disponibili)
        String saluto = "Benvenuto in Java";
        System.out.println("Saluto: " + saluto.toUpperCase());

	}

}
