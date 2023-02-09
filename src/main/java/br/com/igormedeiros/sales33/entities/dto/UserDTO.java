package br.com.igormedeiros.sales33.entities.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.igormedeiros.sales33.entities.Activity;
import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.Note;
import br.com.igormedeiros.sales33.entities.Product;
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

public class UserDTO {

	@NotNull
	@NotBlank
	@Size(min = 2, max = 255, message = "Tamanho do nome invalido")
	private String name;

	@NotNull
	@NotBlank
	@Email(message = "Formato de email invalido")
	private String email;

	@NotNull
	@NotBlank
	private String userName;

	@NotNull
	@NotBlank
	
	private String userPassword;

	@NotNull
	@NotBlank
	private String userRole;

	private List<Deal> deals;

	private List<Activity> activities;

	private List<Note> notes;

	private List<Product> products;
}