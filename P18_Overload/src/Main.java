/**
 * P18 Overloaded Methods: Stesso nome, parametri diversi
 * 
 * L'overloading permette di definire più metodi con lo stesso nome ma con
 * parametri diversi.
 * 
 * Java decide quale metodo chiamare in base:
 * - al numero dei parametri 
 * - al tipo dei parametri 
 * - all'ordine dei parametri Cosa sono: sono piu metodi con lo stesso nome, ma parametri diversi.
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("=== Overladed Methods ===");

		System.out.println("Somma di 2 int " + addizione(2, 3));
		System.out.println("Somma di 3 int " + addizione(2, 3, 4));
		System.out.println("Somma di 2 double " + addizione(2.5, 3.5));

	}

	// Metodo con 2 parametri int
	static int addizione(int a, int b) {
		return a + b;
	}

	// Metodo con 3 parametri int
	static int addizione(int a, int b, int c) {
		return a + b + c;
	}
	
	// Metodo con 2 parametri double
	static double addizione(double a, double b) {
		return a + b;

	}

}
