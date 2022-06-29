/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import model.ModMenu;

/**
 *
 * @author LOTUS COMPUTER
 */
public interface ImplementMenu {
    
    public void insert(ModMenu mm);
    public void delete(int id);
    public void update(ModMenu mm);
    public void updateStok(ModMenu mm);
    public List<ModMenu> getAll();
}
