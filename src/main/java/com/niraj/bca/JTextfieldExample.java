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
public class JTextfieldExample extends JFrame implements ActionListener{
    JLabel lblNum1, lblNum2, lblRes;
    JTextField txtNum1, txtNum2, txtRes;
    
    JTextfieldExample(){
        this.setTitle("Text Field Example");
        this.setSize(600, 400);
        lblNum1 = new JLabel("Num1:");
        lblNum1.setBounds(10, 10, 50, 25);
        this.add(lblNum1);
        
        lblNum2 = new JLabel("Num2:");
        lblNum2.setBounds(10, 40, 50, 25);
        this.add(lblNum2);
        
        lblRes = new JLabel("Res:");
        lblRes.setBounds(10, 70, 50, 25);
        this.add(lblRes);
        
        txtNum1 = new JTextField();
        txtNum1.setBounds(70, 10, 50, 25);
        this.add(txtNum1);
        
        txtNum2 = new JTextField();
        txtNum2.setBounds(70, 40, 50, 25);
        txtNum2.addActionListener(this);
        this.add(txtNum2);
        
        txtRes = new JTextField();
        txtRes.setBounds(70, 70, 50, 25);
        this.add(txtRes);
        
        this.setLayout(null);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new JTextfieldExample();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        int res = num1+num2;
        txtRes.setText(String.valueOf(res));
    }
}
