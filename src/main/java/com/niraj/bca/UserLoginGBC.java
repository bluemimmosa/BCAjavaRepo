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
import java.awt.*;
import javax.swing.*;
public class UserLoginGBC extends JFrame{
    GridBagLayout gbl;
    GridBagConstraints gbc;
    JLabel lbluName, lblPassword;
    JTextField txtuName, txtPassword;
    JButton btnLogin, btnCancel;
    
    UserLoginGBC(){
        this.setTitle("Hello");
        this.setSize(500, 300);
        gbl = new GridBagLayout();
        this.setLayout(gbl);
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        lbluName = new JLabel("UserName: ");
        gbl.setConstraints(lbluName, gbc);
        this.add(lbluName, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        txtuName = new JTextField();
        gbl.setConstraints(txtuName, gbc);
        this.add(txtuName, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        lblPassword = new JLabel("Password: ");
        gbl.setConstraints(lblPassword, gbc);
        this.add(lblPassword, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        txtPassword = new JTextField();
        gbl.setConstraints(txtPassword, gbc);
        this.add(txtPassword, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        btnLogin = new JButton("Login");
        gbl.setConstraints(btnLogin, gbc);
        this.add(btnLogin, gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 2;
        btnCancel = new JButton("Cancel");
        gbl.setConstraints(btnCancel, gbc);
        this.add(btnCancel, gbc);
        
        
        this.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new UserLoginGBC();
    }
}
