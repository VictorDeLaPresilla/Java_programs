/*
*@author De La Presilla Vega Vìctor Hugo
*/
package com.mycompany.casillas_de_verificacion;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class principal 
{
    public static void main(String[] args)
    {
        Frame Ventana = new Frame ();
        Ventana.setSize (1000,2000);
        Ventana.setTitle("Pizzeria ramoncito");
        Ventana.setVisible(true);
        Panel Hoja = new Panel(new FlowLayout());
        JFrame frame = new JFrame("Select Locations");
        JLabel Titulo = new JLabel();
        Titulo.setText("Pizzeria Ramoncito");
        Titulo.setBounds(30, 10, 400, 200);
    }
}
