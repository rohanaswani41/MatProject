package com.matrimonial.project.daos.details;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.details.Diet;

public interface DietDao extends JpaRepository<Diet, Long> {

}
