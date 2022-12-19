/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barca;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rgo19
 */
public class Pasajero{
    Pasajero(){
        
    }
  static class GenerarPasajeros extends Thread{
    private Barca b;
    public GenerarPasajeros(Barca _b){
        b = _b;
    }
    @Override
    public void run(){
        synchronized(b){
            Pasajero t;
            while(true){
                try {
                    t = new Pasajero();
                    b.Entrar_en_la_barca(t);
                    b.notifyAll();
                    this.sleep(1000);
                } catch (InterruptedException ex) {
                    
                }
            } 
        }
    }
}  
}

