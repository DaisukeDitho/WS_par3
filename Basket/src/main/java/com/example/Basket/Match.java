package com.example.Basket;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    int idequipe1;
    int idequipe2;

    public Match(int id, int idequipe1, int idequipe2) {
        this.id = id;
        this.idequipe1 = idequipe1;
        this.idequipe2 = idequipe2;
    }

    @Override
    public String toString() {
        return "Match [id=" + id + ", idequipe1=" + idequipe1 + ", idequipe2=" + idequipe2 + "]";
    }

    public Match() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdequipe1() {
        return idequipe1;
    }

    public void setIdequipe1(int idequipe1) {
        this.idequipe1 = idequipe1;
    }

    public int getIdequipe2() {
        return idequipe2;
    }

    public void setIdequipe2(int idequipe2) {
        this.idequipe2 = idequipe2;
    }

}