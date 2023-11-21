package com.example.Basket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}