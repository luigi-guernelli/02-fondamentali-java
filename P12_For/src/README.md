# Classe Main (Ciclo For)
Questa classe introduce il ciclo *for* per ripetere codice un numero noto di volte es.(array, tabelle).

**Struttura:** *for (int i=0; i<limite; i++) { ... }* 
– **inizializza, verifica condizione, incrementa**.

## For semplice: Contatore base.
- Es. for (int i=0; i<4; i++) → Stampa "Riga: 0/1/2/3".

## For annidati: Ciclo interno dentro esterno (es. matrici 2D).
- Esterno (i): Righe (0-3).
- Interno (j): Colonne (0-3 per riga).

## Output simulazione griglia:
Riga: 0 <br>
Colonna: 0 Colonna: 1 Colonna: 2 Colonna: 3 
<br><br>
Riga: 1 <br>
Colonna: 0 Colonna: 1 Colonna: 2 Colonna: 3 <br>
... (fino a Riga 3)

**Uso:** For per iterazioni fisse; annidati per tabelle/righe-colonne. Evita infinito con incremento.