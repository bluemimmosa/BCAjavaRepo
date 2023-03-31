/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bca;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

/**
 *
 * @author Niraj Khadka
 */
public class GridBagLayoutExample extends JFrame{
    GridBagLayout gbl;
    GridBagConstraints gbc;
    
    
     GridBagLayoutExample(){
        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        
        this.setTitle("GridBag");
        this.setLayout(gbl);
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        Insets ins = new Insets(10,10,10,10);
        gbc.insets = ins;
        JButton b1 = new JButton("Button 1");
        this.add(b1, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(new JButton("Button 2"), gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(new JButton("Button 3"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new JTextField(), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        this.add(new JButton("Master Button"), gbc);
        
        this.setSize(400, 400);
        this.setVisible(true);
        
        
        
    }
    
    public static void main(String[] args){
        new GridBagLayoutExample();
    }
}
