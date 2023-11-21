package com.example.Basket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionDAO extends JpaRepository<Action, Integer> {

}