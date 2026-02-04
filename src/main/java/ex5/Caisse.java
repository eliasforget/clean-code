package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une caisse capable d'accepter des objets
 * selon une plage de poids.
 */
public class Caisse {

    private String nom;
    private int poidsMin;
    private int poidsMax;
    private List<Item> items;

    /**
     * @param nom nom de la caisse
     * @param poidsMin poids minimum accepté (inclus)
     * @param poidsMax poids maximum accepté (exclus)
     */
    public Caisse(String nom, int poidsMin, int poidsMax) {
        this.nom = nom;
        this.poidsMin = poidsMin;
        this.poidsMax = poidsMax;
        this.items = new ArrayList<>();
    }

    /**
     * Indique si la caisse accepte l'item.
     */
    public boolean accepter(Item item) {
        return item.getPoids() >= poidsMin && item.getPoids() < poidsMax;
    }

    /**
     * Ajouter un item si accepté.
     */
    public void ajouter(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public String getNom() {
        return nom;
    }
}
