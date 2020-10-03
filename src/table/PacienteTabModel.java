package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Paciente;


public class PacienteTabModel extends AbstractTableModel {

    public static final int COL_ID_PACIENTE = 0;
    public static final int COL_NOME_PACIENTE = 1;
    public static final int COL_IDADE_PACIENTE = 2;
    public static final int COL_RG_PACIENTE  = 3;
    public static final int COL_TELEFONE_PACIENTE = 4;
    public ArrayList<Paciente> lista;
    
    public PacienteTabModel(ArrayList<Paciente>l){
        lista  = new ArrayList<Paciente>(l);
       
    
}

    @Override
    public int getRowCount() {
        return lista.size();
    
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    
    }
    
    @Override
    public Object getValueAt(int linhas, int colunas) {
        Paciente paciente = lista.get(linhas);
        if (colunas==COL_ID_PACIENTE)return paciente.getIdPaciente();
        if (colunas==COL_NOME_PACIENTE)return paciente.getNome();
        if (colunas==COL_IDADE_PACIENTE) return paciente.getIdade();
        if (colunas==COL_RG_PACIENTE)return paciente.getRgPaciente();
        if (colunas==COL_TELEFONE_PACIENTE)return paciente.getTelefone();
        return"";
        
       }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas==COL_ID_PACIENTE)return "Nº Prontuário";
        if(colunas==COL_NOME_PACIENTE)return"Nome";
        if(colunas==COL_IDADE_PACIENTE)return "Idade";
        if(colunas==COL_RG_PACIENTE)return "Documento";
        if(colunas==COL_TELEFONE_PACIENTE)return"Telefone";
        return"";
                
        }
    }
