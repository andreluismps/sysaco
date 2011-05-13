package br.ufba.sysaco.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa a indicação terapêutica para uso de ACO.
 * 
 * @author andre
 */
@Entity
public class IndicacaoTerapeutica {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * Valor mínimo do intervalo de RNI para a indicação terapêutica.
	 */

	private BigDecimal alvoRniMinimo;

	/**
	 * Valor máximo do intervalo de RNI para a indicação terapêutica.
	 */

	private BigDecimal alvoRniMaximo;

	/**
	 * Duração em dias do tratamento. Quando é por tempo indeterminado, permanece com null.
	 */

	private Long duracao;

	/**
	 * Nome da indicação terapêutica.
	 */

	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAlvoRniMinimo() {
		return alvoRniMinimo;
	}

	public void setAlvoRniMinimo(BigDecimal alvoRniMinimo) {
		this.alvoRniMinimo = alvoRniMinimo;
	}

	public BigDecimal getAlvoRniMaximo() {
		return alvoRniMaximo;
	}

	public void setAlvoRniMaximo(BigDecimal alvoRniMaximo) {
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
