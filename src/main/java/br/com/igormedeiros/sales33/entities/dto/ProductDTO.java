package br.com.igormedeiros.sales33.entities.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.User;
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

public class ProductDTO {

	@NotNull
	@NotBlank
	@Size(max = 255)
	private String name;

	@Size(max = 255)
	private String description;

	@NotNull
	private Double price;

	private User user;

	private Deal deal;
}
