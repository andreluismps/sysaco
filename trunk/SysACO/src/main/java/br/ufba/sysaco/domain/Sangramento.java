package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o sangramento que o paciente apresenta na consulta.
 * 
 * @author andre
 */
@Entity
public class Sangramento {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * Descrição do sangramento.
	 */

	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
