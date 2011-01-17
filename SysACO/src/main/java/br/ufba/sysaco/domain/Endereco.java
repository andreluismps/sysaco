package br.ufba.sysaco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa os dados de endereço.
 * @author andre
 *
 */
@Entity
public class Endereco {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length=100)
	private String logradouro;
	
	@Column(length=100)
	private String bairro;
	
	@Column(length=100)
	private String complemento;
	
	@Column(length=100)
	private String numero;
	
	@Column(length=100)
	private String cep;
	
	@Column(length=10)
	private String telefone;

}
