package com.example.Basket;

import java.util.List;
import java.util.Optional;

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
    @Autowired
    ActionDAO actionDAO;

    public List<Equipe> getallEquipe() {
        return equipedao.findAll();
    };

    public Optional<Equipe> getEquipe(int id) {
        return equipedao.findById(id);
    };

    public List<Joueur> getallJoueur() {
        return joueurDAO.findAll();
    }

    public List<Match> getallMatch() {
        return matchDAO.findAll();
    }

    public List<Action> getallAction() {
        return actionDAO.findAll();
    }

    public void insertequipe(Equipe equipe) {
        equipedao.save(equipe);
    }

    public void insertjoueur(Joueur joueur) {
        joueurDAO.save(joueur);
    }

    public void insertMatch(Match match) {
        matchDAO.save(match);
    }

    public void insertaction(Action action) {
        actionDAO.save(action);
    }

}