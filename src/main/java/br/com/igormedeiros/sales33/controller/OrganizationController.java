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

import br.com.igormedeiros.sales33.entities.Organization;
import br.com.igormedeiros.sales33.entities.dto.OrganizationDTO;
import br.com.igormedeiros.sales33.service.OrganizationService;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {
	
	@Autowired
	private OrganizationService service;
	
	@PostMapping("/create")
	public Organization create(@Valid @RequestBody OrganizationDTO dto) {
		return service.createOrganization(dto);
	}
	
	@GetMapping({"/", ""})
	public List<Organization> findAll(){
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Organization findById(@PathVariable Long id){
		return service.findById(id);
	}
}
