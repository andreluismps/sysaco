package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o sexo de uma pessoa.
 * 
 * @author andre
 */
@Entity
public class Sexo {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * O nome pode ser Masculino ou Feminino.
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