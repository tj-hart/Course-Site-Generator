/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csg.workspace;

import jtps.jTPS_Transaction;
import csg.data.TAData;

/**
 *
 * @author moham_000
 */
public class addTATr implements jTPS_Transaction{
TAData ta;
String email;
String name;
boolean ug;
    addTATr(String name,String email, TAData data){
       ta=data;
       this.email=email;
       this.name=name;
       this.ug = false;
    }
    @Override
    public void doTransaction() {     
      ta.addTA(name, email, ug);
    }

    @Override
    public void undoTransaction() {
     ta.removeTA(name);
    }
    
}
