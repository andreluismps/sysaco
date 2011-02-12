/**
 * 
 */
package br.ufba.sysaco.business;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.drools.command.assertion.AssertEquals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.gov.frameworkdemoiselle.util.DemoiselleRunner;
import br.ufba.sysaco.domain.Endereco;
import br.ufba.sysaco.init.ApplicationLoader;


/**
 * @author andre
 *
 */
@Transactional
@RunWith(DemoiselleRunner.class)
public class EnderecoBCTest {
	
	@Inject
	private ApplicationLoader appLoader;
	
	@Inject
	EnderecoBC bc;
	
	@Before
	public void before() {
		for (Endereco endereco : bc.findAll()) {
			bc.delete(endereco.getId());
		}
	}

	/**
	 * Test method for {@link br.gov.frameworkdemoiselle.template.DelegateCrud#insert(java.lang.Object)}.
	 */
	
	/*
	 * Testes da camada de DAO.
	 */
	@Test
	public void testInsert() {
		Endereco endereco = getMinimalValidEndereco();
		bc.insert(endereco);
		assertNotNull(endereco.getId());
	}
	
	@Test	
	public void testUpdate() {
		Endereco endereco = getMinimalValidEndereco();
		bc.insert(endereco);
		String novoNumero = "15";
		endereco.setNumero("15");
		bc.update(endereco);
		endereco = bc.load(endereco.getId());
		Assert.assertEquals(novoNumero, endereco.getNumero());
	}
	
	@Test	
	public void testDelete() {
		Endereco endereco = getMinimalValidEndereco();
		bc.insert(endereco);
		endereco = bc.load(endereco.getId());	
		bc.delete(endereco.getId());		
		Assert.assertNull(endereco);
	}
	
	@Test
	public void testInsertLogradouroNull() {
		Endereco endereco = getMinimalValidEndereco();
		endereco.setLogradouro(null);
		bc.insert(endereco);
		Assert.assertNull(endereco.getId());
	}
	
	/*
	 * Testes da camada de negócio.
	 */
	
	/**
	 * Este método retorna um objeto que é minimamente válido.
	 * @return Objeto mínimo possível
	 */

	private Endereco getMinimalValidEndereco() {
		Endereco endereco = new Endereco();
		endereco.setBairro("Bairro");
		endereco.setCep("40000000");
		endereco.setComplemento("Era uma casa, Muito engraçada, Não tinha teto, Não tinha nada...");
		endereco.setLogradouro("Rua dos Bobos");
		endereco.setNumero("0");
		endereco.setTelefone("7133558899");
		return endereco;
	}

}
