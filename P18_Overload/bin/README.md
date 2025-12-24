# Classe Main (Overloaded Methods)
Questa classe dimostra l'overloading: multipli metodi con stesso nome ma parametri diversi (numero, tipo, ordine).
Java risolve chiamata in compile-time basandosi su match esatto. Non su return type.

Esempio: Metodo *addizione* sovraccaricato per somme.

## Overload -> Parametri -> Chiamata -> Return
- 1,2 int, "addizione(2, 3)", 5 (int)
- 2,3 int,"addizione(2, 3, 4)", 9 (int)
- 3,2 double,"addizione(2.5, 3.5)", 6.0 (double)

## Output:
- "Somma di 2 int: 5"
- "Somma di 3 int: 9"
- "Somma di 2 double: 6.0"