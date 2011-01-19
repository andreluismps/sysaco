package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	
	private Double altura;
	
	/**
	 * Peso do paciente (em quilogramas)
	 */
	
	private Double peso;
	
	/**
	 * Nome da mãe do paciente
	 */
	
	private String nomeMae;

	
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

	
	public Double getAltura() {
		return altura;
	}

	
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	
	public Double getPeso() {
		return peso;
	}

	
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	
	public String getNomeMae() {
		return nomeMae;
	}

	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
}
