package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Agenda;


public class AgendaTabModel extends AbstractTableModel {
    public static final int COL_ID_AGENDAMENTO = 0;
    public static final int COL_NOME_PACIENTE = 1;
    public static final int COL_RG_PACIENTE = 2;
    public static final int COL_PROFISSIONAL = 3; 
    public static final int COL_ESPECIALIDADE = 4; 
    public static final int COL_HORARIO =5;
    public static final int COL_DATA_AGENDAMENTO = 6;
    public static final int COL_STATUS = 7;
    public ArrayList<Agenda> lista;
    
public AgendaTabModel(ArrayList<Agenda>l){
        lista  = new ArrayList<Agenda>(l);
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
        Agenda agenda = lista.get(linhas);
        if(colunas==COL_ID_AGENDAMENTO)return agenda.getId_agendamento();
        if(colunas==COL_NOME_PACIENTE)return agenda.getPaciente_nome();
        if(colunas==COL_RG_PACIENTE)return agenda.getDocPaciente();
        if(colunas==COL_ESPECIALIDADE)return agenda.getEspecialidade();
        if(colunas==COL_PROFISSIONAL)return agenda.getProfissional();
        if(colunas==COL_DATA_AGENDAMENTO)return agenda.getData_agendamento();
        if(colunas==COL_HORARIO)return agenda.getHorario();
        if(colunas==COL_STATUS)return agenda.getStatus();
        return "";
    }
    @Override
    public String getColumnName(int colunas){
        if(colunas==COL_ID_AGENDAMENTO)return"Nº";
        if(colunas==COL_NOME_PACIENTE)return"Nome";
        if(colunas==COL_RG_PACIENTE)return"RG";
        if(colunas==COL_ESPECIALIDADE)return "Especialidade";
        if(colunas==COL_PROFISSIONAL)return "Médio";
        if(colunas==COL_DATA_AGENDAMENTO)return "Data";
        if(colunas==COL_HORARIO)return "Hora";
        if(colunas==COL_STATUS)return "Status";
        return "";
    }
    
}
