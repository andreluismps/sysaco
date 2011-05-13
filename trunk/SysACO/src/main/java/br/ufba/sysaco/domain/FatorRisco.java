package br.ufba.sysaco.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa os fatores de risco associados ao paciente.
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
	

	private Risco grauRiscoHemorragia;
	

	private Risco grauRiscoTrombose;

	
	/**
	 * Data de início do fator de risco.
	 */
	private Date dataInicio;

	/**
	 * Data de término do fator de risco.
	 */
	private Date dataTermino;
	
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


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}


	public Date getDataTermino() {
		return dataTermino;
	}
	
}
