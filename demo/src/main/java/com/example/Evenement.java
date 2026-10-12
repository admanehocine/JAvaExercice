package com.example;

import com.github.javafaker.Faker;

public class Evenement extends Annonce {

    private String adresse, codePostal, departement;
    private TypeEmplacement TypeEm;
    private Categorie categorie;

    public Evenement(int id, String titre, String imageURL, Categorie categorie) {
        super(id, titre, imageURL);
        // random entre 0 - 100
        // si random <50 alors type est en ligne sino presentiel
        int random = (int) Math.floor(Math.random() * 101);
        if (random < 50) {
            this.TypeEm = TypeEmplacement.EN_LIGNE;
        } else {
            Faker faker = new Faker();
            this.adresse = faker.address().city();
            this.codePostal = faker.address().zipCode();
            this.departement = faker.address().cityName();
            this.TypeEm = TypeEmplacement.PRESENTIEL;
        }

        this.categorie = categorie;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public TypeEmplacement getTypeEm() {
        return TypeEm;
    }

    public void setTypeEm(TypeEmplacement typeEm) {
        TypeEm = typeEm;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void afficher() {
        System.out.println("Event: " + super.titre + " ,cat:" + this.categorie.getNom() + ", Type ;" + this.TypeEm);
    }

}
