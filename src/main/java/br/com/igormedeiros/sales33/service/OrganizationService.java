package br.com.igormedeiros.sales33.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.igormedeiros.sales33.entities.Organization;
import br.com.igormedeiros.sales33.entities.dto.OrganizationDTO;
import br.com.igormedeiros.sales33.repository.OrganizationRepository;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationRepository repository;

	private ModelMapper modelMapper = new ModelMapper();

	public Organization createOrganization(OrganizationDTO organizationDTO) {
		Organization model = modelMapper.map(organizationDTO, Organization.class);
		return repository.save(model);
	}

	public List<Organization> findAll() {
		return repository.findAll();
	}

	public Organization findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
