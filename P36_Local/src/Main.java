import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * P37: LocalDate, LocalTime e LocalDateTime in Java
 * 
 * Classe moderna per gestire data e ora (package java.time - Java 8+).
 * 
 * Vantaggi rispetto alle vecchie Date/Calendar:
 * - Immutable (thread-safe)
 * - API chiara e intuitiva
 * - Gestione fusi orari semplice (con ZoneId)
 * - Formattazione potente con DateTimeFormatter
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== LOCALDATE, LOCALTIME E LOCALDATETIME ===\n");

        // 1. Data e ora corrente
        LocalDateTime adesso = LocalDateTime.now();
        System.out.println("1. Data e ora corrente (default ISO):");
        System.out.println("   " + adesso);  
        // Esempio output: 2026-01-02T15:30:45.123456789

        System.out.println();

        // 2. Formattazione personalizzata
        System.out.println("2. Formattazione con pattern personalizzati:");

        DateTimeFormatter formatoItaliano = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoEsteso = DateTimeFormatter.ofPattern("d MMMM yyyy");
        DateTimeFormatter formatoCompleto = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy - HH:mm:ss");

        System.out.println("   Formato italiano (dd/MM/yyyy): " + adesso.format(formatoItaliano));
        System.out.println("   Formato esteso (d MMMM yyyy): " + adesso.format(formatoEsteso));
        System.out.println("   Formato completo: " + adesso.format(formatoCompleto));

        System.out.println();

        // 3. Solo data o solo ora
        System.out.println("3. LocalDate e LocalTime separati:");

        LocalDate soloData = LocalDate.now();
        LocalTime soloOra = LocalTime.now();

        System.out.println("   Solo data: " + soloData);
        System.out.println("   Solo ora: " + soloOra);
        System.out.println("   Ora formattata (HH:mm): " + soloOra.format(DateTimeFormatter.ofPattern("HH:mm")));

        System.out.println();

        // 4. Creazione date specifiche
        System.out.println("4. Creazione date/orari specifici:");

        LocalDate annoNascita = LocalDate.of(1995, 5, 20);
        LocalDateTime appuntamento = LocalDateTime.of(2026, 12, 25, 18, 30);

        System.out.println("   Anno di Nascita: " + annoNascita.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("   Appuntamento Aggiornato: " + appuntamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
    }
}