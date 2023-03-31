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
public class MouseEventExample extends JFrame implements MouseListener{
    
    MouseEventExample(){
        this.setTitle("Mouse Event");
        this.setSize(400, 300);
        this.addMouseListener(this);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MouseEventExample();
    }
    
    @Override
    public void mouseEntered(MouseEvent me){
        //System.out.println("Mouse Entered the Frame");
    }
    
    @Override
    public void mouseExited(MouseEvent me){
        //System.out.println("Mouse Exited from the Frame");
    }
    
    @Override
    public void mousePressed(MouseEvent me){
       // System.out.println("Mouse is Pressed!");
    }
    
    @Override
    public void mouseReleased(MouseEvent me){
        //System.out.println("Mouse is released.");
    }
    
    @Override
    public void mouseClicked(MouseEvent me){
        int button = me.getButton();
        if(button == MouseEvent.BUTTON1){
            System.out.println("Left button is clicked");
        }else if(button == MouseEvent.BUTTON2){
            System.out.println("Middle Button is clicked.");
        }
        else if(button == MouseEvent.BUTTON3){
            System.out.println("Right button is clicked.");
        }else{
            System.out.println("no button is clicked.");
        }
        
    }   
}
