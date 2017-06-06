package com.matrimonial.project.daos.details;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.details.Nationality;

public interface NationalityDao extends JpaRepository<Nationality, Long> {

}
