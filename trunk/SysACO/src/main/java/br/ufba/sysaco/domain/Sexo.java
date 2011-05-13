package br.ufba.sysaco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Enumeração que representa o sexo de uma pessoa.
 * 
 * @author andre
 */
@Entity
public enum Sexo {
	MASCULINO("Masculino"), FEMININO("Feminino");
	
	String descrição;
	
	Sexo(String descricao){
		this.descrição = descricao;
	}
	
}
