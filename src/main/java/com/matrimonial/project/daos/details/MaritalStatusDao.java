package com.matrimonial.project.daos.details;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.details.MaritalStatus;

public interface MaritalStatusDao extends JpaRepository<MaritalStatus, Long> {

}
