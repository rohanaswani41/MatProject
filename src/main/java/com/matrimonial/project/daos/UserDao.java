package com.matrimonial.project.daos;


import org.springframework.data.jpa.repository.JpaRepository;
import com.matrimonial.project.models.User;


public interface UserDao extends JpaRepository<User,Long>{
	
	public User findById(Long id);
}
