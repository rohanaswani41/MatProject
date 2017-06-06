package com.matrimonial.project.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimonial.project.models.UserPersonalDetailsView;

public interface UserPersonalDetailsViewDao extends JpaRepository<UserPersonalDetailsView, Long> {

	UserPersonalDetailsView findById(Long id);
	
}
