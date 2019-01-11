package cursojava.workshop.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Municipio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "geradorMunicipio")
	@SequenceGenerator(name = "geradorMunicipio", sequenceName = "gerador_municipio", allocationSize = 1, initialValue = 1)
	private Integer id = 0;

	private String descricao;

	@Enumerated(EnumType.STRING)
	private EnumUf uf;

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public EnumUf getUf() {
		return uf;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setUf(EnumUf uf) {
		this.uf = uf;
	}
}
