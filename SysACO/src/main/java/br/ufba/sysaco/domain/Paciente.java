package br.ufba.sysaco.domain;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe que representa os dados referentes ao paciente.
 * @author andre
 *
 */
@Entity
public class Paciente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Paciente possui dados pessoais.
	 */
	
	private Pessoa pessoa;
	
	/**
	 * Altura do paciente (em metros).
	 */
	
	private BigDecimal altura;
	
	/**
	 * Peso do paciente (em quilogramas)
	 */
	
	private BigDecimal peso;
	
	/**
	 * Nome da mãe do paciente
	 */
	
	private String nomeMae;
	
	/**
	 * Conjunto das Indicações terapêuticas às quais o paciente apresenta na consulta.
	 * São estas indicações que fazem necessário o tratamento com uso de ACO.
	 * 
	 * Negócio: A que possuir o intervalo terapêutico de RNI deve ser a considerada pelo sistema especialista.
	 */
	@OneToMany
	private Set<IndicacaoTerapeutica> IndicacoesTerapeuticas;
	
	/**
	 * Conjunto de fatores de risco que o paciente apresenta na consulta.
	 */
	@OneToMany
	private Set<FatorRisco> FatoresRisco;
	
	/**
	 * Conjunto de medicações além do anticoagulante oral que o paciente 
	 * está fazendo uso no período da consulta.
	 */
	@OneToMany
	private Set<InteracaoMedicamentosa> InteracoesMedicamentosas;


	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	
	public Pessoa getPessoa() {
		return pessoa;
	}

	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
	public BigDecimal getAltura() {
		return altura;
	}

	
	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	
	public BigDecimal getPeso() {
		return peso;
	}

	
	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	
	public String getNomeMae() {
		return nomeMae;
	}

	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public Set<IndicacaoTerapeutica> getIndicacoesTerapeuticas() {
		return IndicacoesTerapeuticas;
	}

	
	public void setIndicacoesTerapeuticas(Set<IndicacaoTerapeutica> indicacoesTerapeuticas) {
		IndicacoesTerapeuticas = indicacoesTerapeuticas;
	}

	
	public Set<FatorRisco> getFatoresRisco() {
		return FatoresRisco;
	}

	
	public void setFatoresRisco(Set<FatorRisco> fatoresRisco) {
		FatoresRisco = fatoresRisco;
	}

	
	public Set<InteracaoMedicamentosa> getInteracoesMedicamentosas() {
		return InteracoesMedicamentosas;
	}

	
	public void setInteracoesMedicamentosas(Set<InteracaoMedicamentosa> interacoesMedicamentosas) {
		InteracoesMedicamentosas = interacoesMedicamentosas;
	}
	
}
