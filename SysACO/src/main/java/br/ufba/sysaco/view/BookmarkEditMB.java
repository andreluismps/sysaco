package br.ufba.sysaco.view;

 import javax.inject.Inject;

import br.ufba.sysaco.business.BookmarkBC;
import br.ufba.sysaco.domain.Bookmark;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;


@ViewController
@PreviousView("/bookmark_list.xhtml")
public class BookmarkEditMB extends AbstractEditPageBean<Bookmark, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private BookmarkBC bookmarkBC;

	@Override
	@Transactional
	public String delete() {
		this.bookmarkBC.delete(getId());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String insert() {
		this.bookmarkBC.insert(getBean());
		return getPreviousView();
	}


	@Override
	@Transactional
	public String update() {
		this.bookmarkBC.update(getBean());
		return getPreviousView();
	}

	@Override
	protected void handleLoad() {
		setBean(this.bookmarkBC.load(getId()));
	}

}
