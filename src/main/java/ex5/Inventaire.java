package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Gère l'ensemble des caisses.
 */
public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 0, 5));
        caisses.add(new Caisse("Moyens objets", 5, 20));
        caisses.add(new Caisse("Grands objets", 20, Integer.MAX_VALUE));
    }

    /**
     * Ajouter un item dans la première caisse qui l'accepte.
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepter(item)) {
                caisse.ajouter(item);
                return;
            }
        }
        throw new IllegalStateException("Aucune caisse n'accepte cet item");
    }

    /**
     * Retourne le nombre total d'items.
     */
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}
