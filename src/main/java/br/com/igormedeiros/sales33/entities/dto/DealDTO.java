package br.com.igormedeiros.sales33.entities.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.igormedeiros.sales33.entities.Activity;
import br.com.igormedeiros.sales33.entities.Contact;
import br.com.igormedeiros.sales33.entities.Note;
import br.com.igormedeiros.sales33.entities.Organization;
import br.com.igormedeiros.sales33.entities.Product;
import br.com.igormedeiros.sales33.entities.User;
import br.com.igormedeiros.sales33.entities.enums.DealStage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class DealDTO {
	
	@NotNull
	@Size(max = 200)
	private String name;

	@NotNull
	private Double value;

	@NotNull
	private DealStage stage;

	private User user;

	private Organization organization;

	private List<Contact> contacts;

	private List<Activity> activities;

	private List<Note> notes;

	private List<Product> products;


}
