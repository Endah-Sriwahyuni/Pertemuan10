/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class Sambungan {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Sambungan teskoneksi = new Sambungan();
        teskoneksi.koneksi();
    }

    Connection con = null;

    String statuskoneksi;
    String statuskone0ksi;
    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/endah";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses Sambungan");
            statuskoneksi = "Berhasil";
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
             statuskoneksi = "Gagal";
            System.exit(0);
        }
    }

    void statuskoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
