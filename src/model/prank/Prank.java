package model.prank;

import model.mail.Message;
import model.mail.Personne;

import java.util.ArrayList;
import java.util.List;

public class Prank {
    private Personne envoyeur;
    private final List<Personne> victimeTo= new ArrayList<>();
    private final List<Personne> victimeCC= new ArrayList<>();
    private String message;


    public Personne getEnvoyeur() {
        return envoyeur;
    }

    public void setEnvoyeur(Personne envoyeur) {
        this.envoyeur = envoyeur;
    }

    public ArrayList<Personne> getVictimeTo() {
        return new ArrayList<Personne>(victimeTo);
    }

    public void addVictimeTo(List<Personne> victimes) {
        victimeTo.addAll(victimes);
    }

    public ArrayList<Personne> getVictimeCC() {
        return new ArrayList<Personne>(victimeCC);
    }

    public void addVictimeCC(List<Personne> witness) {
        victimeCC.addAll(witness);
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message genererMail() {
        Message message = new Message();

        message.setCorps(this.message + "\n\n" + envoyeur.getPrenom() + " " + envoyeur.getNom());

        message.setFrom(envoyeur.getAdresse());

        return message;
    }
}
