package br.com.igormedeiros.sales33.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.dto.DealDTO;
import br.com.igormedeiros.sales33.repository.DealRepository;

@Service
public class DealService {

	@Autowired
	private DealRepository repository;

	private ModelMapper modelMapper = new ModelMapper();

	public Deal create(DealDTO dto) {
		Deal model = modelMapper.map(dto, Deal.class);
		return repository.save(model);
	}

	public List<Deal> findAll() {
		return repository.findAll();
	}

	public Deal findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
