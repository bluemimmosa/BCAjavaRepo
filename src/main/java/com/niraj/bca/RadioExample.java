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
import javax.swing.*;
public class RadioExample extends JFrame implements ActionListener{
    JRadioButton rbMale, rbFemale, rbOthers;
    ButtonGroup bgGender;
    JButton btnSubmit;
    
    RadioExample(){
        this.setTitle("Example RadioButton");
        this.setSize(400, 300);
        this.setLayout(null);
        
        rbMale = new JRadioButton("Male");
        rbMale.setBounds(10, 10, 100, 25);
        rbFemale = new JRadioButton("Female", true);
        rbFemale.setBounds(10, 45, 100, 25);
        rbOthers = new JRadioButton("Others");
        rbOthers.setBounds(10, 80, 100, 25);
        
        bgGender = new ButtonGroup();
        bgGender.add(rbMale);
        bgGender.add(rbFemale);
        bgGender.add(rbOthers);
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(10, 115, 100, 25);
        btnSubmit.addActionListener(this);
        
        this.add(rbMale);
        this.add(rbFemale);
        this.add(rbOthers);
        this.add(btnSubmit);
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new RadioExample();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(rbMale.isSelected()){
            System.out.println("You are Male.");
        } else if(rbFemale.isSelected()){
            System.out.println("You are Female.");
        }else{
            System.out.println("I am not sure about your Gender.");
        }
    }
}
