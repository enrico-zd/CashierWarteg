/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LOTUS COMPUTER
 */
public class ModTabelMenu extends AbstractTableModel{

    List<ModMenu> lmm;

    public ModTabelMenu(List<ModMenu> lmm) {
        this.lmm = lmm;
    }
    
    @Override
    public int getRowCount() {
        return lmm.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> lmm.get(row).getId();
            case 1 -> lmm.get(row).getNama();
            case 2 -> lmm.get(row).getStok();
            case 3 -> lmm.get(row).getHarga();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return switch(column){
            case 0 -> "Id";
            case 1 -> "Nama";
            case 2 -> "Stok";
            case 3 -> "Harga";
            default -> null;
        };
    }  
}
