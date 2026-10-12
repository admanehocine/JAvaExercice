package com.example;

import java.util.ArrayList;

public class Ticket {
    private int numero, nbrAnnonce;
    private String titre;
    private boolean actif;
    private ArrayList<Annonce> listAnnonces;

    public Ticket(int numero, String titre) {
        this.numero = numero;
        this.titre = titre;
        this.actif = true;
        this.nbrAnnonce = 0;
        this.listAnnonces = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNbrAnnonce() {
        return nbrAnnonce;
    }

    public void incrementNbrAnnonce() {
        this.nbrAnnonce++;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public boolean isActif() {
        return actif;
    }

    public ArrayList<Annonce> getListAnnonces() {
        return listAnnonces;
    }

    public void setListAnnonces(ArrayList<Annonce> listAnnonces) {
        this.listAnnonces = listAnnonces;
    }

    public void AjouterAnnonce(Annonce a) {
        if (isActif()) {
            this.listAnnonces.add(a);
            this.incrementNbrAnnonce();
        }
    }

    public void desactiverTicket() {
        this.actif = false;
    }

    public void Afficher() {
        // N° 294, Titre: EVEnt 1, 1 annonce(s)
        String x = this.nbrAnnonce > 1 ? " Annonces" : " Annonce";
        String e = this.actif ? "Active" : "Desactiver";
        System.out.println(
                "N° " + this.numero + ", Titre: " + this.titre
                        + ", avec " + this.nbrAnnonce + x + ", etat est " + e);
        System.out.println("**************************************Events**********************");
        for (Annonce a : this.listAnnonces) {

            a.afficher();
            
        }
    }

}
