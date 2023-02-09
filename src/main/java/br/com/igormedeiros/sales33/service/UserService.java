package br.com.igormedeiros.sales33.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igormedeiros.sales33.entities.User;
import br.com.igormedeiros.sales33.entities.dto.UserDTO;
import br.com.igormedeiros.sales33.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	public User create(UserDTO userDTO) {
		User userModel = modelMapper.map(userDTO, User.class);
		return repository.save(userModel);
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
