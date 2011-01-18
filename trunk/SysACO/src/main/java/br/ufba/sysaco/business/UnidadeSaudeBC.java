package br.ufba.sysaco.business;

import br.ufba.sysaco.domain.UnidadeSaude;
import br.gov.frameworkdemoiselle.annotation.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.ufba.sysaco.persistence.UnidadeSaudeDAO;


@BusinessController
public class UnidadeSaudeBC extends DelegateCrud<UnidadeSaude, Long, UnidadeSaudeDAO> {
	
	private static final long serialVersionUID = 1L;
	
	@Startup
	@Transactional
	public void startup() {
		if (findAll().isEmpty()) {
			insert(new UnidadeSaude("HUPES - Hospital Universitário Professor Edgard Santos"));
			insert(new UnidadeSaude("PSF - Posto Saúde da Família"));
		}
	}
	
}
