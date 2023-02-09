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

import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.dto.DealDTO;
import br.com.igormedeiros.sales33.service.DealService;

@RestController
@RequestMapping("/deals")
public class DealController {

	@Autowired
	private DealService service;

	@PostMapping("/create")
	public Deal create(@Valid @RequestBody DealDTO dto) {
		return service.create(dto);
	}

	@GetMapping({ "/", "" })
	public List<Deal> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Deal findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
