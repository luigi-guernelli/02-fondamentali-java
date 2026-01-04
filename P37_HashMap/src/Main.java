import java.util.HashMap;
import java.util.Map;

/**
 * P37: HashMap in Java
 * 
 * HashMap è una collezione che memorizza dati in coppie chiave-valore (key-value).
 * 
 * Caratteristiche principali:
 * - Accesso veloce (O(1) medio) grazie all'hashing
 * - Chiavi uniche (non duplicate)
 * - Valori possono essere duplicati
 * - Ordine non garantito (a differenza di LinkedHashMap)
 * - Permette una chiave null e valori null
 * 
 * Metodi comuni:
 * - put(k,v)      → aggiungi/modifica
 * - get(k)        → recupera valore
 * - remove(k)     → rimuovi coppia
 * - containsKey(k)→ verifica chiave
 * - size()        → numero elementi
 * - clear()       → svuota tutto
 * - keySet() / values() / entrySet() → iterazione
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== HASHMAP IN JAVA ===\n");

        // 1. Creazione di una HashMap
        HashMap<String, String> capitali = new HashMap<>();
        // Oppure con generics chiari (raccomandato)
        // Map<String, String> capitali = new HashMap<>();

        // 2. Aggiunta elementi con put()
        System.out.println("1. Aggiunta elementi:");
        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        capitali.put("Germania", "Berlino");
        capitali.put("Inghilterra", "Londra");
        capitali.put("Spagna", "Madrid");

        // Se chiave esiste già, sovrascrive il valore
        capitali.put("Italia", "ROMA");  // Sovrascrive "Roma"

        System.out.println("   HashMap dopo inserimenti: " + capitali);
        System.out.println("   Dimensione: " + capitali.size() + " elementi\n");

        // 3. Accesso a un elemento con get()
        System.out.println("2. Accesso a elementi:");
        System.out.println("   Capitale Italia: " + capitali.get("Italia"));      // ROMA
        System.out.println("   Capitale Giappone: " + capitali.get("Giappone")); // null (non esiste)
        System.out.println();

        // 4. Verifica esistenza chiave
        System.out.println("3. Verifica esistenza:");
        System.out.println("   Esiste 'Francia'? " + capitali.containsKey("Francia"));  // true
        System.out.println("   Esiste 'Giappone'? " + capitali.containsKey("Giappone")); // false
        System.out.println();

        // 5. Rimozione di un elemento
        System.out.println("4. Rimozione:");
        String rimossa = capitali.remove("Spagna");
        System.out.println("   Rimossa capitale Spagna: " + rimossa);  // Madrid
        System.out.println("   Dopo rimozione: " + capitali);
        System.out.println("   Dimensione: " + capitali.size() + "\n");

        // 6. Iterazione sulla HashMap
        System.out.println("5. Iterazione (tre modi comuni):");

        // Modo 1: Solo chiavi
        System.out.println("   Solo nazioni (keySet()):");
        for (String nazione : capitali.keySet()) {
            System.out.println("     → " + nazione);
        }

        // Modo 2: Solo valori
        System.out.println("   Solo capitali (values()):");
        for (String capitale : capitali.values()) {
            System.out.println("     → " + capitale);
        }

        // Modo 3: Coppie chiave-valore (entrySet() - più comune)
        System.out.println("   Coppie nazione-capitale (entrySet()):");
        for (Map.Entry<String, String> entry : capitali.entrySet()) {
            System.out.println("     " + entry.getKey() + " → " + entry.getValue());
        }
        System.out.println();

        // 7. Pulizia completa
        System.out.println("6. Pulizia completa:");
        capitali.clear();
        System.out.println("   HashMap dopo clear(): " + capitali);
        System.out.println("   È vuota? " + capitali.isEmpty());  // true
    }
}