package br.com.igormedeiros.sales33.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igormedeiros.sales33.entities.Product;
import br.com.igormedeiros.sales33.entities.dto.ProductDTO;
import br.com.igormedeiros.sales33.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	private ModelMapper modelMapper = new ModelMapper();

	public Product create(ProductDTO dto) {
		Product model = modelMapper.map(dto, Product.class);
		return repository.save(model);
	}

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
