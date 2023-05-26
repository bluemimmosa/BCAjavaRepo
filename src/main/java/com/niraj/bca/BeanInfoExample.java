/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bca;

import java.beans.*;

public class BeanInfoExample {
    public static void main(String[] args) {
        StudentBean std = new StudentBean();
        std.setRollNo(5);
        std.setName("Niraj");
        try{
            BeanInfo bi = Introspector.getBeanInfo(std.getClass());
            MethodDescriptor[] md = bi.getMethodDescriptors();
            PropertyDescriptor[] pd = bi.getPropertyDescriptors();
            
            System.out.println("Bean info: "+bi.toString());
            
            for(PropertyDescriptor p: pd){
                System.out.println(p.getName());
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
