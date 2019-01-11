package br.com.senaigo.onzevencedor.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Clube implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "IDF_CLUBE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "NOME")
	private String nome;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clube")
	private List<Atleta> atletas;
}