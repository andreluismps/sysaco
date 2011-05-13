package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa as medicações que podem ser usadas pelo paciente, incluindo os anticoagulantes orais.
 * 
 * @author andre
 */
@Entity
public class Medicamento {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * Nome do medicamento.
	 */

	private String nome;

	/**
	 * Grau de risco de ocorrência de hemorragia que o uso do medicamento pode resultar.
	 */

	private Risco grauRiscoHemorragia;

	/**
	 * Grau de risco de ocorrência de trombose que o uso do medicamento pode resultar.
	 */

	private Risco grauRiscoTrombose;

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

	public Risco getRisco() {
		return grauRiscoHemorragia;
	}

	
	public void setRisco(Risco grauRiscoHemorragia) {
		this.grauRiscoHemorragia = grauRiscoHemorragia;
	}

	
	public Risco getRiscoTrombose() {
		return grauRiscoTrombose;
	}

	
	public void setGrauRisco(Risco grauRiscoTrombose) {
		this.grauRiscoTrombose = grauRiscoTrombose;
	}

}
