package com.example.Basket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketService {
    @Autowired
    EquipeDAO equipedao;
    @Autowired
    JoueurDAO joueurDAO;
    @Autowired
    MatchDAO matchDAO;

    public List<Equipe> getallEquipe() {
        return equipedao.findAll();
    };

    public List<Joueur> getallJoueur() {
        return joueurDAO.findAll();
    }

    public List<Match> getallMatch() {
        return matchDAO.findAll();
    }
}