package br.com.igormedeiros.sales33.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long>{

}
