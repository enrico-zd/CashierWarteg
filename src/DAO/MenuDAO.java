/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.util.List;
import model.ModMenu;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.KoneksiDB;

/**
 *
 * @author LOTUS COMPUTER
 */
public class MenuDAO implements ImplementMenu{
    
    Connection connection;
    final String insert = "INSERT INTO menu(nama, stok, harga) VALUES(?, ?, ?)";
    final String delete = "DELETE FROM menu WHERE id=?";
    final String update = "UPDATE menu SET nama=?, stok=?, harga=? WHERE id=?";
    final String updateStok = "UPDATE menu SET stok=stok-1 WHERE id=?";
    final String select = "SELECT * FROM menu";

    public MenuDAO() {
        connection = KoneksiDB.connection();
    }
    
    @Override
    public void insert(ModMenu mm) {
        PreparedStatement st = null;
        
        try {
            st = connection.prepareStatement(insert);
            
            st.setString(1, mm.getNama());
            st.setInt(2, mm.getStok());
            st.setInt(3, mm.getHarga());
            st.executeUpdate();
            
            ResultSet rs = st.getGeneratedKeys();
            while(rs.next()){
                mm.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                st.close();
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }

    @Override
    public void delete(int id) {
        PreparedStatement st = null;
        
        try {
            st = connection.prepareStatement(delete);
            
            st.setInt(1, id);
            st.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
                st.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(ModMenu mm) {
        PreparedStatement st = null;
        
        try {
            st = connection.prepareStatement(update);
            
            st.setString(1, mm.getNama());
            st.setInt(2, mm.getStok());
            st.setInt(3, mm.getHarga());
            st.setInt(4, mm.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
                st.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<ModMenu> getAll() {
        List<ModMenu> lmm = null;
        
        
        try {
            lmm = new ArrayList<ModMenu>();
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery(select);
            
            while(rs.next()){
                ModMenu mm = new ModMenu();
                mm.setId(rs.getInt("id")); 
                mm.setNama(rs.getString("nama"));
                mm.setStok(rs.getInt("stok"));
                mm.setHarga(rs.getInt("harga"));
                lmm.add(mm);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return lmm;
    }

    @Override
    public void updateStok(ModMenu mm) {
                PreparedStatement st = null;
        
        try {
            st = connection.prepareStatement(updateStok);
            
            st.setInt(1, mm.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
                st.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

}
