/**
 * P36 Casting 
 * Il casting è un proccesso che modifica un tipo di dato
 * Implicito: automatico quando passiamo ad un tipo più ampio (int-> double, float -> double)
 * Esplicito: manuale quando passiamo ad un tipo più ristretto.
 */
public class Main {
 public static void main(String[] args) {
	 
	 //  1. Casting Implicito
	 System.out.println("1. Casting Implicito (automatico - sicuro)");
	 
	 int numeroIntero = 9;
	 double numeroDouble = numeroIntero; // Implicito: int -> double
	 System.out.println("int 9 -> double: " + numeroDouble); // 9.0
	 
	 float numeroFloat = 10L; // long -> float (implicito)
	 System.out.println("long 10 -> float: " + numeroFloat); // 10.0
	 
	 double grande = 100.5f; // float -> double
	 System.out.println("float 100.5 -> double: " + grande); // 100.5
	 
	 System.out.println();
	 
	 //2. Casting  Esplicito	
	 System.out.println("2. Casting Esplicito (manuale - attenzione alla perdita di dati)");
	
	 double valoreDouble = 9.78;
	 int valoreIntero = (int) valoreDouble; // Esplicito: double -> int
	 System.out.println("double 9.78 -> int: " + valoreIntero); // 9 parte decimale TRONCA
	 
	 double valorePiccolo = 150.99;
	 byte valoreByte = (byte) valorePiccolo; // double -> btype
	 System.out.println("double 150.99 -> byte: " + valoreByte); // -106 overflow
	 
	 System.out.println();
	 
	 // 3. Esempio con perdita di precisione
	 System.out.println("3. Esempio di perdita dati con casting esplicito");
	 
	 double preciso = 123.456789;
	 float menoPreciso = (float) preciso;
	 System.out.println("double preciso: " + preciso);
	 System.out.println(" -> float (meno preciso): " + menoPreciso); // Leggera perdita
	 
	 int troncaDecimali = (int) preciso;
	 System.out.println("-> int (tronca decimali): " + troncaDecimali); // 123
	 
	 System.out.println();
	 
	 // 4. Casting con char
	 System.out.println("4. Casting con char");
	 
	 int codiceAscii = 65;
	 char lettera = (char) codiceAscii;
	 System.out.println("int 65 -> char: " + lettera); // A
	 
	 char maiscuola = 'Z';
	 int codice = (int) maiscuola;
	 System.out.println("char 'Z' -> int: " + codice); // 90
    }
 }