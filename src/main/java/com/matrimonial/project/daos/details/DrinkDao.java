package com.matrimonial.project.daos.details;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.details.Drink;

public interface DrinkDao extends JpaRepository<Drink, Long> {

}
