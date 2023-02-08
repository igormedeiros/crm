package br.com.igormedeiros.sales33.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Product {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	@Column (nullable = false, length = 200)
	private String name;
	
	@Column (length = 200)
	private String description;
	
	@Column (nullable = false, precision = 10, scale = 2)
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserSystem user;
	
	@ManyToOne
	@JoinColumn(name = "deal_id")
	private BusinessDeal deal;

}
