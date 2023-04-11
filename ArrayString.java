/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class ArrayString {
    
    public static void main(String args[])
    {
        String[] std = {"John","David","Ravi","Jack Son"};
        Arrays.sort(std);
        for(String i : std)
        {
            System.out.println(i);
        }
    }
    
}
