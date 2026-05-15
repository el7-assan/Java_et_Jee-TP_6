package Partie_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) {
        ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 1. Ajouter 5 étudiants
        System.out.println("--- Ajout de 5 étudiants ---");
        listeEtudiants.add(new Etudiant(1, "Ahmed", 14.5));
        listeEtudiants.add(new Etudiant(2, "Sara", 17.0));
        listeEtudiants.add(new Etudiant(3, "Youssef", 12.0));
        listeEtudiants.add(new Etudiant(4, "Nadia", 15.5));
        listeEtudiants.add(new Etudiant(5, "Omar", 10.5));

        // 2. Afficher tous les étudiants
        System.out.println("\n--- Liste des étudiants ---");
        for (Etudiant e : listeEtudiants) System.out.println(e);

        // 3. Rechercher un étudiant par son nom
        System.out.print("\nEntrez le nom à rechercher : ");
        String nomRecherche = scanner.next();
        boolean trouve = false;
        for (Etudiant e : listeEtudiants) {
            if (e.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Trouvé : " + e);
                trouve = true;
                break;
            }
        }
        if (!trouve) System.out.println("Étudiant non trouvé.");

        // 4. Supprimer un étudiant par son id
        System.out.print("\nEntrez l'ID à supprimer : ");
        int idSuppr = scanner.nextInt();
        listeEtudiants.removeIf(e -> e.getId() == idSuppr);
        System.out.println("Après suppression :");
        for (Etudiant e : listeEtudiants) System.out.println(e);

        // 5. Trier les étudiants par moyenne croissante
        listeEtudiants.sort(Comparator.comparingDouble(Etudiant::getMoyenne));
        System.out.println("\n--- Liste triée par moyenne croissante ---");
        for (Etudiant e : listeEtudiants) System.out.println(e);

        // 6. Afficher l’étudiant ayant la meilleure moyenne
        if (!listeEtudiants.isEmpty()) {
            Etudiant meilleur = Collections.max(listeEtudiants, Comparator.comparingDouble(Etudiant::getMoyenne));
            System.out.println("\nMeilleur étudiant : " + meilleur);
        }

        scanner.close();
    }
}
