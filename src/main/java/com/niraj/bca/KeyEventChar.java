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
import javax.swing.*;
import java.awt.event.*;
public class KeyEventChar extends JFrame implements KeyListener {

    KeyEventChar(){
        this.setTitle("KeyEVentExample");
        this.setSize(400,300);
        this.addKeyListener(this);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        char key = e.getKeyChar();
        System.out.println("The key typed is: "+ key);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    public static void main(String[] args) {
        new KeyEventChar();
    }
    
}
