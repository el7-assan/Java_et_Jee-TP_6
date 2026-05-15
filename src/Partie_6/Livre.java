package Partie_6;

public class Livre {
    private String isbn;
    private String titre;
    private String auteur;
    private int annee;

    public Livre(String isbn, String titre, String auteur, int annee) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getIsbn() { return isbn; }
    public String getTitre() { return titre; }

    @Override
    public String toString() {
        return "Livre [ISBN=" + isbn + ", Titre=" + titre + ", Auteur=" + auteur + ", Année=" + annee + "]";
    }
}
