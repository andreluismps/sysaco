package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa a profissão da pessoa que realiza a consulta.
 * 
 * @author andre
 */
@Entity
public class Profissao {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * O nome pode ser Médico ou Farmacêutico.
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
