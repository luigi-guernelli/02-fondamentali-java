# Classe Main (Overload Costruttori)
Questa classe dimostra overload dei costruttori: multipli con stesso nome ma parametri diversi, per inizializzazioni flessibili (es. base con 2 param vs completa con 7).
Java chiama matching esatto; campi non impostati = null (gestiti con ternario in metodi).

## Esempi
- **Completo**: *new Piatto("bruschetta", "pasta", "carne", "verdure", "stagione", "torta", "amaro")* → Tutti campi impostati.

- **Base**: *new Piatto("patè", "riso")* → Solo antipasto/primo; altri null.

## Metodo stampaMenu()
Stampa menu con ternario per null (campo != null ? campo : "Non specificato").

### Output per piatto1:
=== MENU PIATTO === <br>
Antipasto: bruschetta <br>
PrimoPiatto: pasta <br>
SecondoPiatto: carne <br>
Contorno: verdure <br>
Frutta: stagione <br>
Dolce: torta <br>
Liquore: amaro <br>
======================

### Output per piatto2:
=== MENU PIATTO === <br>
Antipasto: patè <br>
PrimoPiatto: riso <br>
SecondoPiatto: Non specificato <br>
... (altri: Non specificato) <br>
======================