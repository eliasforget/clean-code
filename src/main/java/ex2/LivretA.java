package ex2;

/**
 * Représenter un livret A.
 * Règle : un livret A ne doit jamais être à découvert (solde >= 0).
 */
public class LivretA extends CompteBancaire {

    private final double tauxRemunerationAnnuel; // en %

    /**
     * Créer un livret A.
     *
     * @param solde solde initial (>= 0)
     * @param tauxRemunerationAnnuel taux annuel en % (>= 0)
     */
    public LivretA(double solde, double tauxRemunerationAnnuel) {
        super(solde, 0);
        if (solde < 0) {
            throw new IllegalArgumentException("Le solde initial d'un Livret A doit être >= 0");
        }
        if (tauxRemunerationAnnuel < 0) {
            throw new IllegalArgumentException("Le taux doit être >= 0");
        }
        this.tauxRemunerationAnnuel = tauxRemunerationAnnuel;
    }

    /**
     * Débiter sans jamais passer en négatif.
     */
    @Override
    public boolean debiterMontant(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être > 0");
        }
        double nouveauSolde = getSolde() - montant;
        if (nouveauSolde >= 0) {
            return super.debiterMontant(montant);
        }
        return false;
    }

    /**
     * Appliquer la rémunération annuelle.
     */
    public void appliquerRemunerationAnnuelle() {
        double interets = getSolde() * (tauxRemunerationAnnuel / 100.0);
        ajouterMontant(interets);
    }

    public double getTauxRemunerationAnnuel() {
        return tauxRemunerationAnnuel;
    }
}
