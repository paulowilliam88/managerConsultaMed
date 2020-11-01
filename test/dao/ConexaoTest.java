/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Paulo
 */
public class ConexaoTest extends TestCase {
    
    public ConexaoTest(String testName) {
        super(testName);
    }

    
    @Test
    public void conectaTest(){
        Conexao conn = new Conexao();
        conn.getConexao();
      
        assertNull(conn.getConexao());
    }
            
            
}
