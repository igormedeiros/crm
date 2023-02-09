package br.com.igormedeiros.sales33.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igormedeiros.sales33.entities.Contact;
import br.com.igormedeiros.sales33.entities.dto.ContactDTO;
import br.com.igormedeiros.sales33.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repository;

	private ModelMapper modelMapper = new ModelMapper();

	public Contact create(ContactDTO contactDTO) {
		Contact model = modelMapper.map(contactDTO, Contact.class);
		return repository.save(model);
	}

	public List<Contact> findAll() {
		return repository.findAll();
	}

	public Contact findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
