package br.ufba.sysaco.domain;

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

	private Double doseDiaria;

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

	public Double getDoseDiaria() {
		return doseDiaria;
	}

	public void setDoseDiaria(Double doseDiaria) {
		this.doseDiaria = doseDiaria;
	}
}
