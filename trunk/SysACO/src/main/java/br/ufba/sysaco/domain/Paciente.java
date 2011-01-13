package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Paciente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Paciente possui dados pessoais.
	 */
	@Column
	private Pessoa pessoa;
	
	/**
	 * Altura do paciente (em metros).
	 */
	@Column
	private Double altura;
	
	/**
	 * Peso do paciente (em quilogramas)
	 */
	@Column
	private Double peso;
	
	/**
	 * Nome da mãe do paciente
	 */
	@Column(length=100)
	private String nomeMae;
	
}
