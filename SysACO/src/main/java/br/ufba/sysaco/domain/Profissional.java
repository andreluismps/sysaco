package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o profissional de saúde.
 * O mesmo pode ser um médico ou farmacêutico.
 */
public class Profissional {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Dados pessoais do profissional de saúde.
	 */
	@Column
	private Pessoa pessoa;
	
	@Column
	private Profissao profissao;
	
	/**
	 * Número do conselho regional.
	 * Pode representar tanto o conselho regional de medicina quanto o de farmácia.
	 */
	@Column
	private Long conselhoRegional;
}
