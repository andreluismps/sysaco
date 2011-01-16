package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o grau de risco de ocorrência de uma trombose.
 * @author andre
 *
 */
public class GrauRiscoTrombose {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * O nome do grau de risco.
	 */
	@Column
	private String nome;
}
