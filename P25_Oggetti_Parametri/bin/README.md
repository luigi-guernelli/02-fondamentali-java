# Classe Main (Oggetti e Parametri)
Questa classe dimostra passaggio oggetti come parametri: Per reference (puntatore all'originale), non copia.
Modifiche nel metodo persistono sull'oggetto globale; ideale per interazioni es.(diloghi, condivisione stato).

### Esempio
- Crea *persona1* ("Dante Cini") e *persona2* ("Selvaggia Nelli"). <br><br>

- *persona1.presentazione(persona2)*: Usa attributi di *persona2* (reference) + *this*(persona1). <br><br>

- *persona2.risposta(persona1)*: SImile, inverso.

### Output
Buongiorno Selvaggia io sono Dante Cini.<br><br>
Piacere Dante io sono Selvaggia Nelli.


# Concetto, Descrizione, Esempio
- **Pass by Reference**: Metodo riceve puntatore; modifiche globali.
*"presentazione(personaSiPresenta)*: Legge *personaSiPresenta.nome* (""Selvaggia"")" <br><br>

- **Interazione**: Metodi usano attributi parametro + istanza.
Stampa saluto con nomi da entrambi oggetti. <br><br>

- **Vantaggi**: Condividi dati senza copie; efficiente per oggetti grandi.
Simula conversazione tra istanze
