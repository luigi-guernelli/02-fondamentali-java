# FileIO - Lavorare con i File Java
Questa lezione è sulle operazioni fondamentali di **Input/Output su file** in Java utilizzando le classi del package 'java.io'.

# Obiettivi didattici:
- Verificare l'esistenza di un file e ottenere informazioni (percorso, dimensione). <br><br>
- Scrivere testo in un file (sovrascrivere o append). <br><br>
- Leggere il contenuto di un file. <br><br>
- Eliminare un file. <br><br>
- Applicare **try-with-resources** per la chiusura automatica delle risorse. <br><br>
- Seperare la logica di gestione file del 'main' (principio di responsabilità singola).

# Struttura del Progetto
- **Main** -> Demo semplice e leggibile delle operazioni. <br><br>
- **GestoreFile** -> Classe dedicata alla gestione file. <br><br>

## Concetti utilizzati Java
- **'java.io.File'**: rappresenta un file directory. <br><br>
- **'FileWriter'**: scrittura caratteri con (**append**). <br><br>
- **'FileReader'**: lettura caratteri. <br><br>
- **'try-with-resources'**: garantisce chiusura automatica di risorse che implementano 'AutoCloseable'. <br><br>
- Gestione eccezioni ('IOException', 'FileNotFoundException'). <br><br>
- Incapsulamento e metodi pubblici chiari. <br><br>

## Funzioni Attuali
- **Verifica esistenza**: *verificaEsistenza()*; (stampa percorso, dimensione). <br><br>
- **Scrittura (sovrascrivi/append)**: *scriviFile(testo, append)*; (scrive una riga con \n automatico). <br><br>
- **Lettura**: *leggiFile()*: (stampa contenuto carattere per carattere). <br><br>
- **Eliminazione file**: *eliminaFile()*: (cancella completamente il file dal disco).

