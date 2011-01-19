package br.ufba.sysaco.domain;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe que representa a visita do paciente ao profissional
 * o qual recebe os exames com os dados de RNI e deste modo
 * passa a recomendação de dosagem do anticoagulante oral.
 * @author andre
 *
 */
@Entity
public class Consulta {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Paciente que vai à consulta.
	 */

	private Paciente paciente;
	
	/**
	 * Médico ou farmacêutico que realiza a consulta do paciente.
	 */
	
	private Profissional profissional;
	
	/**
	 * Data da consulta.
	 */
	
	private Date data;
	
	/**
	 * Medicamento utilizado como anticoagulante oral.
	 */
	
	private Medicamento aco;
	
	/**
	 * Dose receitada pelo profissional de saúde
	 */
	
	private Double doseAcoReceitada;
	
	/**
	 * Dose sugerida pelo sistema especialista.
	 * É armazenada para que depois seja analisada num comparativo.
	 */
	
	private Double doseAcoSugerida;
	
	/**
	 * Observação feita na consulta, mas que não cabe no domínio dos atributos desta classe.
	 */
	
	private String observacao;
	
	/**
	 * Valor da Razão Normalizada Internacional.
	 * Este valor é trazido pelo paciente através de um exame.
	 */
	
	private Double rni;
	
	/**
	 * Sangramento apresentado pelo paciente na consulta.
	 */
	
	private Sangramento sangramento;
	
	/**
	 * Local onde é realizada a consulta.
	 */
	
	private UnidadeSaude unidadeSaude;
	
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

	
	public Paciente getPaciente() {
		return paciente;
	}

	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
	public Profissional getProfissional() {
		return profissional;
	}

	
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	
	public Date getData() {
		return data;
	}

	
	public void setData(Date data) {
		this.data = data;
	}

	
	public Medicamento getAco() {
		return aco;
	}

	
	public void setAco(Medicamento aco) {
		this.aco = aco;
	}

	
	public Double getDoseAcoReceitada() {
		return doseAcoReceitada;
	}

	
	public void setDoseAcoReceitada(Double doseAcoReceitada) {
		this.doseAcoReceitada = doseAcoReceitada;
	}

	
	public Double getDoseAcoSugerida() {
		return doseAcoSugerida;
	}

	
	public void setDoseAcoSugerida(Double doseAcoSugerida) {
		this.doseAcoSugerida = doseAcoSugerida;
	}

	
	public String getObservacao() {
		return observacao;
	}

	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	
	public Double getRni() {
		return rni;
	}

	
	public void setRni(Double rni) {
		this.rni = rni;
	}

	
	public Sangramento getSangramento() {
		return sangramento;
	}

	
	public void setSangramento(Sangramento sangramento) {
		this.sangramento = sangramento;
	}

	
	public UnidadeSaude getUnidadeSaude() {
		return unidadeSaude;
	}

	
	public void setUnidadeSaude(UnidadeSaude unidadeSaude) {
		this.unidadeSaude = unidadeSaude;
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
