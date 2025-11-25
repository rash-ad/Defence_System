/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.defence_system;

/**
 *
 * @author Admin
 */

public interface DefenceObserver {
    public void getMessageMain(String message);
    public void areaClearLable(boolean clear);
    public void update(int position);
    public void updateButtons();
    
    
}

