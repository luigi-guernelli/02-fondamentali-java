# Spiegazione dettagliata: Incapsulamento, Getter e Setter
Cos'è l'incapsulamento uno dei pilastri OOP.

*"Nascondi i dettagli interni di una classe e fornisce un'interfaccia pubblica controllata"*. <br>

- Gli attributi sono private -> non accessibili dall'esterno.
- Si accede/modifica solo tramite metodi pubblic **(getter e setter)**.
- Proteggi l'oggetto da stati inconsistenti.

## Getter e Setter: Convenzioni
- **Getter**: *public Tipo getNome()* -> restituisce valore.
- **Setter**: *public void setNome(Tipo nome)* -> modifica (no return, o boolean per successo).
- **Nota**: Nel codice i setter restituiscono String -> errore comune! I setter non restituiscono il valore assegnato o al massimo boolaen.
- **Modo corretto:** *public void setNome(String nome)*.


# Classe Main (Incapsulamento)
Questa lezione introduce **l'incampsulamento**: nascondere gli attibuti (*private*) e fornire accesso tramite metodi pubblici (*getter*/*setter*).

- **Protegge i dati, permette validazione, rende il codice più robusto**.

# Classe Persona.java:
- Attributi *nome* e *cognome*; -> *private*. <br><br>
- Costruttore li inizializza <br>.
- *getNome()* / *getCognome()* -> **lettura**  <br>
- *setNome()* / *setCognome()* -> **scrittura con validazione (non vuoto)**.

# Classe Main.java
- Crea persona.  <br>
- Legge con getter. <br><br>
- Modifica con setter. <br><br>
- Ristampa con getter.

# Best practice
- Attributi sempre *private*.  <br><br>
- Getter sempre (per letture).  <br><br>
- Setter opzionale se (modificabile).  <br><br>

### Output
=== INCAPSULAMENTO GETTER E SETTER === <br><br>
Nome completo iniziale: Selvaggia Nelli <br><br>
Nome completo modifiato: Dante Cini


