package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa as medicações que podem ser usadas pelo paciente,
 * incluindo os anticoagulantes orais.
 * @author andre
 *
 */
public class Medicamento {
	@Id
	@GeneratedValue
	private Long id;	
	
	/**
	 * Nome do medicamento.
	 */
	@Column
	private String nome;
	
	/**
	 * Grau de risco de ocorrência de hemorragia que o uso do medicamento pode resultar.
	 */
	@Column
	private GrauRiscoHemorragia grauRiscoHemorragia;
	
	/**
	 * Grau de risco de ocorrência de trombose que o uso do medicamento pode resultar.
	 */
	@Column
	private GrauRiscoTrombose grauRiscoTrombose;
	
}