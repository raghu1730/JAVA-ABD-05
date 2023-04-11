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
public class ArraySort {
    public static void main(String args[])
    {
        String[] countries = {"USA","Malaysia","Australia","Lundon","China","Japan","India"};
        Arrays.sort(countries);
        for(int i=0; i<countries.length; i++)
        {
            System.out.println(countries[i]);
        }

    }
    
}
