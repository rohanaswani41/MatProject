package com.matrimonial.project.daos.details;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.details.Education;

public interface EducationDao extends JpaRepository<Education, Long> {

}
