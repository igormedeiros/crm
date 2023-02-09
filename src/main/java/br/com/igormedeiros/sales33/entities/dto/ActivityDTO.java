package br.com.igormedeiros.sales33.entities.dto;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.igormedeiros.sales33.entities.Deal;
import br.com.igormedeiros.sales33.entities.User;
import br.com.igormedeiros.sales33.entities.enums.ActivityType;
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
public class ActivityDTO {
	

	@Enumerated(EnumType.STRING)
	private ActivityType type;

	@NotNull
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate date;

	@Size(max = 255)
	private String description;

	private Deal deal;

	private User user;


}
