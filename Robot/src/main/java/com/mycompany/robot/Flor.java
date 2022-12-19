/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.robot;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Loki6
 */
public class Flor extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.MAGENTA); // N
		g.fillOval(75,15, 40, 40);
        
        g.setColor(Color.MAGENTA); // E
        g.fillOval(105, 45, 40, 40);
        
        g.setColor(Color.MAGENTA); // S
        g.fillOval(75, 75, 40, 40);
        
        g.setColor(Color.MAGENTA); // O
        g.fillOval(45, 45, 40, 40);
        
        //
        
        
		g.setColor(Color.GREEN);
        g.drawLine(95,150,95,50);
        
		g.setColor(Color.RED);
        g.fillRect(70, 150, 50, 50);
        
        g.setColor(Color.YELLOW);
        g.fillOval(70, 40, 50, 50);
		
        
	
    }

    // TODO overwrite start(), stop() and destroy() methods
}
