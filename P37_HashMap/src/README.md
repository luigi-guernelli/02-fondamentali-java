# P37 HashMap Collezioni Chiave Valore in Java

## Descrizione
Questa lezione sulla struttura dati **HashMap** ('java.util.HashMap'), una delle collezioni piu usate.

**HashMap** memorizza dati come coppie *chiave - valore*: <br>
- Accesso rapido
- Chiave uniche
- Nessun ordine garantito degli elementi

## Metodi principali
- put (k,v): Inserisce o sovrascrive coppia.
- get (k): Recupera valore (null se chiave assente).
- remove (k): Rimuove coppia, restituisce valore
- containsKey (k): Verifica esistenza chiave.
<hr>
- size(): Numero elementi. 
- clear(): Svuota completamente gli elementi.
- keySet() / values() / entrySet(): Iterazione | Cicli for-each

# Quando usare l'HashMap
- Quando hai bisogno di cercare velocemente per chiave es.(dizionario, cache, configurazione). 
- Alternativa a *'ArrayList'* quando non serve ordinare ma associazione chiave-valore.
