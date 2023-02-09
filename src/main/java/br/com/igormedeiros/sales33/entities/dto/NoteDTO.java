package br.com.igormedeiros.sales33.entities.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.igormedeiros.sales33.entities.Contact;
import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.Organization;
import br.com.igormedeiros.sales33.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class NoteDTO {
	
	@NotNull
	@Size (max = 200)
	private String note;

	private Contact contact;

	private Deal deal;

	private Organization organization;

	private User user;

	private LocalDate dateCreated;
	private LocalDate dateUpdated;


}
