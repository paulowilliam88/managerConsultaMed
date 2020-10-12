/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import junit.framework.TestCase;

/**
 *
 * @author Paulo
 */
public class ConexaoTest extends TestCase {
    Conexao conn;
    public ConexaoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        conn = new Conexao();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getConexao method, of class Conexao.
     */
    public void testGetConexao() {
        
      assertEquals(conn, null);
        
        
    }
    
}
