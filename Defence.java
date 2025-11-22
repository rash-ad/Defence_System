/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.defence_system;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */


 interface DefenceControllerInterface {
    
    public void updateButtons();
    public void getMessageMain(String message);
    public void areaClear(boolean clear);
    public void setPosition(int position);
    
    
    
        
}

class DefenceObservable implements DefenceControllerInterface{
   int position;

   private ArrayList<DefenceObserver>observerList=new ArrayList<>();
   public void addDefenceObserver(DefenceObserver defenceOb){
       observerList.add(defenceOb);
   }
    @Override
    public void updateButtons() {
        
      
  }

    
    @Override
    public void getMessageMain(String message) {
        for (DefenceObserver defenceObserver : observerList) {
            defenceObserver.getMessageMain(message);
        }
    }

    @Override
    public void areaClear(boolean clear) {
        for (DefenceObserver defenceObserver : observerList) {
            defenceObserver.areaClearLable(clear);
            
        }
    }

    @Override
    public void setPosition(int position) {
        if(this.position!=position){
            this.position=position;
            notifyDefence();
            
            
        }
    }

    private void notifyDefence() {
        for (DefenceObserver defenceObserver : observerList) {
            defenceObserver.update(position);
            updateButtons();
            
            
        }
    }

    
    
}


public class Defence{
    public static void main(String[] args) {
        DefenceObservable defenceObservable=new DefenceObservable();
        defenceObservable.addDefenceObserver(new Helicopter());
        defenceObservable.addDefenceObserver(new Tank());
        defenceObservable.addDefenceObserver(new Submarine());
        new MainController(defenceObservable).setVisible(true);
        
    }
}

