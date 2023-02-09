package br.com.igormedeiros.sales33.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 255)
	private String name;

	@Column(nullable = false, length = 100)
	private String email;

	@Column(nullable = false, unique = true, length = 50)
	private String userName;

	@JsonIgnore
	@Column(nullable = false, length = 255)
	private String userPassword;

	@Column(nullable = false, length = 100)
	private String userRole;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Deal> deals;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Activity> activities;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Note> notes;

	@OneToMany(mappedBy = "user")
	private List<Product> products;

}
