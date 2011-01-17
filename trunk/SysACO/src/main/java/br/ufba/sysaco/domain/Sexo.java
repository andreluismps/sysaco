package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o sexo de uma pessoa.
 * @author andre
 *
 */
@Entity
public class Sexo {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * O nome pode ser Masculino ou Feminino.
	 */
	@Column
	private String nome;
}
