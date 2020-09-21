package dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private Connection conn;
    
    public Connection getConexao(){
        try{
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto","root",""); 
        }catch(Exception e){
            throw new RuntimeException("Erro:"+e);
        }
    }

    /*public void conexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
    
    
}
