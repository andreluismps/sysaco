package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.hibernate.validator.constraints.NotEmpty;

/**
 * Classe que representa os dados de endereço.
 * @author andre
 *
 */
@Entity
public class Endereco {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private String logradouro;
	
	
	private String bairro;
	
	
	private String complemento;
	
	
	private String numero;
	
	
	private String cep;
	
	
	private String telefone;

	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getLogradouro() {
		return logradouro;
	}

	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	
	public String getBairro() {
		return bairro;
	}

	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
	public String getComplemento() {
		return complemento;
	}

	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	public String getNumero() {
		return numero;
	}

	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	public String getCep() {
		return cep;
	}

	
	public void setCep(String cep) {
		this.cep = cep;
	}

	
	public String getTelefone() {
		return telefone;
	}

	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
