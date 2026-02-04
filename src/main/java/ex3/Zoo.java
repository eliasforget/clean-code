package ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Représenter un zoo contenant des animaux.
 */
public class Zoo {

    private String nom;
    private final List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajouter un animal au zoo.
     *
     * @param nomAnimal nom de l'animal
     * @param typeAnimal type (ex: MAMMIFERE, POISSON...)
     * @param comportement comportement (ex: HERBIVORE, CARNIVORE...)
     */
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        animaux.add(new Animal(nomAnimal, typeAnimal, comportement));
    }

    public void afficherListeAnimaux() {
        for (Animal a : animaux) {
            System.out.println(a.getNom() + " " + a.getType() + " " + a.getComportement());
        }
    }

    public int taille() {
        return animaux.size();
    }

    public List<Animal> getAnimaux() {
        return Collections.unmodifiableList(animaux);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
