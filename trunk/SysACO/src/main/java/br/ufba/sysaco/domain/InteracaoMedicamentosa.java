package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa as interações medicamentosas numa dada consulta junto com o uso de ACO.
 * @author andre
 *
 */
public class InteracaoMedicamentosa {
	@Id
	@GeneratedValue
	private Long id;	
	
	/**
	 * Medicamento da utilizado em paralelo ao anticoagulante oral.
	 */
	@Column
	private Medicamento medicamento;
	
	/**
	 * Dose diária do medicamento, em miligramas.
	 * Poderiam ser 2 atributos?
	 * Como dose e número horas entre as doses.
	 */
	@Column
	private Double doseDiaria;
}
