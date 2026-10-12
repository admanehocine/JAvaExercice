package com.example;

public abstract class Annonce {
    protected int id;
    protected String titre, imageURL;

    public Annonce(int id, String titre, String imageURL) {
        this.id = id;
        this.titre = titre;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public abstract void afficher();

}
