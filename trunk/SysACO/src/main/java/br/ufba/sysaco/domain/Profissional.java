package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o profissional de saúde. O mesmo pode ser um médico ou farmacêutico.
 */
@Entity
public class Profissional {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * Dados pessoais do profissional de saúde.
	 */

	private Pessoa pessoa;

	private Profissao profissao;

	/**
	 * Número do conselho regional. Pode representar tanto o conselho regional de medicina quanto o de farmácia.
	 */

	private Long conselhoRegional;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public Long getConselhoRegional() {
		return conselhoRegional;
	}

	public void setConselhoRegional(Long conselhoRegional) {
		this.conselhoRegional = conselhoRegional;
	}
}
