/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bca;

import javax.swing.*;

/**
 *
 * @author Niraj Khadka
 */
public class JLabelExample {
    JFrame fr;
    JLabel lblName, lblPassword;
    JTextField txtName, txtPassword;
    
    JLabelExample(){
        fr = new JFrame("JLabel Example");
        fr.setSize(600, 400);
        lblName = new JLabel("Name: ");
        lblName.setBounds(10, 10, 75, 25);
        fr.add(lblName);
        lblPassword = new JLabel("Password: ");
        lblPassword.setBounds(10, 45, 75, 25);
        fr.add(lblPassword);
        
        txtName = new JTextField();
        txtName.setBounds(100, 10, 150, 25);
        fr.add(txtName);
        
        txtPassword = new JTextField();
        txtPassword.setBounds(100, 45, 150, 25);
        fr.add(txtPassword);
        
        fr.setLayout(null);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        JLabelExample jle = new JLabelExample();
    }
}
