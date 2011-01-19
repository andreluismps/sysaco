package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa a unidade de saúde onde uma consulta é realizada.
 * 
 * @author andre
 */
@Entity
public class UnidadeSaude {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * Nome da unidade de saúde.
	 */

	private String nome;

	/**
	 * Endereço da Unidade de Saúde.
	 */

	private Endereco endereco;
	
	public UnidadeSaude() {
		
	}

	public UnidadeSaude(String nome) {
		this(nome, null);
	}

	public UnidadeSaude(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
