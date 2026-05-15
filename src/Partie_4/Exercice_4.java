package Partie_4;

import java.util.HashMap;
import java.util.Map;

public class Exercice_4 {
    public static void main(String[] args) {
        // 1. Utiliser un HashMap<String, Double>
        HashMap<String, Double> notes = new HashMap<>();

        // 2. Ajouter plusieurs étudiants avec leurs notes
        notes.put("Ali", 15.0);
        notes.put("Sara", 18.5);
        notes.put("Amine", 12.0);

        // 3. Afficher toutes les notes
        System.out.println("Toutes les notes : " + notes);

        // 4. Rechercher la note d'un étudiant
        System.out.println("Note de Sara : " + notes.get("Sara"));

        // 5. Modifier la note
        notes.put("Ali", 16.0);
        System.out.println("Notes après modification : " + notes);

        // 6. Supprimer un étudiant
        notes.remove("Amine");
        System.out.println("Notes après suppression : " + notes);

        // 7. Calculer la moyenne générale
        double somme = 0;
        for (double n : notes.values()) somme += n;
        System.out.println("Moyenne générale : " + (somme / notes.size()));
    }
}
