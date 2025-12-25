# Classe Main (Final e Static)
Questa classe dimostra *final* (costanti immutabili) e *static* (appartenenti alla classe, condivisi).
*final*: Blocca modifica post-inizializzazione es.(ID univoco).
*static* Non legato a istanza; accessihile via classe es.(contatore globale).

### Esempio
- **final**: *private final String idPersona* - Assegnato in costruttore ("ID_0","ID_1" ...); non riassegnabile.
<br><br>
- **static**: *static int numeroPersone = 0* - Incrementato per creazione istanza (condiviso: 3 dopo tre oggetti).
<br><br>
Metodo static: *mostraNumeroPersona()* - Chiamato con *Persona.mostraNumeroPersone()* (no oggetto).
<br><br>
**Demo:** Crea tre Persona; toString() include ID.

### Output:
=== KEYWORD final e static ===
Nome: Luca Cognome: Rossi || (ID: ID_0)
Nome: Gennaro Cognome: Esposito || (ID: ID_1)
Nome: Elisa Cognome: Capelli || (ID: ID_2)
Numero persone create: 3
Totale persone create: 3