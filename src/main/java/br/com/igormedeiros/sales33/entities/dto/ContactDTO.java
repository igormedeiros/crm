package br.com.igormedeiros.sales33.entities.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.Note;
import br.com.igormedeiros.sales33.entities.Organization;
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
public class ContactDTO {
	
	@NotNull
	@NotBlank
	@Size(max = 255)
	private String name;

	@NotNull
	@NotBlank
	@Size(max = 150)
	private String email;

	@NotNull
	@NotBlank
	@Size(max = 11)
	private String phone;

	private Organization organization;

	private Deal deal;

	private List<Note> notes;


}
