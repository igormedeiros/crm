package br.com.igormedeiros.sales33.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igormedeiros.sales33.entities.Note;
import br.com.igormedeiros.sales33.entities.dto.NoteDTO;
import br.com.igormedeiros.sales33.service.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {
	
	@Autowired
	private NoteService service;
	
	@PostMapping("/create")
	public Note create(@Valid @RequestBody NoteDTO dto) {
		return service.create(dto);
	}
	
	@GetMapping({"/", ""})
	public List<Note> findAll(){
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Note findById(@PathVariable Long id){
		return service.findById(id);
	}
}
