# Classe Main (Switch)
Questa classe usa *switch* per eseguire codice diverso basato su valore di una variabile (es. String).
È efficiente per multipli casi discreti; alternativa a if-else annidati.
**Struttura**: switch (var) { case valore: codice; break; } (break ferma esecuzione).

### Esempio con tipo = "Backend":

**case "Welcome":** "Benvenuto in Java!" (non eseguito).
**case "Description":** "Primo linguaggio... oggetti!" (non).
**case "GoodBye":** "Arrivederci al prossimo progetto" (non).
**default:** "Messaggio nel case: Backend" (eseguito).

Cambia *tipo* per testare. Nota: Fall-through se no break (esegue cases successivi).