package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa as medicações que podem ser usadas pelo paciente,
 * incluindo os anticoagulantes orais.
 * @author andre
 *
 */
@Entity
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