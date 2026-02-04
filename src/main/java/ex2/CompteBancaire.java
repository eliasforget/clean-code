package ex2;

/**
 * Représenter un compte bancaire (compte courant) avec un solde et un découvert autorisé.
 * Le découvert autorisé est exprimé comme un montant positif.
 * Invariant : le solde ne doit pas descendre en dessous de -decouvertAutorise.
 */
public class CompteBancaire {

    private double solde;
    private double decouvertAutorise;

    /**
     * Créer un compte courant.
     *
     * @param solde solde initial
     * @param decouvertAutorise montant de découvert autorisé (>= 0)
     */
    public CompteBancaire(double solde, double decouvertAutorise) {
        if (decouvertAutorise < 0) {
            throw new IllegalArgumentException("Le découvert autorisé doit être >= 0");
        }
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    /**
     * Créditer le compte.
     *
     * @param montant montant strictement positif
     */
    public void ajouterMontant(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être > 0");
        }
        this.solde += montant;
    }

    /**
     * Débiter le compte si le découvert autorisé n'est pas dépassé.
     *
     * @param montant montant strictement positif
     * @return true si le débit a été effectué, false sinon
     */
    public boolean debiterMontant(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être > 0");
        }
        double nouveauSolde = this.solde - montant;
        if (nouveauSolde >= -decouvertAutorise) {
            this.solde = nouveauSolde;
            return true;
        }
        return false;
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise < 0) {
            throw new IllegalArgumentException("Le découvert autorisé doit être >= 0");
        }
        this.decouvertAutorise = decouvertAutorise;
    }
}
