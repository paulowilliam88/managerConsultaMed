package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Consulta;
import dao.Conexao;
import java.sql.SQLException;


public class ConsultaDao {
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    public ArrayList<Consulta> lista = new ArrayList<Consulta>();
    
    public ConsultaDao(){
        conn = (Connection) new Conexao().getConexao();
    }
            public void salvarAtestado(Consulta consulta){
                String sql = "INSERT INTO atestado( paciente_nome, doc_paciente, inf_atestado, dias, cid, hora)+"
                        + " VALUES (?,?,?,?,?,?)";

            try{
            stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setString(1, consulta.getPacienteConsulta());
            stmt.setString(2,consulta.getDocPaciente());
            stmt.setInt(3,consulta.getDiasRepouso());
            stmt.setString(4,consulta.getCid());
            stmt.setString(5,consulta.getInfoAtestado());
            stmt.setString(6,consulta.getHoraConsulta());
            stmt.execute();
            stmt.close();
            }catch(SQLException e){
                throw new RuntimeException("Erro ao gerar atestado: "+e);
        }  
    }
    
}
