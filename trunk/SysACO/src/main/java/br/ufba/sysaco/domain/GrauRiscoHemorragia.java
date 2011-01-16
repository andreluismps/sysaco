package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o grau de risco de ocorrência de uma hemorragia.
 * @author andre
 *
 * É a melhor forma de se implementar uma classe que é de domínio restrito?
 * Por exemplo, ela vai ser sempre algo como uma escala de 
 * ausente, baixo risco, risco moderado, alto risco, risco mortal.
 * 
 * A mesma coisa vale para a classe GrauRiscoTrombose.
 */
public class GrauRiscoHemorragia {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * O nome do grau de risco.
	 */
	@Column
	private String nome;
}
