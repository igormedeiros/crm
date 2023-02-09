package br.com.igormedeiros.sales33.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Product;
import br.com.igormedeiros.sales33.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByName(String name);
	
	List<Product> findByUser(User user);

}
