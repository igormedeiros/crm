package br.com.igormedeiros.sales33.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Contact;
import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.Note;
import br.com.igormedeiros.sales33.entities.User;

public interface NoteRepository extends JpaRepository<Note, Long>{
	
	<Optional>List<Note> findByContact(Contact contact);
	
	List<Note> findByNote(String note);
	
	List<Note> findByDeal(Deal deal);
	
	List<Note> findByUser(User user);
	
}
