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

import br.com.igormedeiros.sales33.entities.Contact;
import br.com.igormedeiros.sales33.entities.dto.ContactDTO;
import br.com.igormedeiros.sales33.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactService service;
	
	@PostMapping("/create")
	public Contact create(@Valid @RequestBody ContactDTO dto) {
		return service.create(dto);
	}
	
	@GetMapping({"/", ""})
	public List<Contact> findAll(){
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Contact findById(@PathVariable Long id){
		return service.findById(id);
	}
}
