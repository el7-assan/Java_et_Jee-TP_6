package Partie_5;

import java.util.TreeMap;

public class Exercice_5 {
    public static void main(String[] args) {
        // 1. Utiliser un TreeMap<Integer, String>
        TreeMap<Integer, String> etudiants = new TreeMap<>();

        // 2. Ajouter plusieurs étudiants
        etudiants.put(105, "Ahmed");
        etudiants.put(90, "Laila");
        etudiants.put(120, "Mehdi");
        etudiants.put(50, "Salma");

        // 3. Afficher la liste triée automatiquement par ID
        System.out.println("Liste triée : " + etudiants);

        // 4. Premier et dernier
        System.out.println("Premier étudiant : " + etudiants.firstEntry());
        System.out.println("Dernier étudiant : " + etudiants.lastEntry());

        // 5. Extraire étudiants avec numéro > 100
        System.out.println("Étudiants avec ID > 100 : " + etudiants.tailMap(101));
    }
}
