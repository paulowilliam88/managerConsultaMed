/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.fasterxml.jackson.core.json.CoreVersion.instance;
import java.util.List;
import junit.framework.TestCase;
import model.Funcionario;
import org.junit.Test;
import org.mockito.Mock;
import junit.framework.*;
import org.mockito.Mockito;

/**
 *
 * @author Paulo
 */
public class FuncionarioDaoTest extends TestCase {

    FuncionarioDao fDao = new FuncionarioDao();
    Funcionario func = new Funcionario();
    public static Integer idFuncionario = 0;

    public FuncionarioDaoTest(String testName) {
        super(testName);
    }

  
    @Test
    public void testCadastrarFuncionario() {
        
        
        func.setNomeFuncionario("João");
        func.setSenha("000");
        func.setAcesso("Operador");
        func.setCargo("Recepcionista");
        fDao.cadastrarFuncionario(func);
        List<Funcionario> lista = fDao.listarFuncionario();

        assertSame(func.getNomeFuncionario(), lista.get(0).getNomeFuncionario());
    }
    @Test
    public void testCehckLogin(){
      
        assertTrue(fDao.checkLogin("Paulo", "000", "Administrador"));
        assertTrue(fDao.checkLogin("João","000","Operador"));
        assertFalse(fDao.checkLogin("Maria","123","Administrador"));
    
}

}
