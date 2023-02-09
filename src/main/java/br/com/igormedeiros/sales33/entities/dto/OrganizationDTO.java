package br.com.igormedeiros.sales33.entities.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.igormedeiros.sales33.entities.Contact;
import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.Note;
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
public class OrganizationDTO {

	@NotNull
	@NotBlank
	@Size(max = 255)
	private String name;

	@NotNull
	@NotBlank
	@Size(max = 255)
	private String address;

	@NotNull
	@Size(max = 11)
	private String phone;

	@NotNull
	@Email
	private String email;

	private List<Contact> contacts;

	private List<Deal> deal;

	private List<Note> notes;

}
