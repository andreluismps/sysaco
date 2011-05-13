/**
 * 
 */
package br.ufba.sysaco.business;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import junit.framework.Assert;

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
	private EnderecoBCTest endTest;
	
	@Inject
	UnidadeSaudeBC bc;
	
	@Before
	public void before() {
		for (UnidadeSaude uns : bc.findAll()) {
			bc.delete(uns.getId());
		}
	}

	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#delete(java.lang.Object)}.
	 */

	@Test
	public void testDelete() {
		UnidadeSaude us = getMinimalValidUnidadeSaude();
		bc.insert(us);
		assertNotNull(us.getId());
	}

	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#findAll()}.
	 */

	@Test
	public void testFindAll() {
		UnidadeSaude uns = getMinimalValidUnidadeSaude();
		bc.insert(uns);
		uns.setNome("uns");
		bc.update(uns);
		UnidadeSaude uns2 = getMinimalValidUnidadeSaude();
		bc.insert(uns2);
		uns2.setNome("uns2");
		bc.update(uns2);
		UnidadeSaude uns3 = getMinimalValidUnidadeSaude();
		bc.insert(uns);
		uns3.setNome("uns3");
		bc.update(uns3);
		
		List<UnidadeSaude> lista = bc.findAll();
		
		Assert.assertEquals("uns", lista.get(0).getNome());
		Assert.assertEquals("uns2", lista.get(1).getNome());
		Assert.assertEquals("uns3", lista.get(2).getNome());
		
		
	}

	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#insert(java.lang.Object)}.
	 */
	
	@Test
	public void testInsert() {
		UnidadeSaude uns = getMinimalValidUnidadeSaude();
		bc.insert(uns);
		assertNotNull(uns.getId());
	}

	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#load(java.lang.Object)}.
	 */
	
	@Test
	public void testLoad() {
		UnidadeSaude us = getMinimalValidUnidadeSaude();
		bc.insert(us);
		assertNotNull( bc.load(us.getId()));
	}

	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#update(java.lang.Object)}.
	 */
	
	@Test
	
	public void testUpdate() {
		UnidadeSaude uns = getMinimalValidUnidadeSaude();
		bc.insert(uns);
		uns.setNome("uns");
		bc.update(uns);		
		Assert.assertEquals("uns", bc.load(uns.getId()).getNome());
	}
	
	
	private UnidadeSaude getMinimalValidUnidadeSaude() {
		Endereco end = endTest.getMinimalValidEndereco();
		return new UnidadeSaude("Hospital Universitário", end);
	}

}
