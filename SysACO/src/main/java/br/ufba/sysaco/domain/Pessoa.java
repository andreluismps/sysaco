package br.ufba.sysaco.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Classe que representa dados pessoais.
 * @author andre
 *
 */
@Entity
public class Pessoa {
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * Número de CPF da pessoa.
	 */
	@Column(length=11)
	private String cpf;
	
	/**
	 * Data de nascimento.
	 */
	@Column
	private Date dataNascimento;
	
	/**
	 * Endereço da pessoa
	 */
	@Column
	private Endereco endereco;
	
	/**
	 * Número de Registro Geral
	 */
	@Column(length=20)
	private String rg;
	
	/**
	 * Sexo da pessoa
	 */
	@Column
	private Sexo sexo;
	
	/**
	 * Nome da pessoa
	 */
	@Column(length=100)
	private String nome;

	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getCpf() {
		return cpf;
	}

	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	public Endereco getEndereco() {
		return endereco;
	}

	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	public String getRg() {
		return rg;
	}

	
	public void setRg(String rg) {
		this.rg = rg;
	}

	
	public Sexo getSexo() {
		return sexo;
	}

	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
