package Partie_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exercice_6 {
    public static void main(String[] args) {
        // 1. Stocker les livres dans un ArrayList
        ArrayList<Livre> bibliotheque = new ArrayList<>();
        bibliotheque.add(new Livre("111", "Java Programming", "Deitel", 2020));
        bibliotheque.add(new Livre("222", "Clean Code", "Robert Martin", 2008));
        bibliotheque.add(new Livre("333", "Effective Java", "Joshua Bloch", 2017));

        // 2. HashSet pour les catégories (simulation)
        HashSet<String> categories = new HashSet<>();
        categories.add("Informatique");
        categories.add("Programmation");

        // 3. HashMap pour associer un étudiant à un livre
        HashMap<String, String> emprunts = new HashMap<>(); // Etudiant -> ISBN
        emprunts.put("Ali", "111");
        emprunts.put("Sara", "222");

        // 4. Rechercher un livre par ISBN
        String isbnCherche = "111";
        System.out.println("Recherche ISBN 111 :");
        for (Livre l : bibliotheque) {
            if (l.getIsbn().equals(isbnCherche)) {
                System.out.println("Livre trouvé : " + l);
            }
        }

        // 5. Supprimer un livre
        bibliotheque.removeIf(l -> l.getIsbn().equals("333"));
        System.out.println("\nAprès suppression de l'ISBN 333");

        // 6. Afficher tous les livres disponibles
        System.out.println("\nLivres dans la bibliothèque :");
        for (Livre l : bibliotheque) System.out.println(l);

        // 7. Générer un rapport final
        System.out.println("\n--- Rapport Final ---");
        System.out.println("Nombre total de livres : " + bibliotheque.size());
        System.out.println("Catégories gérées : " + categories);
        System.out.println("Emprunts en cours : " + emprunts);
    }
}
