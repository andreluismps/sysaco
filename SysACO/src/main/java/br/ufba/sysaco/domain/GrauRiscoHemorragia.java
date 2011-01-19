package br.ufba.sysaco.domain;

import javax.persistence.Entity;
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
@Entity
public class GrauRiscoHemorragia {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * O nome do grau de risco.
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
