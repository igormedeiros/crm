package br.com.igormedeiros.sales33.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.igormedeiros.sales33.entities.enums.ActivityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Activity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false, length = 50)
	@Enumerated(EnumType.STRING)
	private ActivityType type;
	
	@Column (nullable = false)
	private LocalDate date;
	
	@Column (length = 200)
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "deal_id")
	private BusinessDeal deal;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserSystem user;

}
