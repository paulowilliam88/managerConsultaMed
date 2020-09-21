
package table;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import model.Medico;

public class MedicoTabModel extends AbstractTableModel {
    
    public static final int COL_CRM_MEDICO = 0;
    public static final int COL_NOME_MEDICO = 1;
    public static final int COL_ESPECIALIDADE= 2;
    public ArrayList<Medico>lista;
    
    public MedicoTabModel(ArrayList<Medico>l){
        lista  = new ArrayList<Medico>(l);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Medico medico = lista.get(linhas);
        if(colunas ==COL_CRM_MEDICO) return medico.getCrm_medico();
        if(colunas ==COL_NOME_MEDICO) return medico.getNome_medico();
        if(colunas ==COL_ESPECIALIDADE) return medico.getEspecialidade();
        return "";
        
    }
    @Override
    public String getColumnName(int colunas){
        if(colunas ==COL_CRM_MEDICO) return "CRM";
        if(colunas ==COL_NOME_MEDICO) return "Médico";
        if(colunas ==COL_ESPECIALIDADE) return "Especialidade";
        return "";
    }
    
}
