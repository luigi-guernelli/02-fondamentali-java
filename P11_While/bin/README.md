# Classe Main (Cicli While/Do-While)
Questa classe introduce i cicli per ripetere codice mentre una condizione è true.
Automatizzano processi (es. contatori, input ripetuti). Evita loop infiniti con incremento.

- **While**: Verifica condizione prima; non entra se falsa all'inizio.<br>
Es. *int i=0; while (i < 0) { ... i++; }* → Nessuna iterazione (i=0 non <0).<br>
**Output**: "While terminato (nessuna iterazione)".<br>
<br><br>
- **Do-While**: Esegue almeno una volta, verifica dopo.<br>
Es. do { ... i++; } while (i < 0); → Stampa i=0, poi esce (i=1 non <0).<br>
**Output**: *"do-while: 0"* + "Do-while terminato (una iterazione)".

**Demo migliorata**: Cambia i < 0 in i < 5 per 5 iterazioni; reset i=0 prima do-while.<br>
**Uso**: While per array noti; do-while per menu utente.