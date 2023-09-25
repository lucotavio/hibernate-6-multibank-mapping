package br.com.lucotavio.hibernatemultibankmapping.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@Entity
@Table(name = "PERSON")
public class Person {

	@Id
	@Column(name = "ID")
	@GeneratedValue(generator = "person_seq")
	@GenericGenerator(name = "person_seq", strategy = "native", parameters = {
			@Parameter(name = "sequence_name", value = "person_seq"),
			@Parameter(name = "initial_value", value = "1"),
			@Parameter(name = "increment_size", value = "1"),
			@Parameter(name = "cache", value = "1")
	})
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
}
