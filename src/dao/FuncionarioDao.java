/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Funcionario;
import dao.Conexao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class FuncionarioDao {

    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    public ResultSet rs;
    private ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

    public FuncionarioDao() {
        conn = (Connection) new Conexao().getConexao();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        String Sql = "INSERT INTO funcionarios (id, nome_funcionario,cargo,senha,acesso)"
                + " VALUES (?,?,?,?,?)";
        try {
            stmt = (PreparedStatement) conn.prepareStatement(Sql);
            stmt.setInt(1, funcionario.getIdFuncionario());
            stmt.setString(2, funcionario.getAcesso());
            stmt.setString(3, funcionario.getNomeFuncionario());
            stmt.setString(4, funcionario.getCargo());
            stmt.setString(5, funcionario.getSenha());
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao cadastrar: " + e);
        }
    }

    public void alterarFuncionario(Funcionario funcionario) {
        String sql = "UPDATE funcionarios SET nome_funcionario = ?, cargo=?, senha=?,acesso=?"
                + "WHERE id=?";
        try {
            stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setString(4, funcionario.getAcesso());
            stmt.setString(1, funcionario.getNomeFuncionario());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getSenha());
            stmt.setInt(5, funcionario.getIdFuncionario());//verificar se id vai se alterar
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            throw new RuntimeException("Falha ao atualizar: " + e);
        }
    }

    public void excluirFuncionario(int idFunc) {
        String sql = "DELETE FROM funcionarios WHERE id=" + idFunc;
        try {
            st = (Statement) conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel apagar,\n erro: " + e);
        }
    }

    public ArrayList<Funcionario> listarFuncionario() {
        String sql = "SELECT * FROM funcionarios";
        try {
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("id"));
                funcionario.setAcesso(rs.getString("acesso"));
                funcionario.setNomeFuncionario(rs.getString("nome_funcionario"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSenha(rs.getString("senha"));
                lista.add(funcionario);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro: " + e);
        }
        return lista;
    }

    public ArrayList<Funcionario> buscarFuncionario(String nome) {
        String sql = "SELECT *FROM funcionarios WHERE nome_funcionario LIKE'%" + nome + "%'";
        try {
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("id"));
                funcionario.setNomeFuncionario(rs.getString("nome_funcionario"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setAcesso(rs.getString("acesso"));
                funcionario.setSenha(rs.getString("senha"));
                lista.add(funcionario);

            }
        } catch (Exception e) {
            throw new RuntimeException("Funcionario não encontrado erro: " + e);
        }
        return lista;
    }

    public ArrayList<Funcionario> checarAcesso(String nivelAcesso) {

        String Sql = "SELECT*FROM funcionarios WHERE nome_funcionario LIKE'%" + nivelAcesso + "%'";
        try {
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(Sql);

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(rs.getInt("id"));
                funcionario.setNomeFuncionario(rs.getString("nome_funcionario"));
                //funcionario.setCargo(rs.getString("cargo"));
                funcionario.setAcesso(rs.getString("acesso"));
                //funcionario.setSenha(rs.getString("senha"));
                lista.add(funcionario);
                if (rs.getString("acesso").equals("adm")) {
                    String op = "Acesso";
                } else {
                    JOptionPane.showMessageDialog(null, "negado");
                    System.exit(0);

                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("" + ex);
        }
        return lista;
    }

    public boolean checkLogin(String login, String senha, String acesso) {

        boolean check = false;
        try {
            stmt = (PreparedStatement) conn.prepareStatement("SELECT * FROM funcionarios WHERE nome_funcionario=? AND senha=? AND acesso=?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt.setString(3, acesso);
            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;

            }
        } catch (SQLException e) {

        }
        return check;
    }

    public boolean checkAcesso(String nivelAcesso) {

        boolean check = false;
        String Sql = "SELECT*FROM funcionarios WHERE nome_funcionario LIKE'%" + nivelAcesso + "%'";
        try {
            st = (Statement) conn.createStatement();
            rs = st.executeQuery(Sql);

            if (rs.getString("acesso").equals("adm")) {
                check = true;
                JOptionPane.showMessageDialog(null, "ADM");
            }else{
                JOptionPane.showMessageDialog(null,"Não é ADM");
            }
        } catch (SQLException e) {

        }
        return check;
    }
}
