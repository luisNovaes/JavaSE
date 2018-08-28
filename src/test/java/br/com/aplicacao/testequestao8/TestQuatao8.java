/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aplicacao.testequestao8;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Luis Novaes
 */

public class TestQuatao8 
    extends TestCase
{
  
    public TestQuatao8( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( TestQuatao8.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}

