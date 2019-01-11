package cursojava.workshop.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cep {

	@Id
	private String cep;

	@OneToOne
	private Municipio municipio;

	private String bairro;
	private String logradouro;

	public String getCep() {
		return cep;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public String getBairro() {
		return bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
}
