# Classe Main (Condizioni)
Questa classe introduce le strutture condizionali per decisioni nel codice.
Esegue blocco solo se condizione è true (boolean). Esempio: Stato chat (Online/Offline).

- if: Se condizione true, esegui blocco.
Es. if (userNameA == "NomeUser") { Online } → Online (cambia valore per test).

- else: Altrimenti (se if false).
Es. Su isOnline = false → Offline.

- else if: Altrimenti se (catena condizioni).
Es. Su userNameB = "NoName" → "Nessun NomeUser trovato" (annidato).

- Ternary (? :): Espressione compatta: condizione ? valoreVero : valoreFalso.
Es. (1 > 2) ? "UserOn" : "UserOff" → "UserOff".

### Nota: Per String, usa userName.equals("NomeUser") invece di == per confrontare contenuto.