/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class Delete {
    Sambungan konek = new Sambungan();

    public void delete(int nim) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "delete from identitas where nim = '" + nim + "'";

            statement.executeUpdate(sql);
            statement.close();
            
            int hps = 0;
            JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghapus data tersebut?");
            if(hps == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            }else{
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
