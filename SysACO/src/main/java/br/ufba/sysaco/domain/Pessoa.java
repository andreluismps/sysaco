package br.ufba.sysaco.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Classe que representa o Paciente.
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
	@Column(length=1)
	private Sexo sexo;
	
	/**
	 * Nome da pessoa
	 */
	@Column(length=100)
	private String nome;
		
}
