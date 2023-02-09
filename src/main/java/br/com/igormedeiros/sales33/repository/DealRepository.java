package br.com.igormedeiros.sales33.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Deal;

public interface DealRepository extends JpaRepository<Deal, Long>{

	List<Deal> findByOrganization (Deal organization);
	
}
