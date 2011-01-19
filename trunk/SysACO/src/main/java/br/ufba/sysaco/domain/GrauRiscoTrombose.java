package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o grau de risco de ocorrência de uma trombose.
 * 
 * @author andre
 */
@Entity
public class GrauRiscoTrombose {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * O nome do grau de risco.
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
