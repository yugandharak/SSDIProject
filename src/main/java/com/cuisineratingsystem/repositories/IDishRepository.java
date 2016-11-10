package com.cuisineratingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuisineratingsystem.model.Dish;

@Repository
public interface IDishRepository extends JpaRepository<Dish, Integer> {

}
