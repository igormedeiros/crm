package br.com.igormedeiros.sales33.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 200)
	private String name;
	
	@Column(nullable = false, length = 100)
	private String email;
	
	@Column(nullable = false, length = 255)
	private String userPassword;
	
	@Column(nullable = false, length = 100)
	private String userRole;
	
	@OneToMany (mappedBy = "user", fetch = FetchType.LAZY)
	private List<BusinessDeal> deals;
	
	@OneToMany (mappedBy = "user", fetch = FetchType.LAZY)
	private List<Activity> activities;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Note> notes;
	
	@OneToMany(mappedBy = "user")
	private List<Product> products;

}
