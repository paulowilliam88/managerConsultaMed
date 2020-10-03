package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Paciente;
import dao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PacienteDao {
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    public  ResultSet rs;
    public ArrayList<Paciente> lista = new ArrayList<Paciente>();
    
    public PacienteDao(){
        
        conn = (Connection) new Conexao().getConexao();
    }
    
    public void cadastrarPaciente(Paciente paciente){
        String sql = "INSERT INTO paciente ( nome_paciente,rg_paciente, idade, telefone)"+
                "VALUES(?,?,?,?)";
        
        try{
            stmt = (PreparedStatement) conn.prepareStatement(sql);
            //stmt.setInt(1,paciente.getIdPaciente());
            stmt.setString(1, paciente.getNome());
            stmt.setString(2,paciente.getRgPaciente());
            stmt.setInt(3,paciente.getIdade());
            stmt.setString(4,paciente.getTelefone());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar"+e);
        }
    }
    
    public void atualizarPaciente(Paciente paciente){
        String sql = "UPDATE paciente SET nome_paciente=?, rg_paciente=?,idade=?, telefone=? WHERE id_paciente =?";
        try{
            stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setString(1, paciente.getNome());
            stmt.setString(2,paciente.getRgPaciente());
            stmt.setInt(3,paciente.getIdade());
            stmt.setString(4,paciente.getTelefone());
            stmt.setInt(5,paciente.getIdPaciente());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+e);
        }
    }
    
    public void excluirPaciente(int paciente_id){
        String sql = "DELETE FROM paciente WHERE id_paciente = "+paciente_id;
        try{
            st = (Statement) conn.createStatement();
            st.execute(sql);
            st.close();           
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }
    }
    
    public ArrayList<Paciente> listarPaciente(){
        String sql = "SELECT * FROM paciente";
        try{
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("id_paciente"));
                paciente.setNome(rs.getString("nome_paciente"));
                paciente.setRgPaciente(rs.getString("rg_paciente"));
                paciente.setIdade(rs.getInt("idade"));
                paciente.setTelefone(rs.getString("telefone"));
                lista.add(paciente);
            }
        }catch(SQLException e){
            throw new RuntimeException("Erro: "+e);
        }
        return lista;
    }
    public ArrayList<Paciente>buscarPaciente(String nome){
        String sql = "SELECT * FROM paciente WHERE nome_paciente LIKE'%"+nome+"%'";
        try{
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("id_paciente"));
                paciente.setNome(rs.getString("nome_paciente"));
                paciente.setRgPaciente(rs.getString("rg_paciente"));
                paciente.setIdade(rs.getInt("idade"));
                paciente.setTelefone(rs.getString("telefone"));
                lista.add(paciente);
            }
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null,"Erro "+e);
        }
        return lista;
    }
        public ArrayList<Paciente>buscarPacienteNome(String nome){
        String sql = "SELECT * FROM paciente WHERE nome_paciente LIKE'%"+nome+"%'";
        try{
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Paciente paciente = new Paciente();
                
                paciente.setNome(rs.getString("nome_paciente"));
               
                lista.add(paciente);
            }
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null,"Erro "+e);
        }
        return lista;
    }
}
