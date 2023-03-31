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
public class TabbedPaneExample {
    JFrame fr;
    JPanel p1, p2, p3;
    JTabbedPane jtp;
    JButton btn1, btn2, btn3;
    
    TabbedPaneExample(){
        fr = new JFrame("TabbedPane Example");
        fr.setSize(600,400);
        fr.setLayout(null);
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        
        p1.add(btn1);
        p2.add(btn2);
        p3.add(btn3);
        
        jtp = new JTabbedPane();
        jtp.setSize(500, 300);
        jtp.add("Home", p1);
        jtp.add("Student", p2);
        jtp.add("Teacher", p3);
        fr.add(jtp);
        
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
