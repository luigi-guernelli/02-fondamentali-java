/** P03 Tipi primitivi e reference
 *  int     : 4bytes
 *  byte:   : -128 | 127 bytes
 *  long    : 9bytes
 *  short   : 2bytes
 *  double  : numero con 15 cifre decimali 5.123456789012345 | 8bytes
 *  float   : numero con 6-7 cifre decimali 5.123456f | 4bytes
 *  boolean : true : false | 1bit
 *  char    : singolo carattere/lettere/ASCII ES.'F' | 2bytes
 *  
 *  String  : sequenza di caratteri "Tipi primitivi in Java" | misura variabile
 *  - differenza tra primitivi e reference (iniziale e attributi disponibili)
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		// Boolean: true/false (1 bit)
		boolean isTrue = true;
		boolean isFalse = false;
		
		// Byte: -128 a 127 (1 byte)
		byte isBytePositive = 127;   // i byte questi di salvare numeri interi positivi e negativi
		byte isByteNegative = -128;
		
		// Short: -32,768 a 32,767 (2 byte)
		short isShort = -23456;
		
		// Int: -2^31 a 2^31-1 (4 byte); underscore per leggibilità
		int isInt = 2_000_000_000; // miliardi; milioni; migliaia; centinaia.
		
		// Long: -2^63 a 2^63-1 (8 byte); suffisso L
		long isLong = 200_000_000_000_000_000L; // triliardi; miliardi; milioni; migliaia; centinaia. (L) quadrilioni/quintilioni
		
		// Float: ~6-7 decimali (4 byte); suffisso F
		float isFloat = 1.23456789F;
		
		// Double: ~15 decimali (8 byte)
		double isDouble = 1.23456789;
		
		// Char: singolo carattere Unicode/ASCII (2 byte); apici singoli
		char isChat = 'A'; // per identificare il signolo carattere va messo il singolo apice
		
		// String: reference, sequenza caratteri (dimensione variabile)
		String isString = "Tipi primitivi e reference";
		
		//-- Le primitive sono i dati forniti da Java.
		//-- Le reference tipo String sono le variabili create dal developer;
		//-- vengono differenziate da diversi metodi e attributi con funzioni tipo;
		//   es: isString.toUpperCase() System.out.println(isString.toUpperCase());
	}

}
