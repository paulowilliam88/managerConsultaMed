package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Medicamento;


public class MedicamentoTabModel extends AbstractTableModel {
    public static final int COL_CODIGO_MEDICAMENTO = 0;
    public static final int COL_MEDICAMENTO= 1;
    public static final int COL_QTD_DISPONIVEL= 2;
    public static final int COL_PACIENTE= 3; 
    public static final int COL_RG_PACIENTE= 4; 
    public static final int COL_MEDICO =5;
    public static final int COL_QTD_LIBERADA = 6;
    public static final int COL_DATA_ENTREGA = 7;
    public ArrayList<Medicamento>lista;

    public MedicamentoTabModel(ArrayList<Medicamento>l){
        lista = new ArrayList<Medicamento>(1);
    }
     @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }
    @Override
    public Object getValueAt(int linhas, int colunas) {
        Medicamento medicamento = lista.get(linhas);
        if(colunas==COL_CODIGO_MEDICAMENTO )return medicamento.getCodigo();
        if(colunas==COL_MEDICAMENTO)return medicamento.getMedicamento();
        if(colunas==COL_QTD_DISPONIVEL)return medicamento.getQuantidade();
        if(colunas==COL_PACIENTE)return medicamento.getPaciente_nome();
        if(colunas==COL_RG_PACIENTE)return medicamento.getRg_paciente();
        if(colunas==COL_MEDICO)return medicamento.getMedico();
        if(colunas==COL_QTD_LIBERADA)return medicamento.getQtd_liberada();
        if(colunas==COL_DATA_ENTREGA)return medicamento.getData_entrega();
        return "";
    }
    @Override
    public String getColumnName(int colunas){
        if(colunas==COL_CODIGO_MEDICAMENTO )return "Código";
        if(colunas==COL_MEDICAMENTO)return "Medicamento";
        if(colunas==COL_QTD_DISPONIVEL)return "QTD disponível";
        if(colunas==COL_PACIENTE)return "Paciente";
        if(colunas==COL_RG_PACIENTE)return "RG";
        if(colunas==COL_MEDICO)return "Médico";
        if(colunas==COL_QTD_LIBERADA)return "QTD solicitada";
        if(colunas==COL_DATA_ENTREGA)return "Data";
        return "";
    }
    
}

    
    

