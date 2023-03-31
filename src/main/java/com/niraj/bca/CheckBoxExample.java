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
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class CheckBoxExample implements ActionListener{
    JFrame frame;
    JCheckBox cb1, cb2, cb3;
    JLabel lblHobbies;
    JButton btnSubmit;
    ArrayList<String> arr;
    
    CheckBoxExample(){
        frame = new JFrame("Example");
        frame.setSize(600,400);
        frame.setLayout(null);
        
        lblHobbies = new JLabel("Hobbies:");
        lblHobbies.setBounds(10, 10, 100, 25);
        frame.add(lblHobbies);
        
        cb1 = new JCheckBox("Football");
        cb1.setBounds(15, 45, 100, 25);
        frame.add(cb1);
        
        cb2 = new JCheckBox("Gaming");
        cb2.setBounds(15, 80, 100, 25);
        frame.add(cb2);
        
        cb3 = new JCheckBox("Travelling");
        cb3.setBounds(15, 115, 100, 25);
        frame.add(cb3);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(10, 150, 100, 25);
        btnSubmit.addActionListener(this);
        frame.add(btnSubmit);
        
        arr = new ArrayList<String>();
        
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new CheckBoxExample();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(cb1.isSelected()){
            arr.add(cb1.getText());
        }
        if(cb2.isSelected()){
            arr.add(cb2.getText());
        }
        if(cb3.isSelected()){
            arr.add(cb3.getText());
        }
        
        System.out.println("All selected options: ");
        for(String a:arr){
            System.out.println(a);
        }
        
        arr.clear();
    }
}
