/** P09 Condizioni con IF
 * 
 * IF   (SE) la condizione è true
 * ELSE (ALTRIMENTI)
 * ELSE IF (ALTRIMENTI SE)
 * IF annidati
 * ternary operator
 * Esempio: di una chat con stato Online e Offline
 */
public class Main {
	public static void main(String[] args) {
		//=================================== IF ELSE =========================================
		String userNameA = "NomeUser"; // Risulta Online finche non si cambia il nome
		System.out.println("IF ELSE");
		if(userNameA == "NomeUser"){ System.out.println("Stato dell'attributo userName: Online"); } 
		else { 	System.out.println("Stato dell'attributo userName: Offline"); }
		
		//================================== IS ELSE ==========================================
		boolean isOnline = false;
		System.out.println("\nIF ELSE");
		if(isOnline) { System.out.println(" Stato dell'attributo isOnline: Online"); } 
		else { 	System.out.println("Stato dell'attributo isOnline: Offline"); }
		
		// =============================== IF ELSE ANNIDATI ======================================
		String userNameB = "NoName"; // Cambiando il nome abbiamo diversi risultati
		System.out.println("\nIF - ELSE IF - ELSE ANNIDATI");
		if(userNameB == "UserOn"){ System.out.println("Stato dell'attributo userName: Online"); } 
		else if (userNameB == "UserOff") {
			 	System.out.println("Stato dell'attributo userName: Offline"); }
		else {System.out.println("Nessun NomeUser  trovato");}
		
		//=============================	TERNARY OPERATOR ==========================================
		System.out.println("\nTERNARY OPERATOR");
		String userNameC = 1 > 2 ? "UserOn" : "UserOff" ;
		System.out.println("Stato del ternary operator: " + userNameC);

	}
		
}
