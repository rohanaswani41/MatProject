package com.matrimonial.project.daos.details;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.details.State;

public interface StateDao extends JpaRepository<State, Long> {

}
