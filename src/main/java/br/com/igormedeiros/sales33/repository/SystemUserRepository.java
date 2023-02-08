package br.com.igormedeiros.sales33.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.UserSystem;

public interface SystemUserRepository extends JpaRepository<UserSystem, Long> {

	UserSystem findByEmail(String email);

	UserSystem findByUserName(String userName);

	UserSystem findByUserNameOrEmail(String userName, String email);
	
	Boolean existsByUserName(String userName);
	
	Boolean existsByEmail(String email);
}
