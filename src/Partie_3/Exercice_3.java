package Partie_3;

import java.util.HashSet;
import java.util.TreeSet;

public class Exercice_3 {
    public static void main(String[] args) {
        // 1. Ajouter des matières dans un HashSet
        HashSet<String> matieres = new HashSet<>();
        matieres.add("Java");
        matieres.add("Base de données");
        matieres.add("Réseaux");
        matieres.add("Web");
        
        // 2. Vérifier qu'aucun doublon n'existe
        matieres.add("Java"); // Doublon

        // 3. Afficher les matières
        System.out.println("Matières (HashSet) : " + matieres);

        // 4. Copier dans un TreeSet
        TreeSet<String> matieresTriees = new TreeSet<>(matieres);

        // 5. Afficher triées par ordre alphabétique
        System.out.println("Matières triées (TreeSet) : " + matieresTriees);
    }
}
