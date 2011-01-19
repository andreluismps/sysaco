package br.ufba.sysaco.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.ufba.sysaco.domain.Endereco;
import br.ufba.sysaco.persistence.EnderecoDAO;


@BusinessController
public class EnderecoBC extends DelegateCrud<Endereco, Long, EnderecoDAO> {
	
	private static final long serialVersionUID = 1L;
	/*
	@Startup
	@Transactional
	public void startup() {
		if (findAll().isEmpty()) {
			insert(new UnidadeSaude("HUPES - Hospital Universitário Professor Edgard Santos"));
			insert(new UnidadeSaude("PSF - Posto Saúde da Família"));
		}
	}
	*/
}
