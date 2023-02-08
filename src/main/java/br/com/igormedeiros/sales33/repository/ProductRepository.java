package br.com.igormedeiros.sales33.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Product;
import br.com.igormedeiros.sales33.entities.UserSystem;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	<Optional>List<Product> findById(Long id);
	
	List<Product> findByName(String name);
	
	List<Product> findByUser(UserSystem user);

}
