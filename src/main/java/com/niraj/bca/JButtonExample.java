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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JButtonExample implements ActionListener{
    JFrame jf;
    JButton btn1, btn2;
    JToggleButton btn3;
    
    JButtonExample(){
        jf = new JFrame("Niraj window");
        jf.setSize(600, 400);
        jf.setLayout(null);
        
        btn1 = new JButton("Button 1");
        btn1.setBounds(10, 10, 100, 25);
        btn1.addActionListener(this);
        jf.add(btn1);
        btn2 = new JButton("Button 2");
        btn2.setBounds(120, 10, 100, 25);
        btn2.addActionListener(this);
        jf.add(btn2);
        
        btn3 = new JToggleButton("Button 3");
        btn3.setBounds(10, 40, 100, 25);
        jf.add(btn3);
        
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        new JButtonExample();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(btn3.isSelected()){
            System.out.println("Button 3 is pressed!");
        }else{
            System.out.println("Button 3 is not pressed!");
        }
        if(e.getSource().equals(btn1)){
            System.out.println("Button 1 is pressed");
        }else{
           System.out.println("Button 2 is pressed");     
        }
    }
}
