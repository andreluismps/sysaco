/**
 * 
 */
package br.ufba.sysaco.business;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.gov.frameworkdemoiselle.util.DemoiselleRunner;
import br.ufba.sysaco.domain.Endereco;
import br.ufba.sysaco.domain.UnidadeSaude;
import br.ufba.sysaco.init.ApplicationLoader;


/**
 * @author andre
 *
 */
@Transactional
@RunWith(DemoiselleRunner.class)
public class UnidadeSaudeBCTest {
	
	@Inject
	private ApplicationLoader appLoader;
	
	@Inject
	UnidadeSaudeBC bc;
	/*
	@Before
	public void before() {
		for (UnidadeSaude uns : bc.findAll()) {
			bc.delete(uns.getId());
		}
	}
*/
	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#delete(java.lang.Object)}.
	 */
	/*
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}
*/
	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#findAll()}.
	 */
	/*
	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}
*/
	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#insert(java.lang.Object)}.
	 */
	
	@Test
	public void testInsert() {
		Endereco end = new Endereco();
		end.setBairro("");
		end.setCep("4044444");
		end.setComplemento("");
		end.setLogradouro("");
		end.setNumero("11A");
		end.setTelefone("3213122");
		UnidadeSaude uns = new UnidadeSaude("Hospital Universitário", end);
		bc.insert(uns);
		assertNotNull(uns.getId());
	}

	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#load(java.lang.Object)}.
	 */
	/*
	@Test
	public void testLoad() {
		fail("Not yet implemented");
	}
*/
	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#update(java.lang.Object)}.
	 */
	/*
	@Test
	
	public void testUpdate() {
		fail("Not yet implemented");
	}
	*/

}
