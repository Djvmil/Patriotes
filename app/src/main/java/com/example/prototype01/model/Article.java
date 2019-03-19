package com.example.prototype01.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Date;

public class Article {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("titre")
    @Expose
    private String titre;

    @SerializedName("contenu")
    @Expose
    private String texte;

    @SerializedName("image_url")
    @Expose
    private int image_url;

    @SerializedName("dateCreated")
    @Expose
    private Date dateCreated;

    @SerializedName("dateUpdated")
    @Expose
    private Date dateUpdated;

    @SerializedName("idCategorie")
    @Expose
    private int idCategorie;

    @SerializedName("idUser")
    @Expose
    private int idUser;

    public Article() {
    }

    public Article(int id, String titre, String texte, int image_url, Date dateCreated, Date dateUpdated, int idCategorie, int idUser) {
        this.id = id;
        this.titre = titre;
        this.texte = texte;
        this.image_url = image_url;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.idCategorie = idCategorie;
        this.idUser = idUser;
    }


    public Article(String titre, String texte, int image_url) {
        this.titre = titre;
        this.texte = texte;
        this.image_url = image_url;
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

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public int getImage_url() {
        return image_url;
    }

    public void setImage_url(int image_url) {
        this.image_url = image_url;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}


