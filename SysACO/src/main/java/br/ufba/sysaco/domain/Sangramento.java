package br.ufba.sysaco.domain;

import javax.persistence.Entity;

/**
 * Enumeração que representa o sangramento que o paciente apresenta na consulta.
 * 
 * @author andre
 */
@Entity
public enum Sangramento {
	AUSENTE("Ausente"), LEVE("Leve"), MODERADO("Moderado"), GRAVE("Grave"), RISCO_DE_MORTE("Risco de Morte");
	
	String descrição;
	
	Sangramento(String descricao){
		this.descrição = descricao;
	}
	

}
