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
public class StudentForm extends JFrame{
    JButton btn1;
    EHOuterClass ehc;
    
    StudentForm(){
        this.setTitle("Student Form");
        this.setSize(500,200);
        btn1 = new JButton("Click me!");
        btn1.setBounds(20, 20, 150, 25);
        ehc = new EHOuterClass();
        btn1.addActionListener(ehc);
        this.add(btn1);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new StudentForm();
    }
}
