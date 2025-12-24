/**
 * P11 Ciclo While (MENTRE) A cosa serve un ciclo: While Do-while (FA-MENTRE)
 * esegue la condizione
 * 
 * IL CICLO E UN BLOCCO DI CODICE COME L'IF CHE CI PERMETTE DI SOSTITUIRE I
 * PROCESSI AUTOMATIZZANDOLI VEDERE IN ESECUZIONE UNA PARTE DI ESSO
 * 
 * Ciclo esegue le istruzioni tante volte finche la condizione è vera
 * 
 */
public class Main {

	public static void main(String[] args) {

		int i = 0; // contatore
		while (i < 0) /* condizione */ {
			System.out.println("while: " + i);
			i++; // incremento del while
		}

		do {
			System.out.println("dowhile: " + i);
			i++;
		} while (i < 0);
	}

}
