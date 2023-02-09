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

import br.com.igormedeiros.sales33.entities.Product;
import br.com.igormedeiros.sales33.entities.dto.ProductDTO;
import br.com.igormedeiros.sales33.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/create")
	public Product create(@Valid @RequestBody ProductDTO dto) {
		return service.create(dto);
	}

	@GetMapping({ "/", "" })
	public List<Product> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Product findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
