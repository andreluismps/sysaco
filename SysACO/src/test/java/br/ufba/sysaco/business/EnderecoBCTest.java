/**
 * 
 */
package br.ufba.sysaco.business;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

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
	@Test
	public void testInsert() {
		Endereco endereco = getMinimalValidEndereco();
		bc.insert(endereco);
		assertNotNull(endereco.getId());
	}

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
