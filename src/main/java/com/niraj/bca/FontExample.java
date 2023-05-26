/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bca;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
public class FontExample extends JFrame{
    JLabel lbl;
    public FontExample(){
        this.setTitle("Hwllo");
        this.setSize(600, 400);
        Font f = new Font("TimesRoman",Font.BOLD,32);
        lbl = new JLabel("Hello");
        lbl.setFont(f);
        this.add(lbl);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        FontExample fe = new FontExample();
    }
}
