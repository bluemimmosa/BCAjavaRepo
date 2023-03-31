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
public class ComboBoxExample extends JFrame implements ActionListener{
    JComboBox jcb;
    String items[] = {"Niraj", "Bishan", "Laxmi", "Prabin"};
    
    ComboBoxExample(){
        this.setTitle("Dropdown ko example");
        this.setSize(400, 200);
        this.setLayout(null);
        
        jcb = new JComboBox(items);
        jcb.setBounds(20, 40, 100, 25);
        jcb.addActionListener(this);
        this.add(jcb);
        
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("The selected item is "+jcb.getSelectedItem().toString());
    }
    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
