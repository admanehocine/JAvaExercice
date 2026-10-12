package com.example;

import java.util.ArrayList;

public class Publicite extends Annonce {
    ArrayList<Evenement> listevents;

    public Publicite(int id, String titre, String imageURL) {
        super(id, titre, imageURL);
        this.listevents = new ArrayList<>();
    }

    public void AjouterEvent(Evenement e) {
        this.listevents.add(e);
    }

    public void afficher() {
        System.out.println("Publicite: " + super.titre + " ,cat:" + this.listevents.size());
    }
}
