/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LOTUS COMPUTER
 */
public class KoneksiDB {
    static Connection conn;
    public static Connection connection(){
        if(conn == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_warteg");
            data.setUser("root");
            data.setPassword("");
            
            try {
                conn = data.getConnection();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conn;
    }
}
