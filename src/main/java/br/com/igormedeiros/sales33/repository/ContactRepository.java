package br.com.igormedeiros.sales33.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	<Optional>Long findById(Long id);
	
	<Optional>List<Contact> findByName(String name);
	
	List<Contact> findByEmail(String email);

}
