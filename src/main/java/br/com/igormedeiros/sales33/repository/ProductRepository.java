package br.com.igormedeiros.sales33.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
