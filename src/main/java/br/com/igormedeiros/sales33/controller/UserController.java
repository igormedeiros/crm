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

import br.com.igormedeiros.sales33.entities.User;
import br.com.igormedeiros.sales33.entities.dto.UserDTO;
import br.com.igormedeiros.sales33.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/create")
	public User create(@Valid @RequestBody UserDTO dto) {
		return service.create(dto);
	}
	
	@GetMapping({"/", ""})
	public List<User> findAll(){
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public User findById(@PathVariable Long id){
		return service.findById(id);
	}
}
