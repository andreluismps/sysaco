package br.ufba.sysaco.domain;

import javax.persistence.Entity;

/**
 * Enumeração que representa o grau de risco de ocorrência de uma hemorragia.
 * @author andre
 *
 * 
 * Vai ser uma escala de ausente, baixo risco, risco moderado, 
 * alto risco, risco mortal.
 * 
 * A mesma coisa vale para a classe GrauRiscoTrombose.
 */
@Entity
public enum Risco {
	AUSENTE("Ausente"), BAIXO("Baixo"), MODERADO("Moderado"), ALTO("Alto"), MORTAL("Mortal");
	
	String descrição;
	
	Risco(String descricao){
		this.descrição = descricao;
	}
}
