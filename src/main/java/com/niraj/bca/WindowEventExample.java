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
public class WindowEventExample extends JFrame implements WindowListener{
    WindowEventExample(){
        this.setTitle("Window event example");
        this.setSize(500, 300);
        this.addWindowListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new WindowEventExample();
    }
    
    @Override
    public void windowOpened(WindowEvent we){
        System.out.println("Window has been opened!");
    }
    
    @Override
    public void windowClosed(WindowEvent we){
        
    }
    
    @Override
    public void windowClosing(WindowEvent we){
        System.out.println("Window is being closed!");
    }
    
    @Override
    public void windowIconified(WindowEvent we){
        
    }
    
    @Override
    public void windowDeiconified(WindowEvent we){
        
    }
    
    @Override
    public void windowActivated(WindowEvent we){
        
    }
    
    @Override
    public void windowDeactivated(WindowEvent we){
        
    }
}
