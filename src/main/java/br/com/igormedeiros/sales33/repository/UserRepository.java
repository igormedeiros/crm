package br.com.igormedeiros.sales33.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	User findByUserName(String userName);

	User findByUserNameOrEmail(String userName, String email);
	
	Boolean existsByUserName(String userName);
	
	Boolean existsByEmail(String email);
}
