# TP 6 Java - Les Collections
## NOM : EL OMARI LAHCEN  
## Lien vers le projet : https://github.com/el7-assan/Java_et_Jee-TP_6.git


#### Pour réaliser ce document, j’ai rédigé le contenu dans un fichier Markdown (.md), puis je l’ai converti en format PDF à l’aide d’une extension de Visual Studio Code.

## 1. Partie 1 : ArrayList (Gestion des étudiants)
### Classe `Etudiant.java`
```java
package Partie_1;

public class Etudiant {
    private int id;
    private String nom;
    private double moyenne;

    public Etudiant(int id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public double getMoyenne() { return moyenne; }

    @Override
    public String toString() {
        return "Etudiant [ID=" + id + ", Nom=" + nom + ", Moyenne=" + moyenne + "]";
    }
}
```
### Classe `Exercice_1.java`
```java
package Partie_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) {
        ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 1
        listeEtudiants.add(new Etudiant(1, "Ahmed", 14.5));
        listeEtudiants.add(new Etudiant(2, "Sara", 17.0));
        listeEtudiants.add(new Etudiant(3, "Youssef", 12.0));
        listeEtudiants.add(new Etudiant(4, "Nadia", 15.5));
        listeEtudiants.add(new Etudiant(5, "Omar", 10.5));

        // 2
        System.out.println("--- Liste des étudiants ---");
        for (Etudiant e : listeEtudiants) System.out.println(e);

        // 3
        System.out.print("\nEntrez le nom à rechercher : ");
        String nomRecherche = "Sara";
        for (Etudiant e : listeEtudiants) {
            if (e.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Trouvé : " + e);
            }
        }

        // 4
        listeEtudiants.removeIf(e -> e.getId() == 3);

        // 5
        listeEtudiants.sort(Comparator.comparingDouble(Etudiant::getMoyenne));
        System.out.println("\n--- Liste triée ---");
        for (Etudiant e : listeEtudiants) System.out.println(e);

        // 6
        Etudiant meilleur = Collections.max(listeEtudiants, Comparator.comparingDouble(Etudiant::getMoyenne));
        System.out.println("\nMeilleur étudiant : " + meilleur);
    }
}
```

## 2. Partie 2 : LinkedList (File d'attente banque)
### Classe `Exercice_2.java`
```java
package Partie_2;

import java.util.LinkedList;

public class Exercice_2 {
    public static void main(String[] args) {
        LinkedList<Client> fileAttente = new LinkedList<>();
        fileAttente.add(new Client(1, "Client A"));
        fileAttente.add(new Client(2, "Client B"));
        System.out.println("Service : " + fileAttente.removeFirst());
        fileAttente.addLast(new Client(3, "Client C"));
        System.out.println("Tête : " + fileAttente.getFirst());
    }
}
```

## 3. Partie 3 : HashSet et TreeSet (Matières)
### Classe `Exercice_3.java`
```java
package Partie_3;

import java.util.HashSet;
import java.util.TreeSet;

public class Exercice_3 {
    public static void main(String[] args) {
        HashSet<String> matieres = new HashSet<>();
        matieres.add("Java");
        matieres.add("Réseaux");
        matieres.add("Java");
        TreeSet<String> triees = new TreeSet<>(matieres);
        System.out.println("Triées : " + triees);
    }
}
```

## 4. Partie 4 : HashMap (Notes)
### Classe `Exercice_4.java`
```java
package Partie_4;

import java.util.HashMap;

public class Exercice_4 {
    public static void main(String[] args) {
        HashMap<String, Double> notes = new HashMap<>();
        notes.put("Ali", 15.0);
        notes.put("Sara", 18.5);
        System.out.println("Notes : " + notes);
        notes.remove("Ali");
    }
}
```

## 5. Partie 5 : TreeMap (Classement)
### Classe `Exercice_5.java`
```java
package Partie_5;

import java.util.TreeMap;

public class Exercice_5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> etudiants = new TreeMap<>();
        etudiants.put(105, "Ahmed");
        etudiants.put(90, "Laila");
        System.out.println("Trie auto : " + etudiants);
    }
}
```

## 6. Partie 6 : Mini-Projet (Bibliothèque)
### Classe `Exercice_6.java`
```java
package Partie_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exercice_6 {
    public static void main(String[] args) {
        // 1
        ArrayList<Livre> bibliotheque = new ArrayList<>();
        bibliotheque.add(new Livre("111", "Java Programming", "Deitel", 2020));
        bibliotheque.add(new Livre("222", "Clean Code", "Robert Martin", 2008));

        // 2
        HashSet<String> categories = new HashSet<>();
        categories.add("Informatique");

        // 3
        HashMap<String, String> emprunts = new HashMap<>();
        emprunts.put("Ali", "111");

        // 4
        // 5
        // 6
        System.out.println("Bibliothèque : " + bibliotheque);

        // 7
        System.out.println("Total livres : " + bibliotheque.size());
    }
}
```
