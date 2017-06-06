package com.matrimonial.project.security;

import org.springframework.data.repository.CrudRepository;

public interface AppUserDetailsRepository extends CrudRepository<AppUserDetails,Long>{

	AppUserDetails findOneByUsername(String username);

}
