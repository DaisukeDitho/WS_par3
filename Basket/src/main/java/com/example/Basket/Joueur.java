package com.example.Basket;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;

    public Joueur(int id, String poste, String nom, int idequipe) {
        this.id = id;
        this.poste = poste;
        this.nom = nom;
        this.idequipe = idequipe;
    }

    @Override
    public String toString() {
        return "Joueur [id=" + id + ", poste=" + poste + ", nom=" + nom + ", idequipe=" + idequipe + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }

    String poste;
    String nom;
    int idequipe;

    public Joueur() {
    }

}