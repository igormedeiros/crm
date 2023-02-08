package br.com.igormedeiros.sales33.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long>{
	
	Optional<Organization> findByName(String name);

}
