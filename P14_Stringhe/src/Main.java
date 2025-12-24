/**
 * P14 Metodi Stringhe
 * 
 * - equals: restituisce un boolean ed key sensitive percepisce lettere Maiusc e minusc
 * - equalsIgnoreCase: ignora la key sensitive
 * - length: lunghezza della stringa
 * - charAt: posizione di un carattere all'interno della stringa
 * - indexOf: posizione indicizzata da un carattere della stringa
 * - isEmpty: istruzione booleana
 * - toUpperCase: modifica la String con tutte lettere Maiuscole
 * - toLowerCase: modifica la String con tutte lettere minuscole
 * - trim: elimina gli spazi tra una riga e l'altra
 * - replace: sostituisce dei caratteri inserendone un altro a scelta
 */
public class Main {
	public static void main(String[]args) {
		System.out.println("=== Metodi per analizzare una Stringa ===");
		// Dichiarazione della Variabile e inizializzazione
		String nome = "UserName";
		String saluto = "Ciao"; // " " false; "Ciao" true
		
		boolean equals = nome.equalsIgnoreCase("UserName"); // userName; 
		System.out.println("\n1- La stringa " + "UserName " 
						+ "è uguale al valore all'interno "
						+ "della variabile nome [true][false]?: " + equals);
		
		int  length = nome.length(); // length-lunghezza dei caratteri		
		System.out.println("2- La stringa ha una lunghezza di: (" + length + ") caratteri!");
		
		char character = nome.charAt(0); // 0, 1, 2,3, 4, 5, 6, 7, 8
		System.out.println("3- La posizione scelta di un caratter all'interno della stringa è: " + character);
		
		int index = nome.indexOf("N");
		System.out.println("4- Utilizzando un carattere coem indexOf "
							+ "viene mostrato in output la sua posizione: " + index);
		
		boolean contenitore = saluto.isEmpty();
		System.out.println("5- Utilizzando l'istruzione .isEmpty "
							+ "si definisce se la stringa sia vuota: " + saluto.isEmpty());
		
		String maiusc = "abcd-edfg";
		String parola = maiusc.toUpperCase();
		System.out.println("6- Utilizzando il metodo toUpperCase la stringa (abcd-edfg) diventa: " + parola);
		
		
		String minusc = "ABCD-EFG";
		String parola1 = minusc.toLowerCase();
		System.out.println("7- Utilizzando il metodo toLowerCase la stringa (ABCD-EFG) diventa: " + parola1);
		
		String spazio = "   Space   "; // in quali casi posso utilizzare trim?
		String space = spazio.trim();
		System.out.println("8- Normale stringa senza il metodo trim: " + spazio); // differenza con la variabile spazio con quella space?
		System.out.println("9- Per eliminare gli spazi da un stringa si utilizza il metodo trim: " + space); // differenza con la variabile spazio con quella space?
		
		String sostituzione = "ABCDEF" ;
		String sost = sostituzione.replace('A', '1');
		System.out.println("Il metodo replace permette di sostituire "
							+ "un carattere con un altro: " + sost + ": A / 1" );
		
	
	}

}
