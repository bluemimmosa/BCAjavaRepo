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
import java.awt.*;
public class FlowLayoutExample {
    JFrame f;
    JButton b1, b2, b3, b4;
    
    public FlowLayoutExample(){
        f = new JFrame("Flow Layout Example");
        f.setSize(300,200);
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
