package com.matrimonial.project.daos.details;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.details.Profession;

public interface ProfessionDao extends JpaRepository<Profession, Long> {

}
