## Classe Main (Array 1D)
Questa classe introduce gli array 1D: strutture fisse per valori omogenei, accessibili per indice (0-based).
**Dimensione:** *length* (immutabile, ultimo indice = length-1).
**Creazione:**
- Vuoto: int[] numeri = new int[3]; (default 0).
- Inizializzato: int[] index = {10, 20, 30, 40};.

## Accesso/Modifica
- Lettura: *numeri[1]* → 20 (iniziale).
- Scrittura: *numeri[1] = 100;* → Modificato.
- Es. *index[0]* = 10; length = 4.

### Iterazioni
- **For tradizionale:** Usa indice per controllo preciso (es. modifica).
**Output:** index[0] = 10 ... index[3] = 40. <br><br>
- **For enhanced** (foreach): Su valori diretti, read-only. <br>
**Output:** Valore: 10, 100, 30 (da numeri).