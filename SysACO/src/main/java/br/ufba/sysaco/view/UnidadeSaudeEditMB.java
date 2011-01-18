package br.ufba.sysaco.view;

 import javax.inject.Inject;

import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.ufba.sysaco.business.UnidadeSaudeBC;
import br.ufba.sysaco.domain.UnidadeSaude;


@ViewController
@PreviousView("/unidadesaude_list.xhtml")
public class UnidadeSaudeEditMB extends AbstractEditPageBean<UnidadeSaude, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private UnidadeSaudeBC unidadeSaudeBC;

	@Override
	@Transactional
	public String delete() {
		this.unidadeSaudeBC.delete(getId());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String insert() {
		this.unidadeSaudeBC.insert(getBean());
		return getPreviousView();
	}


	@Override
	@Transactional
	public String update() {
		this.unidadeSaudeBC.update(getBean());
		return getPreviousView();
	}

	@Override
	protected void handleLoad() {
		setBean(this.unidadeSaudeBC.load(getId()));
	}

}
