/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appkasir_ujikom;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author OWNER
 */
public class Koneksi {
  Connection koneksi=null;
    
    public static Connection koneksidb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
              Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir_langxriz","root","");
              return koneksi;
        }catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Tidak Terkoneksi ke Database");
           return null;
                }
    }  
}
