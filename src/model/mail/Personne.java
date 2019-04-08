package model.mail;

public class Personne {

    private String prenom;
    private String nom;
    private String adresse;

    public Personne(String prenom, String nom, String adresse) {
        this.adresse = adresse;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }
}
