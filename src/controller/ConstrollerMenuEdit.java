/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.ImplementMenu;
import DAO.MenuDAO;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModMenu;
import model.ModTabelMenu;
import view.FormManajemenMenu;

/**
 *
 * @author LOTUS COMPUTER
 */
public class ConstrollerMenuEdit {
    FormManajemenMenu frame;
    ImplementMenu implMenu;
    List<ModMenu> lmm;

    public ConstrollerMenuEdit(FormManajemenMenu frame) {
        this.frame = frame;
        implMenu = new MenuDAO();
        lmm = implMenu.getAll();
    }
    
    public void reset(){
        frame.getTxtId().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtStok().setText("");
        frame.getTxtHarga().setText("");
        
    }
    
    public void isiTable(){
        lmm = implMenu.getAll();
        
        ModTabelMenu mtm = new ModTabelMenu(lmm);
        frame.getTblEdit().setModel(mtm);
    }
    
    public void isiField(int row){
        frame.getTxtId().setText(String.valueOf(lmm.get(row).getId()));
        frame.getTxtNama().setText(lmm.get(row).getNama());
        frame.getTxtStok().setText(String.valueOf(lmm.get(row).getStok()));
        frame.getTxtHarga().setText(String.valueOf(lmm.get(row).getHarga()));
    }
    
    public void insert(){
        if(!frame.getTxtNama().getText().trim().isEmpty() & !frame.getTxtNama().getText().trim().isEmpty()){
            ModMenu mm = new ModMenu();
            
            mm.setNama(frame.getTxtNama().getText());
            mm.setStok(Integer.valueOf(frame.getTxtStok().getText()));
            mm.setHarga(Integer.valueOf(frame.getTxtHarga().getText())) ;
            
            implMenu.insert(mm);
            JOptionPane.showMessageDialog(null, "Data disimpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal disimpan");
        }
    }
    
    public void delete(){
        if(!frame.getTxtId().getText().trim().isEmpty()){
            int id = Integer.valueOf(frame.getTxtId().getText());
            
            implMenu.delete(id);
            JOptionPane.showMessageDialog(null, "Data dihapus");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal gerhapus");
        }
    }
    
    public void update(){
        if(!frame.getTxtId().getText().trim().isEmpty()){
            ModMenu mm = new ModMenu();
            
            mm.setNama(frame.getTxtNama().getText());
            mm.setStok(Integer.valueOf(frame.getTxtStok().getText()));
            mm.setHarga(Integer.valueOf(frame.getTxtHarga().getText()));
            mm.setId(Integer.valueOf(frame.getTxtId().getText()));
            
            implMenu.update(mm);
            JOptionPane.showMessageDialog(null, "Data diupdate");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal terupdate");
        }
    }
}
