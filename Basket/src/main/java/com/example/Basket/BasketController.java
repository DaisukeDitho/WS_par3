package com.example.Basket;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basket")
public class BasketController {
    @Autowired
    BasketService basketService;

    @GetMapping("/equipe")
    public List<Equipe> getallEquipes() {
        return basketService.getallEquipe();
    }

    @GetMapping("/equipeop")
    public Optional<Equipe> getaEquipe() {
        return basketService.getEquipe(55);
    }

    @GetMapping("/joueur")
    public Reponse<List<Joueur>> getallJoueurs() {
        Reponse<List<Joueur>> result=new Reponse<List<Joueur>>();

        List<Joueur> retour=basketService.getallJoueur();
        if(retour==null)
        {
            result.setErreur("Pas de joueur");
        }
        else
        {
            result.setData(retour);
        }
        return result;
    }

    @GetMapping("/match")
    public Reponse<List> getallMatchs() {
        Reponse<List> liste=new Reponse<List>();
        ArrayList fn = new ArrayList<>();
        List<Match> matchs = basketService.getallMatch();
        ArrayList<Optional> equipe = new ArrayList();
        for (int i = 0; i < matchs.size(); i++) {
            equipe.add(basketService.getEquipe(matchs.get(i).getIdequipe1()));
            equipe.add(basketService.getEquipe(matchs.get(i).getIdequipe2()));
        }
        fn.add(matchs);
        fn.add(equipe);
        if(fn==null){
            liste.setErreur("vide");

        }
        else{
            liste.setData(fn);
        }
        return liste;
    }

    @GetMapping("/action")
    public List<Action> getallActions() {
        return basketService.getallAction();
    }

    @PostMapping("/insertequipe")
    public String insertequipe(@RequestBody Equipe equipe) {
        basketService.insertequipe(equipe);
        return "success";

    }

    @PostMapping("/insertjoueur")
    public String insertjoueur(@RequestBody Joueur joueur) {
        basketService.insertjoueur(joueur);
        return "success";

    }

    @PostMapping("/insertmatch")
    public String insertmatch(@RequestBody Match match) {
        basketService.insertMatch(match);
        return "success";

    }

    @PostMapping("/insertaction")
    public String insertaction(@RequestBody Action action) {
        basketService.insertaction(action);
        return "success";

    }

}