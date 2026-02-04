package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utilitaires de formatage de dates.
 */
public class DateUtils {

    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    /**
     * Formater une date avec un pattern donné.
     *
     * @param pattern pattern SimpleDateFormat (non null et non vide)
     * @param date date à formater (non null)
     * @return date formatée
     * @throws IllegalArgumentException si pattern ou date invalide
     */
    public static String format(String pattern, Date date) {
        if (pattern == null || pattern.isBlank()) {
            throw new IllegalArgumentException("Le pattern ne doit pas être vide");
        }
        if (date == null) {
            throw new IllegalArgumentException("La date ne doit pas être null");
        }
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * Formater une date avec le pattern par défaut.
     *
     * @param date date à formater (non null)
     * @return date formatée
     */
    public static String formatDefaut(Date date) {
        return format(DEFAULT_PATTERN, date);
    }
}
