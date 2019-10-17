package BancoDeDados;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaBD {
    public Connection conn;//responsável por realizar a conexão com o banco de dados
    public PreparedStatement pstmt;
    public Statement stmt; // responsável por preparar e realizar pesquisas no banco de dados
    public ResultSet rs;   // responsável por armazenar o resultado de uma pesquisa passada para o satatement

    //private final String driver = "com.mysql.jdbc.Driver"; //responsável por identificar o serviço de banco de dados
    private final String url = "jdbc:mysql://localhost:3306/consultech1"; // responsavel por setar o local do banco de dados
    private final String user = "root";
    private final String senha = "1234";
    
    //================================================================================
    public  void conexão() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conn = DriverManager.getConnection(url,user,senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar: "+ ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //================================================================================
    public void executaSQL(String SQL){
        try{
            rs = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY).executeQuery(SQL);
        } 
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"erro do executaSQL: " + ex.getMessage());
        }
    }
    
    //================================================================================
    public void desconecta(){
        try{
            conn.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"erro ao desconectar\n"+ ex.getMessage());
        }
    }
}

    
  