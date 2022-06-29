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
import view.FormMenu;

/**
 *
 * @author LOTUS COMPUTER
 */
public class ControllerMenu {
    FormMenu frameMenu;
    ImplementMenu implMenu;
    List<ModMenu> lmm;

    public ControllerMenu(FormMenu frameMenu) {
        this.frameMenu = frameMenu;
        implMenu = new MenuDAO();
        lmm = implMenu.getAll();
    }
    
    public void isiTable(){
        lmm = implMenu.getAll();
        
        ModTabelMenu mtm = new ModTabelMenu(lmm);
        frameMenu.getTblMenu().setModel(mtm);
    }
    
    public void bayar(int row){
        int harga = lmm.get(row).getHarga();
        int uang = Integer.valueOf(frameMenu.getTxtUang().getText());
        int kembali = uang - harga;
        
        ModMenu mm = new ModMenu();
        mm.setId(lmm.get(row).getId());
        
        if(harga <= uang){
            implMenu.updateStok(mm);
            JOptionPane.showMessageDialog(null, "Terimakasih kembalian anda Rp." + kembali);
        } else{
            JOptionPane.showMessageDialog(null, "maaf, uang anda kurang");
        }
    }
}
