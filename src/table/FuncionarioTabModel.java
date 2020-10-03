package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Funcionario;


public class FuncionarioTabModel extends AbstractTableModel{
    public static final int COL_ID_FUNCIONARIO = 0;
    public static final int COL_NOME_FUNCIONARIO = 1;
    public static final int COL_CARGO = 2;
    public static final int COL_ACESSO = 3;
    public static final int COL_SENHA = 4;
    public ArrayList<Funcionario>lista;
    

    
 public FuncionarioTabModel(ArrayList<Funcionario>l){
        lista  = new ArrayList<Funcionario>(l);
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
        Funcionario funcionario = lista.get(linhas);
        if(colunas==COL_ID_FUNCIONARIO) return funcionario.getIdFuncionario();
        if(colunas==COL_NOME_FUNCIONARIO)return funcionario.getNomeFuncionario();
        if(colunas==COL_CARGO) return funcionario.getCargo();
        if(colunas==COL_ACESSO) return funcionario.getAcesso();
        if(colunas==COL_SENHA) return funcionario.getSenha();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if(colunas==COL_ID_FUNCIONARIO)return "ID";
        if(colunas==COL_NOME_FUNCIONARIO)return "Nome";
        if(colunas==COL_CARGO) return "Cargo";
        if(colunas==COL_ACESSO) return "Acesso";
        if(colunas==COL_SENHA) return "Senha";
        return "";
        
    }
  
    
}
