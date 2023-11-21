package com.example.Basket;

import java.util.List;

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

    @GetMapping("/leniny")
    public String leniny() {
        return "leniny";
    }

    @GetMapping("/equipe")
    public List<Equipe> getallEquipes() {
        return basketService.getallEquipe();
    }

    @GetMapping("/joueur")
    public List<Joueur> getallJoueurs() {
        return basketService.getallJoueur();
    }

    @GetMapping("/match")
    public List<Match> getallMatchs() {
        return basketService.getallMatch();
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