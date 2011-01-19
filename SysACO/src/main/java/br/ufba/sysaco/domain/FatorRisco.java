package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa os fatores de risco associados ao paciente numa dada consulta.
 * @author andre
 *
 */
@Entity
public class FatorRisco {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * O nome do fator de risco.
	 */

	private String nome;
	

	private GrauRiscoHemorragia grauRiscoHemorragia;
	

	private GrauRiscoTrombose grauRiscoTrombose;

	
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

	
	public GrauRiscoHemorragia getGrauRiscoHemorragia() {
		return grauRiscoHemorragia;
	}

	
	public void setGrauRiscoHemorragia(GrauRiscoHemorragia grauRiscoHemorragia) {
		this.grauRiscoHemorragia = grauRiscoHemorragia;
	}

	
	public GrauRiscoTrombose getGrauRiscoTrombose() {
		return grauRiscoTrombose;
	}

	
	public void setGrauRiscoTrombose(GrauRiscoTrombose grauRiscoTrombose) {
		this.grauRiscoTrombose = grauRiscoTrombose;
	}
	
}
