/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bca;

/**
 *
 * @author Niraj Khadka
 */
import java.awt.*;
import javax.swing.*;
public class GraphicsExample extends JFrame {
    GraphicsExample(){
        this.setTitle("Drawing");
        this.setSize(500,500);
        this.setVisible(true);
        
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(40, 40, 50, 50);
    }
    public static void main(String[] args) {
        GraphicsExample ge = new GraphicsExample();
       
        
        
        //ge.repaint();
    }
}
