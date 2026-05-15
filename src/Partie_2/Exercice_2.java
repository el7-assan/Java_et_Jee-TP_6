package Partie_2;

import java.util.LinkedList;

public class Exercice_2 {
    public static void main(String[] args) {
        LinkedList<Client> fileAttente = new LinkedList<>();

        // 1. Ajouter les clients
        fileAttente.add(new Client(1, "Client A"));
        fileAttente.add(new Client(2, "Client B"));
        fileAttente.add(new Client(3, "Client C"));

        // 2. Afficher la file
        System.out.println("File d'attente : " + fileAttente);

        // 3. Servir le premier client
        System.out.println("Service du client : " + fileAttente.removeFirst());

        // 4. Ajouter un nouveau client en fin de file
        fileAttente.addLast(new Client(4, "Client D"));
        System.out.println("Après ajout d'un nouveau client : " + fileAttente);

        // 5. Afficher le client en tête de file
        System.out.println("Prochain client à servir : " + fileAttente.getFirst());
    }
}
