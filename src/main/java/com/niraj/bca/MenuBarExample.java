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
public class MenuBarExample extends JFrame {
    MenuBar mb;
    Menu fileMenu, aboutMenu;
    MenuItem newItm, open, help;
    
    MenuBarExample(){
        this.setTitle("Menu ko Example ho");
        this.setSize(600,400);
        mb = new MenuBar();
        fileMenu = new Menu("File");
        aboutMenu = new Menu("About");
        newItm = new MenuItem("New File");
        open = new MenuItem("Open File");
        help = new MenuItem("Help");
        
        fileMenu.add(newItm);
        fileMenu.add(open);
        aboutMenu.add(help);
        
        mb.add(fileMenu);
        mb.add(aboutMenu);
        
        this.setMenuBar(mb);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MenuBarExample();
    }
    
}
