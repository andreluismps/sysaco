package br.ufba.sysaco.persistence;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import br.ufba.sysaco.domain.Pessoa;

@PersistenceController
public class PessoaDAO extends JPACrud<Pessoa, Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Logger logger;
	
}