/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bca;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Niraj Khadka
 */
public class CardLayoutExample extends JFrame implements ActionListener{
    CardLayout cLayout;
    JButton b1, b2, b3, b4, b5;
    //Container containerPane;
    
    public CardLayoutExample(){
        cLayout = new CardLayout();
        this.setLayout(cLayout);
        
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        this.add(b1, "a");
        this.add(b2, "b");
        this.add("c", b3);
        this.add("d", b4);
        this.add("e", b5);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cLayout.next(this.getContentPane());
    }
    
    public static void main(String[] args) {
        CardLayoutExample cle = new CardLayoutExample();
        cle.setSize(400, 300);
        cle.setVisible(true);
    }
}
