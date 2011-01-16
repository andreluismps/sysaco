package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa a indicação terapêutica para uso de ACO.
 * @author andre
 *
 */
public class IndicacaoTerapeutica {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Valor mínimo do intervalo de RNI para a indicação terapêutica.
	 */
	@Column
	private Double alvoRniMinimo;
	
	/**
	 * Valor máximo do intervalo de RNI para a indicação terapêutica.
	 */
	@Column
	private Double alvoRniMaximo;
	
	/**
	 * Duração em dias do tratamento.
	 * Quando é por tempo indeterminado, permanece com null.
	 */
	@Column
	private Long duracao;
	
	/**
	 * Nome da indicação terapêutica.
	 */
	@Column
	private String nome;	
}
