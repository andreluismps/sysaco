package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa a unidade de saúde onde uma consulta é realizada.
 * @author andre
 *
 */
public class UnidadeSaude {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Nome da unidade de saúde.
	 */
	@Column
	private String nome;
	
	/**
	 * Endereço da Unidade de Saúde.
	 */
	@Column
	private Endereco endereco;

}
