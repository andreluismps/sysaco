package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa a profissão da pessoa que realiza a consulta.
 * @author andre
 *
 */
@Entity
public class Profissao {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * O nome pode ser Médico ou Farmacêutico.
	 */
	@Column
	private String nome;
}
