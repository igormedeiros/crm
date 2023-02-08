package br.com.igormedeiros.sales33.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Organization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 200)
	private String name;

	@Column(nullable = false, length = 200)
	private String address;

	@Column(nullable = false, length = 11, unique = true)
	private String phone;

	@Column(nullable = false, length = 150)
	private String email;
	
	@OneToMany(mappedBy = "organization")
	private List<Contact> contacts;
	
	@OneToMany(mappedBy = "organization")
	private List<BusinessDeal> deal;
	
	@OneToMany(mappedBy = "organization")
	private List<Note> notes;
}
