# Polimorfismo (molte forme)
Il polimorfismo è uno dei quattro pilastri principali della Programmazione Orientata agli Oggetti (OOP), insieme a Incapsulamento, Ereditarietà e Astrazione.

"Polimorfismo" significa "molte forme" e descrive esattamente cosa fa: permette a oggetti di tipi diversi di essere trattati allo stesso modo, ma con comportamenti specifici.

# P36_Poliformismo
Questo progetto dimostra il **poliformismo** in JAVA. Simula una classe scolastica con *'Persona'* come superclasse base, e due sottoclassi: *'Insegnante'*; *'Studente'*.
Ogni tipo ha un metodo *'saluta()'* override per mostrare come lo stesso metodo possa avere comportamenti diversi a seconda dell'oggetto reale.


## File del progetto
- *Main.java*: Punto di ingresso; crea oggetti e chiama metodi per demo. <br><br>
- *Persona.java*: Superclasse base con attributi incapsulati (nome, cognome). <br><br>
- *'Insegnante.java'*: Sottoclasse che estende *'Persona'* e override *'saluta()'*. <br><br>
- *'Studente.java'*: Sottoclasse che estende *'Persona'* e override *'saluta()'*.

## Concetti utilizzati della OOP
- Ereditarietà (*'extends'*). <br><br>
- Override dei metodi (*'@Override'*). <br><br>
- Polimorfismo runtime: Array di superclasse per oggetti sottoclasse. <br><br>
- Incapsulamento: Attributi 'private' con getter/setter. <br><br>