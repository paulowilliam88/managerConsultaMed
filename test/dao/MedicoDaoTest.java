package dao;

import java.util.List;
import junit.framework.TestCase;
import model.Medicamento;
import org.junit.Test;

/**
 *
 * @author Paulo
 */
public class MedicoDaoTest extends TestCase {

    public MedicoDaoTest(String testName) {
        super(testName);
    }

    public void testSomeMethod() {
    }

    @Test

    public void cadastrarMedicamentoTest() {
        MedicamentoDao mediDao = new MedicamentoDao();
        Medicamento med = new Medicamento();
        med.setMedicamento("Dipirona");
        med.setQuantidade(300);
        med.setPaciente_nome("Carlos");
        med.setMedico("Giannini");
        med.setQtd_liberada(10);
        med.setData_entrega("23/10/2020");
        mediDao.cadastrarMedicamento(med);
        List<Medicamento> lista = mediDao.listarMedicamentos();
        
        assertSame(med.getMedicamento(),lista.get(0).getMedicamento());
        
    }

}
