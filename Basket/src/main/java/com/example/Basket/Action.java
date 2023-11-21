package com.example.Basket;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;

    public Action() {
    }

    @Override
    public String toString() {
        return "Action [id=" + id + ", idmatch=" + idmatch + ", idjoueur=" + idjoueur + ", idaction=" + idaction + "]";
    }

    public Action(int id, int idmatch, int idjoueur, int idaction) {
        this.id = id;
        this.idmatch = idmatch;
        this.idjoueur = idjoueur;
        this.idaction = idaction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdmatch() {
        return idmatch;
    }

    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }

    public int getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }

    public int getIdaction() {
        return idaction;
    }

    public void setIdaction(int idaction) {
        this.idaction = idaction;
    }

    int idmatch;
    int idjoueur;
    int idaction;
}