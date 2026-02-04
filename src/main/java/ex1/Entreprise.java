package ex1;

import java.util.Date;

/**
 * Représenter une entreprise (exemple pédagogique).
 */
public class Entreprise {

    /** Capital maximum (exemple). */
    public static final int CAPITAL_MAX = 3_000_000;

    /** Identifiant SIRET. */
    private int siret;

    /** Nom de l'entreprise. */
    private String nom;

    /** Adresse postale. */
    private String adresse;

    /** Date de création. */
    private Date dateCreation;

    /**
     * Afficher un statut simple sur la sortie standard (exemple).
     */
    public void afficherStatut() {
        System.out.println("Entreprise{" +
                "siret=" + siret +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", dateCreation=" + dateCreation +
                '}');
    }

    // Getters/Setters si nécessaires (non présents initialement)
}
