package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o sangramento que o paciente apresenta na consulta.
 * @author andre
 *
 */
@Entity
public class Sangramento {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Descrição do sangramento.
	 */
	@Column
	private String nome;
}
