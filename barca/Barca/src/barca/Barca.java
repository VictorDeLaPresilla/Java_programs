/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barca;


/**
 *
 * @author rgo19
 */
public class Barca {
    private Pasajero p[];
    private int c_pasajeros;
    public Barca(){
        this.p = new Pasajero[3];
        c_pasajeros = 0;
    }

    public synchronized void Entrar_en_la_barca(Pasajero t){
        try {
            this.wait(100);
            if(c_pasajeros<3){
                System.out.println("Se ha subido un pasajero");
                p[c_pasajeros] = t;
                c_pasajeros++;
            }else{
                
                System.out.println("La barca ha partido");
                pasear();
                Salir_de_barca();
                System.out.println("La barca esta disponible");
                this.wait(400);
                System.out.println("Se ha subido un pasajero");
                p[c_pasajeros] = t;
                c_pasajeros++;
                this.notifyAll();
            }
        } catch (InterruptedException ex) {

        }
    }
    public synchronized void pasear(){
        
        try {
            
            Thread.sleep(1500);
            
        } catch (InterruptedException ex) {
            
        }
        
    }
    public synchronized void Salir_de_barca(){
        c_pasajeros = 0;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Barca b = new Barca();
        Pasajero.GenerarPasajeros gen = new Pasajero.GenerarPasajeros(b);
        gen.run();
    }
    
}
