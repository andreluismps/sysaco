package br.ufba.sysaco.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa as interações medicamentosas numa dada consulta junto com o uso de ACO.
 * 
 * @author andre
 */
@Entity
public class InteracaoMedicamentosa {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * Medicamento da utilizado em paralelo ao anticoagulante oral.
	 */

	private Medicamento medicamento;

	/**
	 * Dose diária do medicamento, em miligramas. Poderiam ser 2 atributos? Como dose e número horas entre as doses.
	 */

	private BigDecimal doseDiaria;
	
	/**
	 * Data de início da interação medicamentosa.
	 */
	private Date dataInicio;

	/**
	 * Data de término da interação medicamentosa.
	 */
	private Date dataTermino;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public BigDecimal getDoseDiaria() {
		return doseDiaria;
	}

	public void setDoseDiaria(BigDecimal doseDiaria) {
		this.doseDiaria = doseDiaria;
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
