package br.com.igormedeiros.sales33.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{

}
