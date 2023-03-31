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
public class TableExample extends JFrame{
    JScrollPane jsp;
    JTable tbl;
    String data[][] = {{"1", "Niraj", "Indrayani"},
                    {"2", "Bishan", "Lainchaur"},
                    {"3", "Ram", "Kirtipur"},
                    {"4", "Laxmi", "Bhaktapur"}
                    };
    
    String heading[] = {"Sno.", "Name", "Address"};
    
    TableExample(){
        this.setTitle("Table ko Example deko dekhinas.");
        this.setSize(600,400);
        this.setLayout(null);
        
        tbl = new JTable(data, heading);
        tbl.setBounds(20, 20, 450, 50);
        jsp = new JScrollPane(tbl);
        jsp.setSize(500,75);
        this.add(jsp);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TableExample();
    }
}
