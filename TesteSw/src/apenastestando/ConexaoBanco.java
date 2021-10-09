package apenastestando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBanco {

    public Connection abrirConecxao(){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventos", "root", "");
            JOptionPane.showMessageDialog(null, "conectado com sucesso");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRRO: " + erro);
        }
        return con;
    }
}
