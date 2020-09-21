package dao;
import java.sql.Connection;
import model.Medico;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicoDao {
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Medico> lista = new ArrayList<Medico>();
    
    public MedicoDao(){
        conn = new Conexao().getConexao();
        }
    public void cadastrarMedico(Medico medico){
        String sql = "INSERT INTO medicos(crm_medico, nome_medico,especialidade)values(?,?,?)";
        
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, medico.getCrm_medico());
            stmt.setString(2, medico.getNome_medico());
            stmt.setString(3, medico.getEspecialidade());
            stmt.execute();
            stmt.close();
        }catch(Exception e){
            throw new RuntimeException("Erro ao acadastrar:"+e);
        }
    }
    
    public void alterarMedico(Medico medico){
        String sql = "UPDATE medicos set nome_medico =?, especialidade=? WHERE crm_medico=?";
        try{
            stmt = conn.prepareStatement(sql);
            //stmt.setInt(1, medico.getCrm_medico());
            stmt.setString(1, medico.getNome_medico());
            stmt.setString(2, medico.getEspecialidade());
            stmt.setInt(3, medico.getCrm_medico());
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            //throw new RuntimeException("Erro ao editar:"+e);
            JOptionPane.showMessageDialog(null,"erro: "+erro);
        }
    }
    
    public void excluirMedico(int crm){
        String sql = "DELETE FROM medicos where crm_medico="+crm;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        }catch(Exception e){
            throw new RuntimeException("Erro ao excluir:"+e);
        }
    }
    
    public ArrayList<Medico> listarTodos(){
        String sql = "SELECT *FROM medicos";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Medico medico = new Medico();
                medico.setCrm_medico(rs.getInt("crm_medico"));
                medico.setNome_medico(rs.getString("nome_medico"));
                medico.setEspecialidade(rs.getString("especialidade"));
                lista.add(medico);
            }
        }catch(Exception e){
            throw new RuntimeException("Erro ao listar: "+e);
        }
        return lista;
    }
    
    public ArrayList<Medico> bucarMedico(String nome){
        String sql = "SELECT *FROM medicos WHERE nome_medico LIKE '%"+nome+"%'";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Medico medico = new Medico();
                medico.setCrm_medico(rs.getInt("crm_medico"));
                medico.setNome_medico(rs.getString("nome_medico"));
                medico.setEspecialidade(rs.getString("especialidade"));
                lista.add(medico);
            }
        }catch(Exception e){
            throw new RuntimeException("Erro ao listar: "+e);
        }
        return lista;
    }
    
    public boolean checkLoginMedico(String login, String senha){
        boolean check=false;
        try{
            stmt = conn.prepareStatement("SELECT * FROM medicos WHERE nome_medico=? AND crm_medico=?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro: " + ex);
        }
        return check;
    }
    
}
