package com.example.Basket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchDAO extends JpaRepository<Match, Integer> {

}