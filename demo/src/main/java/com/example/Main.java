package com.example;

import java.util.ArrayList;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        /// creation 4 catégories
        Categorie c0 = new Categorie(0, "Musique");
        Categorie c1 = new Categorie(1, "Sport");
        Categorie c2 = new Categorie(2, "Informatique");
        Categorie c3 = new Categorie(3, "Business");
        // creation 5 events
        Faker faker = new Faker();

        // $Evenement e0=new Evenement(0, null, null, null, null, null, null, c3)
        Evenement e0 = new Evenement(0, faker.name().firstName(), faker.avatar().image(), c0);
        Evenement e1 = new Evenement(1, faker.name().firstName(), faker.avatar().image(), c1);
        Evenement e2 = new Evenement(2, faker.name().firstName(), faker.avatar().image(), c2);
        Evenement e3 = new Evenement(3, faker.name().firstName(), faker.avatar().image(), c3);
        Evenement e4 = new Evenement(4, faker.name().firstName(), faker.avatar().image(), c0);

        // creaton 3 pubs

        Publicite p0 = new Publicite(0, faker.name().firstName(), faker.avatar().image());
        p0.AjouterEvent(e4);
        p0.AjouterEvent(e1);
        Publicite p1 = new Publicite(1, faker.name().firstName(), faker.avatar().image());
        p1.AjouterEvent(e0);
        Publicite p2 = new Publicite(2, faker.name().firstName(), faker.avatar().image());
        p2.AjouterEvent(e4);
        p2.AjouterEvent(e2);
        p2.AjouterEvent(e3);

        // creatin des tickets
        // {e0,e1,e2,e3,e4,p0,p1,p2}
        // random => [0-7]
        ArrayList<Annonce> a = new ArrayList<>();
        a.add(e0);
        a.add(e1);
        a.add(e2);
        a.add(e3);
        a.add(e4);
        a.add(p0);
        a.add(p1);
        a.add(p2);
        Ticket t1 = new Ticket(0, faker.name().firstName());
        // position entre 0 et 7
        // (int) Math.floor(Math.random() * 8)
        int position = (int) Math.floor(Math.random() * 8);
        t1.AjouterAnnonce(a.get(position));

        Ticket t2 = new Ticket(1, faker.name().firstName());
        // position entre 0 et 7
        // (int) Math.floor(Math.random() * 8)
        position = (int) Math.floor(Math.random() * 8);
        t2.AjouterAnnonce(a.get(position));

        // Affichage des tickets
        t1.Afficher();
        t2.Afficher();
    }
}