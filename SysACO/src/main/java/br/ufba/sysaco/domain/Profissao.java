package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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
