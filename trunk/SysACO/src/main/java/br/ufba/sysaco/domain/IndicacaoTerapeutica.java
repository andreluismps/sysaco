package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa a indicação terapêutica para uso de ACO.
 * @author andre
 *
 */
@Entity
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

	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	
	public Double getAlvoRniMinimo() {
		return alvoRniMinimo;
	}

	
	public void setAlvoRniMinimo(Double alvoRniMinimo) {
		this.alvoRniMinimo = alvoRniMinimo;
	}

	
	public Double getAlvoRniMaximo() {
		return alvoRniMaximo;
	}

	
	public void setAlvoRniMaximo(Double alvoRniMaximo) {
		this.alvoRniMaximo = alvoRniMaximo;
	}

	
	public Long getDuracao() {
		return duracao;
	}

	
	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}	
}
