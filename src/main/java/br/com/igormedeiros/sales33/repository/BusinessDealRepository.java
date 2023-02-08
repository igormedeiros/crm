package br.com.igormedeiros.sales33.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Activity;
import br.com.igormedeiros.sales33.entities.BusinessDeal;

public interface BusinessDealRepository extends JpaRepository<BusinessDeal, Long>{

	List<BusinessDeal> findByOrganization (BusinessDeal organization);
	
}
