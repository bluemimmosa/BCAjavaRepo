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
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class Shapes extends JFrame{
    
    
    public Shapes(){
        this.setTitle("Shapes");
        this.setSize(600, 400);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(10, 10, 100, 100);
    }
    
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.drawthis(s.getGraphics());
        
    }
    public void drawthis(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(200, 200, 100, 100);
    }
}
