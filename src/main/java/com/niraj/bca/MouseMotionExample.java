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
import java.awt.event.*;
import javax.swing.*;

public class MouseMotionExample implements MouseMotionListener {
    JFrame f = new JFrame("MouseMotionEvent");
    
MouseMotionExample(){

f.addMouseMotionListener(this);
//
f.setLayout(null);
f.setSize(400,400);
//f.setDefaultCloseOperation(dispose());
f.setVisible(true);
}
    @Override
    public void mouseDragged(MouseEvent e){
        Graphics g = f.getGraphics();
        g.setColor(Color.blue);
        g.fillOval(e.getX(), e.getY(), 10, 10);
}
    @Override
    public void mouseMoved(MouseEvent e){
}
public static void main(String[] args){
    new MouseMotionExample();
}
}
