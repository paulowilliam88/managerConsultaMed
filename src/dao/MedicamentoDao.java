
package dao;


import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import model.Medicamento;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicamentoDao {
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Medicamento> lista = new ArrayList<Medicamento>();
    
    public MedicamentoDao(){
        conn = new Conexao().getConexao();
    }
    public void cadastrarMedicamento(Medicamento med){
        String sql = "INSERT INTO medicamento(medicamento,qtd_disponivel,paciente_nome,rg_paciente, medico,qtd_liberada,"+
                 "data_entrega) VALUES(?,?,?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,med.getMedicamento());
            stmt.setInt(2,med.getQuantidade());
            stmt.setString(3,med.getPaciente_nome());
            stmt.setString(4,med.getRg_paciente());
            stmt.setString(5,med.getMedico());
            stmt.setString(6,med.getData_entrega());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException("Erro ao cadastrar: "+e);
        }
            
    }
    
    public void editarMedicamento(Medicamento med){
        String sql = "UPADATE medicamento set medicamento=?,qtd_disponivel=?,paciente_nome=?,rg_paciente=?,medico=?; qtd_liberada=?; data_entrega=? WHERE codigo =?";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,med.getMedicamento());
            stmt.setInt(2,med.getQuantidade());
            stmt.setString(3,med.getPaciente_nome());
            stmt.setString(4,med.getRg_paciente());
            stmt.setString(5,med.getMedico());
            stmt.setString(6,med.getData_entrega());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException("Erro ao atualizar: "+e);
        }
    }
    public void excluirMedicamento(int cod){
        String sql = "DELETE FROM medicamentos WHERE id = "+cod;
        try{
          st = conn.createStatement();
          st.execute(sql);
          st.close();
            
        }catch(SQLException e){
            throw new RuntimeException("Erro ao excluir ");
        }
    }
    public ArrayList<Medicamento> listarMedicamentos(){
      String sql = "SELECT *FROM medicamento";  
      try{
          st = conn.createStatement();
          rs = st.executeQuery(sql);
          while(rs.next()){
              Medicamento med = new Medicamento();
              med.setCodigo(rs.getInt("codigo"));
              med.setMedicamento(rs.getString("medicamento"));
              med.setQuantidade(rs.getInt("qtd_disponivel"));
              med.setPaciente_nome(rs.getString("paciente_nome"));
              med.setRg_paciente(rs.getString("rg_paciente"));
              med.setMedico(rs.getString("medico"));
              med.setQtd_liberada(rs.getInt("qtd_liberada"));
              med.setData_entrega(rs.getString("data_entrega"));
              lista.add(med);
          }
      }catch(SQLException e){
          throw new RuntimeException("Erro ao listar"+e);
      }
      return lista;
    }
    
}
