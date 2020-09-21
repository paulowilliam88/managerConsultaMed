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
        String sql = "INSERT INTO paciente (id_paciente, nome_paciente,idade, telefone)"+
                "VALUES(?,?,?,?)";
        
        try{
            stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1,paciente.getIdPaciente());
            stmt.setString(2, paciente.getNome());
            stmt.setInt(3,paciente.getIdade());
            stmt.setInt(4,paciente.getTelefone());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar"+e);
        }
    }
    
    public void atualizarPaciente(Paciente paciente){
        String sql = "UPADATE paciente SET nome_paciente=?, idade=?, telefone=? WHERE id =";
        try{
            stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1, paciente.getIdPaciente());
            stmt.setString(2,paciente.getNome());
            stmt.setInt(3,paciente.getIdade());
            stmt.setInt(4,paciente.getTelefone());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+e);
        }
    }
    
    public void excluirPaciente(int paciente_id){
        String sql = "DELE FROM paciente WHERE id_paciente = "+paciente_id;
        try{
            st = (Statement) conn.createStatement();
            st.execute(sql);
            st.close();           
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro: "+e);
        }
    }
    
    public ArrayList<Paciente> listarPaciente(){
        String sql = "SELECT FROM * paciente";
        try{
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("id_paciente"));
                paciente.setNome(rs.getString("nome_paciente"));
                paciente.setIdade(rs.getInt("idade"));
                paciente.setTelefone(rs.getInt("telefone"));
                lista.add(paciente);
            }
        }catch(SQLException e){
            
        }
        return lista;
    }
    public ArrayList<Paciente>buscarPaciente(String nome){
        String sql = "SELECT FROM paciente WHERE nome_paciente LIKE'%"+nome+"%'";
        try{
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("id_paciente"));
                paciente.setNome(rs.getString("nome_paciente"));
                paciente.setIdade(rs.getInt("idade"));
                paciente.setTelefone(rs.getInt("telefone"));
                lista.add(paciente);
            }
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null,"Erro "+e);
        }
        return lista;
    }
}
