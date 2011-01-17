package br.ufba.sysaco.domain;

import java.util.Date;
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
	@Column
	private Paciente paciente;
	
	/**
	 * Médico ou farmacêutico que realiza a consulta do paciente.
	 */
	@Column
	private Profissional profissional;
	
	/**
	 * Data da consulta.
	 */
	@Column
	private Date data;
	
	/**
	 * Medicamento utilizado como anticoagulante oral.
	 */
	@Column
	private Medicamento aco;
	
	/**
	 * Dose receitada pelo profissional de saúde
	 */
	@Column
	private Double doseAcoReceitada;
	
	/**
	 * Dose sugerida pelo sistema especialista.
	 * É armazenada para que depois seja analisada num comparativo.
	 */
	@Column
	private Double doseAcoSugerida;
	
	/**
	 * Observação feita na consulta, mas que não cabe no domínio dos atributos desta classe.
	 */
	@Column
	private String observacao;
	
	/**
	 * Valor da Razão Normalizada Internacional.
	 * Este valor é trazido pelo paciente através de um exame.
	 */
	@Column
	private Double rni;
	
	/**
	 * Sangramento apresentado pelo paciente na consulta.
	 */
	@Column
	private Sangramento sangramento;
	
	/**
	 * Local onde é realizada a consulta.
	 */
	@Column
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
	
}
