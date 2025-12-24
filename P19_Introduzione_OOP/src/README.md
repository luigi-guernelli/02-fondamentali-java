# Classe Main (Intro OOP)
Questa classe introduce l'OOP: programmazione orientata agli oggetti, dove tutto è modellato su "oggetti" (istanze di "classi").
Classe: Blueprint/template (es. Persona: definisce attributi/metodi).
Oggetto: Istanza concreta es.(*new Persona()* crea persona1 con stato proprio).

# Concetti base
- **Attributi (campi)**: Stato/dati es.(*nome = "Luca";* – visibili via oggetto).

- **Metodi**: Comportamento/azioni es.(*presentazione()* stampa; invocato con *persona1.presentazione()*).

- **Creazione oggetto**: *Tipo nome = new Tipo();* (costruttore implicito).

- **Accesso**: Dot notation (*oggetto.metodo()* o *oggetto.attributo*).

### Esempio
- *Persona persona1 = new Persona();* → Crea oggetto con default (nome="Luca", etc.).
<br><br>
- **Output:**<br>
Benvenuto sono Luca Rossi <br>
Sta scrivendo con la penna Blue