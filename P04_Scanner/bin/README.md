# Classe Main (Scanner)
Questa classe gestisce input utente da console con Scanner.
**Import**: *java.util.Scanner* per leggere da *System.in*.
**Crea oggetto**: *Scanner scanner = new Scanner(System.in);*.

### Input esempi
- **String**: *nextLine()* per nome, cognome, citta, (legge intera riga).
- **int**: *nextInt()* per eta.

### Bug comune
Dopo *nextInt()*, resta newline nel buffer; usa *scanner.nextLine()* extra per pulirlo prima del prossimo input String.
