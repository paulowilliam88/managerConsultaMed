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

    public ConsultaDao() {
        conn = (Connection) new Conexao().getConexao();
    }

    public void salvarAtestado(Consulta consulta) {
        String sql = "INSERT INTO atestado( paciente_nome, doc_paciente, inf_atestado, dias, cid, hora)"
                + " VALUES (?,?,?,?,?,?)";

        try {
            stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setString(1, consulta.getPacienteConsulta());
            stmt.setString(2, consulta.getDocPaciente());
            stmt.setString(3, consulta.getInfoAtestado());
            stmt.setInt(4, consulta.getDiasRepouso());
            stmt.setString(5, consulta.getCid());
            stmt.setString(6, consulta.getHoraConsulta());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao gerar atestado: " + e);
        }
    }

    public ArrayList<Consulta> buscarAtestado(String nome) {
        String sql = "SELECT * FROM atestado WHERE nome_paciente LIKE'%" + nome + "%'";
        try {
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Consulta consulta = new Consulta();
                consulta.setIdConsulta(rs.getInt("id_atestado"));
                consulta.setPacienteConsulta(rs.getString("nome_paciente "));
                consulta.setCid(rs.getString("cid"));
                consulta.setDiasRepouso(rs.getInt("dias"));
                consulta.setDocPaciente(rs.getString("doc_paciente"));
                consulta.setHoraConsulta(rs.getString("hora"));
                consulta.setInfoAtestado(rs.getString("inf_atestado"));
                lista.add(consulta);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e);
        }
        return lista;
    }

    public void gerarAtendimento() {
        String sql = "TRUNCATE TABLE atestado";
        try {
            st = (Statement) conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException e) {
            throw new RuntimeException("" + e);
        }
    }

}
