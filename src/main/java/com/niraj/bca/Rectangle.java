/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bca;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
public class Rectangle extends JFrame{
    public Rectangle(){
        this.setTitle("Shapes");
        this.setSize(600, 400);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(50, 50, 100, 200);
    }
    
    public void drawCircle(Graphics g, int r){
        g.setColor(Color.BLUE);
        g.drawOval(200, 200, r, r);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.drawCircle(r.getGraphics(), 70);
    }
}
