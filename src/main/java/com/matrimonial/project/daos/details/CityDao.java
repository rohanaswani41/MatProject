package com.matrimonial.project.daos.details;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.details.City;

public interface CityDao extends JpaRepository<City, Long> {

}
