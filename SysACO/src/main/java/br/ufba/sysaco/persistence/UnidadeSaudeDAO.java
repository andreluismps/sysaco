package br.ufba.sysaco.persistence;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import br.ufba.sysaco.domain.UnidadeSaude;

@PersistenceController
public class UnidadeSaudeDAO extends JPACrud<UnidadeSaude, Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Logger logger;
	
}