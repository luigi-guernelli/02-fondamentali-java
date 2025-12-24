# Classe Persona (toString)
Questa classe modella una persona con attributi (scope globale) e override di *toString()* per output testuale.

- *toString()*: Ereditato da Object; override per descrizione custom (invece di "Persona@hash").

- Usato implicitamente in *println(obj)*, concat + , toString calls.

- **Attributi globali*: *nome, cognome, annoNascita, eta* – inizializzati in costruttore.

## Esempio uso (da Main esterna)
*Persona p = new Persona("Mario", "Rossi", 1990, 35);*
*System.out.println(p);  // Chiama toString()*

**Output:** *Mario Rossi (nato nel 1990, età 35)*