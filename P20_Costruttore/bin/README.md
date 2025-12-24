# Classe Main (Costruttore)
Questa classe introduce i costruttori: metodi speciali per inizializzare oggetti su *new*.
Hanno nome classe, no return type; eseguiti automaticamente. Parametrizzati per setup *custom.this*: Riferimento all'istanza (evita confusione con parametri).

## Esempio
- Costruttore in Persona: Persona(String nome, ...) assegna a th
is.nome = nome;.

- Creazione: new Persona("Mario", "Rossi", "Scorpione", 50) → Inizializza persona1.

- Accesso: persona1.nome → "Mario" (da attributo).

## Output
- "Ciao, mi chiamo Mario Rossi, sono del segno dello Scorpione e ho 50 anni!"
<br><br>
- "Ciao, mi chiamo Anna Rosa, sono del segno dello Acquario e ho 35 anni!"