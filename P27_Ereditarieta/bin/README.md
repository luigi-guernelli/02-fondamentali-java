# Classe Main (Ereditarietà)
Questa clsse dimostra l'ereditarietà: Sottoclassi (*extends*) ereditano attributi/metodi da superclasse, aggiungono/override per specializzazione.

- **Poliformismo**: Stessa chiamata(*presentazione()*) -> Output diverso per tipo (runtime).
<br><br>
- *super*: Chiama superclasse es.(costruttore). *protected*: Accesso ereditato.

## Struttura:
- **Super**: Persona(nome; cognome; metodi base).
<br><br>

- **Sottoclasse Professore**: Agginge materia/classi; override per prof es.(Brown: "1.21 gigawatt!").
<br><br>

- **Sottoclasse Studente**: Aggiunge istituto/voti; override per studente (Marty: "This is heavy, Doc!").


### Output
=== Emmet Brown (Docente) === <br><br>
Chi sono: Professor Emmet Brown (insegno Fisica Quantistica). <br><br>
Specializzazione: Fisica Quantistica (classi: 1A, 2B, 3C). <br><br>
Citazione: '1.21 gigawatt! Non è energia, è potenza!' - Emmet Brown <br><br>

=== Gerald Strickland (Docente/Preside) === <br><br>
Chi sono: Professor Gerald Strickland (insegno Disciplina Scolastica). <br><br>
Specializzazione: Disciplina Scolastica (classi: 1A, 2B, 3C). <br><br>
Citazione: 'Mai in ritardo, mai in prigione!' - Gerald Strickland
<br><br>

=== Marty McFly (Studente) === <br><br>
Chi sono: Marty McFly (studente a Hill Valley High, classe 1A). <br><br>
Specializzazione: Passato, Presente, Futuro – Viaggi nel tempo a Hill Valley! <br><br>
Media voti: 5.5/10 <br><br>
Citazione: 'This is heavy, Doc!' - Marty McFly (pesante come un viaggio nel tempo).