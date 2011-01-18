package br.ufba.sysaco.view;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.ufba.sysaco.business.UnidadeSaudeBC;
import br.ufba.sysaco.domain.UnidadeSaude;

@ViewController
@NextView("/unidadesaude_edit.xhtml")
@PreviousView("/unidadesaude_list.xhtml")
public class UnidadeSaudeListMB extends AbstractListPageBean<UnidadeSaude, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private UnidadeSaudeBC bc;

	@Override
	protected List<UnidadeSaude> handleResultList() {
		return this.bc.findAll();
	}

	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long> iter = getSelection().keySet().iterator(); iter.hasNext();) {
			Long id = iter.next();
			delete = getSelection().get(id);

			if (delete) {
				bc.delete(id);
				iter.remove();
			}
		}

		return getPreviousView();
	}

}
