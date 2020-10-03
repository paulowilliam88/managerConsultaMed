package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Agenda;
import dao.Conexao;


public class AgendaDao {
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    public ResultSet rs;
    public ArrayList<Agenda> lista = new ArrayList<Agenda>();
    
    public AgendaDao(){
       conn = (Connection) new Conexao().getConexao();
    }
    public void agendarConsulta(Agenda agendamento){
        String sql = "INSERT INTO agenda (id_agendamento, paciente_name, data_agendamento, hora, medico, exame_especialidade, status) "
                + "VALUES (?,?,?,?,?,?,?)";
                try{
                   stmt = (PreparedStatement) conn.prepareStatement(sql);
                   stmt.setInt(1,agendamento.getId_agendamento());
                   stmt.setString(2,agendamento.getPaciente_nome());
                   stmt.setString(3,agendamento.getEspecialidade());
                   stmt.setString(4,agendamento.getProfissional());
                   stmt.setString(5,agendamento.getData_agendamento());
                   stmt.setString(6,agendamento.getHorario());
                   stmt.setString(7,agendamento.getStatus());
                   stmt.execute();
                   stmt.close();
                   
                }catch(SQLException e){
                    throw new RuntimeException("Erro ao Agendar Consulta"+e);
            }
                
    }
    public void alterarStatus(Agenda agendamento){
       String sql = "UPDATE agenda SET status = ?, WHERE id_agendamento=?";
        // String sql = "UPDATE agenda SET paciente_name=?, data_agendamento=?, hora=?, medico=?, exame_especialidade=?, status=? WHERE id_agendamento=?";
        try{
            stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setString(1,agendamento.getStatus());
            stmt.setInt(2,agendamento.getId_agendamento());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(""+e);
        }
    }
    public void alterarAgendamento(Agenda agendamento){
       String sql = "UPDATE agenda SET paciente_name=?, data_agendamento=?, hora=?, medico=?, exame_especialidade=?, status=? WHERE id_agendamento=?";
        try{
                   stmt = (PreparedStatement) conn.prepareStatement(sql);
                   stmt.setString(1,agendamento.getPaciente_nome());
                   stmt.setString(2,agendamento.getEspecialidade());
                   stmt.setString(3,agendamento.getProfissional());
                   stmt.setString(4,agendamento.getData_agendamento());
                   stmt.setString(5,agendamento.getHorario());
                   stmt.setString(6,agendamento.getStatus());
                   stmt.setInt(7,agendamento.getId_agendamento());
                   stmt.execute();
                   stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(""+e);
        }
    }
       public ArrayList<Agenda>listarAgendamento(){
           String sql = "SELECT * FROM agenda";
           try{
               st = (Statement) conn.createStatement();
               rs = st.executeQuery(sql);
               while(rs.next()){
                   Agenda agendamento = new Agenda();
                   agendamento.setId_agendamento(rs.getInt("id_agendamento"));
                   agendamento.setPaciente_nome(rs.getString("paciente_name"));
                   agendamento.setEspecialidade(rs.getString("exame_especialidade"));
                   agendamento.setProfissional(rs.getString("medico"));
                   agendamento.setData_agendamento(rs.getString("data_agendamento"));
                   agendamento.setHorario(rs.getString("hora"));
                   agendamento.setStatus(rs.getString("status"));
                   lista.add(agendamento);
               }
           }catch(SQLException e){
               throw new RuntimeException("Não foi possivel carregar agenda erro:"+e);
           }
            return lista;
    }    
        public ArrayList<Agenda> buscarAgendamento(String nome){
            String sql = "SELECT * FROM agenda WHERE paciente_name LIKE'%"+nome+"%'";
            try{
                st  =(Statement) conn.createStatement();
                rs = st.executeQuery(sql);
                while(rs.next()){
                   Agenda agendamento = new Agenda();
                   agendamento.setId_agendamento(rs.getInt("id_agendamento"));
                   agendamento.setPaciente_nome(rs.getString("paciente_name"));
                   agendamento.setEspecialidade(rs.getString("exame_especialidade"));
                   agendamento.setProfissional(rs.getString("medico"));
                   agendamento.setData_agendamento(rs.getString("data_agendamento"));
                   agendamento.setHorario(rs.getString("hora"));
                   agendamento.setStatus(rs.getString("status"));
                   lista.add(agendamento);
                }
                  
            }catch(SQLException e){
                throw new RuntimeException("Erro ao buscar: "+e);
            }
            return lista;
        }
        public void excluirAgendamento(int id){
            String sql = "DELETE FROM agenda WHERE id_agendamento="+id;
            try{
                st = (Statement) conn.createStatement();
                st.execute(sql);
                st.close();
            }catch(SQLException e){
                throw new RuntimeException("Erro ao excluir: "+e);
            }
        }

}
