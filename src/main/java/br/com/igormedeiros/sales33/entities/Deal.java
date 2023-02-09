package br.com.igormedeiros.sales33.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.igormedeiros.sales33.entities.enums.DealStage;
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
@Table(name = "tb_deal")
public class Deal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 200)
	private String name;

	@Column(name = "deal_value", nullable = false, precision = 10, scale = 2)
	private Double value;

	@Column(nullable = false)
	private DealStage stage;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "organization_id")
	private Organization organization;

	@OneToMany(mappedBy = "deal", fetch = FetchType.LAZY)
	private List<Contact> contacts;

	@OneToMany(mappedBy = "deal", fetch = FetchType.LAZY)
	private List<Activity> activities;

	@OneToMany(mappedBy = "deal", fetch = FetchType.LAZY)
	private List<Note> notes;

	@OneToMany(mappedBy = "deal", fetch = FetchType.LAZY)
	private List<Product> products;

}
