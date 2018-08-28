/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aplicacao.testequestao8;

/**
 *
 * @author Luis Novaes
 */

import br.com.aplicacao.questao8.oito;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestQuestaoOito {

	@Test
	public void testWhenfirstArgumentIsNull()
	{
		oito m = new oito();
		Integer value = m.gerResult(null, 0);
		assertTrue("The value m isn't null",value == null);
	}
	
	//@Test
	public void testWhenSecondArgumentIsNull()
	{
		oito m = new oito();
		Integer value = m.gerResult(0, null);
		assertTrue("The value m isn't null",value == null);
	}
	
	//@Test
	public void testWhenAllArgumentIsNull()
	{
		oito m = new oito();
		Integer value = m.gerResult(null, null);
		assertTrue("The value m isn't null",value == null);
	}
	
	//@Test
	public void testReturnValueNegativeOne()
	{
		oito m = new oito();
		Integer value = m.gerResult(10256, 512);
		assertFalse("The answer is wrong",value != -1 );
	}
	
	//@Test
	public void testReturnValue()
	{
		oito m = new oito();
		Integer value = m.gerResult(500, 512);
		assertFalse("The answer is wrong",value == -1 );
	}
}

