# P38 Iteratori
Questa lezione sull' **Iterator**, l'oggetto standard per scorrere collezioni Java.

## Perchè usare Iterator
- Scorrimento sequenziale sicuro.
- Rimozione elementi **durante** l'iterazione senza *'ConcurrentModificationException'*.
- Funziona con tutte le collezioni che implementano *'Iterable'* (ArrayList, LinkedList, HashSet, ecc).

## Metodi principali
- *hashNext()*: true se c'è un elemento successiono; Controllo prima di next().
- *next()*: restituisce elemento successivo e avanza cursore; Lancia eccezione se oltre.
- *remove()*; rimuove l'ultimo elemento restituito da next(): **Unico modo sicuro** durante ciclo.

## Quando usare Iterator vs for-each
- Solo lettura (for-each): piu leggibile.
- Rimozione durante iterazione **Iterator.remove()** (obbligatorio).
- Accesso a indice (for classico).
- Collezione non ordinata (Set) Iterator o for-each.