import java.io.*;

/**
 * P35: Classe GestoreFile - Gestisce operazioni base sui file.
 * 
 * Metodi:
 * - verificaEsistenza(): Controlla se file esiste e stampa info.
 * - scriviFile(): Scrive/appende testo (con try-with-resources).
 * - leggiFile(): Legge e stampa contenuto carattere per carattere.
 * - eliminaFile(): Rimuove il file.
 * 
 * Usa try-with-resources per chiusura automatica risorse.
 */
public class GestoreFile {

    private String nomeFile;

    public GestoreFile(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    /**
     * Verifica se il file esiste e stampa informazioni utili.
     */
    public void verificaEsistenza() {
        File file = new File(nomeFile);

        if (file.exists()) {
            System.out.println("✅ Il file esiste!");
            System.out.println("   Percorso relativo: " + file.getPath());
            System.out.println("   Percorso assoluto: " + file.getAbsolutePath());
            System.out.println("   È un file (non cartella): " + file.isFile());
            System.out.println("   Dimensione: " + file.length() + " byte");
        } else {
            System.out.println("❌ Il file '" + nomeFile + "' non esiste.");
        }
    }

    /**
     * Scrive testo nel file (sovrascrive o appende).
     * 
     * @param testo Testo da scrivere
     * @param append true = aggiungi, false = sovrascrivi
     */
    public void scriviFile(String testo, boolean append) {
        // try-with-resources: chiude automaticamente il writer
        try (FileWriter writer = new FileWriter(nomeFile, append)) {
            writer.write(testo + "\n");
            System.out.println("✔️ Scrittura completata (append=" + append + "): " + testo);
        } catch (IOException e) {
            System.err.println("❌ Errore durante la scrittura: " + e.getMessage());
        }
    }

    /**
     * Legge e stampa il contenuto del file.
     */
    public void leggiFile() {
        File file = new File(nomeFile);

        if (!file.exists()) {
            System.out.println("❌ Impossibile leggere: file non esiste.");
            return;
        }

        try (FileReader reader = new FileReader(file)) {
            System.out.println("📖 Contenuto del file '" + nomeFile + "':");
            System.out.println("-".repeat(40));

            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\n" + "-".repeat(40));
            System.out.println("✔️ Lettura completata.");

        } catch (FileNotFoundException e) {
            System.err.println("❌ File non trovato durante lettura.");
        } catch (IOException e) {
            System.err.println("❌ Errore I/O durante lettura: " + e.getMessage());
        }
    }

    /**
     * Elimina il file (usa con cautela!).
     */
    public boolean eliminaFile() {
        File file = new File(nomeFile);
        if (file.exists()) {
            boolean eliminato = file.delete();
            System.out.println(eliminato ? "🗑️ File eliminato." : "❌ Errore eliminazione.");
            return eliminato;
        } else {
            System.out.println("ℹ️ File non esiste → niente da eliminare.");
            return false;
        }
    }

    // Getter per nome file
    public String getNomeFile() {
        return nomeFile;
    }
}