/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import junit.framework.Assert;
import junit.framework.TestCase;
import model.Agenda;
import model.Medico;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.internal.util.MockCreationValidator;
import org.mockito.stubbing.OngoingStubbing;

/**
 *
 * @author Paulo
 */
public class TestesUnitarios extends TestCase {

    AgendaDao agdao = new AgendaDao();
    MedicoDao mdao = new MedicoDao();
    FuncionarioDao fdao = new FuncionarioDao();
    Agenda agenda = new Agenda();

    public TestesUnitarios(String testName) {
        super(testName);
    }

    @Test
    public void testeCheckAgendaVerdadeiro() {
        assertEquals(agdao.checkAgenda("kevin", "2020-10-31", "09:00"), false);
    }

    @Test
    public void testeCheckAgendaFalso() {
        assertEquals(agdao.checkAgenda("kevin", "2020-10-23", "09:00"), true);
    }

    @Test
    public void testLoginErrado() {
        assertEquals(mdao.checkLoginMedico("kkkk", "73377"), false);
    }

    @Test
    public void testLoginCorreto() {
        assertEquals(mdao.checkLoginMedico("kevin", "7777"), true);

    }

    @Test
    public void testLoginFuncionario() {
        assertEquals(fdao.checkLogin("Paulo William", "9999", "Administrador"), true);
    }

    @Test
    public void testAlteraStatus() {
        AgendaDao agDaoTest = mock(AgendaDao.class);
        Agenda agTest = mock(Agenda.class);

        OngoingStubbing<Integer> thenReturn = when(agTest.getId_agendamento()).thenReturn(1);
        when(agTest.getStatus()).thenReturn("Ausente");
        agDaoTest.alterarStatus(agenda);

        String retultado = agTest.getStatus();
        assertEquals(retultado, "Ausente");
        System.out.println("Resultado: " + retultado);
    }

    @Test
    public void testCadastrarMedico() {
        Medico medico = mock(Medico.class);
        MedicoDao medDao = mock(MedicoDao.class);

        when(medico.getCrm_medico()).thenReturn(6363);
        when(medico.getNome_medico()).thenReturn("Pedro");
        when(medico.getEspecialidade()).thenReturn("Pediatra");

        medDao.cadastrarMedico(medico);

        assertNotNull(medico.getCrm_medico());
        System.out.println(medico.getNome_medico());

    }

    @Test
    public void testConexao() {
        Conexao con = mock(Conexao.class);
        when(con.getConexao());
        assertNotNull(con);
    }

}
