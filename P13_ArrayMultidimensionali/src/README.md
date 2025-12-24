## Classe Main (Array 2D)
Questa classe esplora array multidimensionali 2D: tabelle con righe/colonne per dati strutturati (es. classi/studenti).

**Accesso**: *array[riga][colonna]* (indici da 0; length: array.length per righe, array[riga].length per colonne).

## Creazione
- **Vuota**: *String[][] classi = new String[3][5];* (3 classi, 5 studenti; default null).<br>

- **Inizializzata**: *{ {"Luca", "Anna"}, {"Mario", "Giovanni"} }*.

## Assegnazione/Accesso
- Es. *classi[0][0] = "Mario";* → Studente primo di prima classe.
- **Lettura**: *classi[1][0]* → "Bruno".

## Iterazioni:
- **For annidati**: Esterno (righe), interno (colonne).
**Output**:<br>
Classe 1:<br>
- Mario<br>
- Bianca<br>
... (5 studenti)<br>

Classe 2:<br>
... (fino a Classe 3)

- **Foreach annidato**: Su righe (array), poi elementi.
**Output**:<br>
Nuova classe:<br>
Nome: Luca<br>
Nome: Anna<br>
Nome: Marco<br>

Nuova classe:
... (3 classi)
