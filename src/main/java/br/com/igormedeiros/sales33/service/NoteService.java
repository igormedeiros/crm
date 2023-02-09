package br.com.igormedeiros.sales33.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igormedeiros.sales33.entities.Note;
import br.com.igormedeiros.sales33.entities.dto.NoteDTO;
import br.com.igormedeiros.sales33.repository.NoteRepository;

@Service
public class NoteService {

	@Autowired
	private NoteRepository repository;

	private ModelMapper modelMapper = new ModelMapper();

	public Note create(NoteDTO dto) {
		Note model = modelMapper.map(dto, Note.class);
		return repository.save(model);
	}

	public List<Note> findAll() {
		return repository.findAll();
	}

	public Note findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
