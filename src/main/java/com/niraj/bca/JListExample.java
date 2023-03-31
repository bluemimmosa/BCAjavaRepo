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

import java.util.List;
import javax.swing.*;
import java.awt.event.*;
public class JListExample extends JFrame implements ActionListener{
    JList jl;
    JScrollPane jsp;
    String items[] = {"Niraj", "John", "Gagan", "Irosha"};
    JButton btn;
    JListExample(){
        this.setTitle("JList ko example");
        this.setSize(300, 250);
        this.setLayout(null);
        
        jl = new JList(items);
        jl.setBounds(20, 30, 100, 60);
        jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        jsp = new JScrollPane(jl);
        jsp.setBounds(20, 30, 100, 60);
        this.add(jsp);
        
        btn = new JButton("Submit");
        btn.setBounds(150, 45, 100, 25);
        btn.addActionListener(this);
        this.add(btn);
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new JListExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List los = jl.getSelectedValuesList();
        for(Object a: los.toArray()){
            System.out.println(a.toString());
        }
    }
}
