/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
import java.io.*;
class Country
{
    int population;
    String name;
    
    Country(int population, String name)
    {
        System.out.println(population);
        System.out.println(name);
    }
}
public class ConstructorIllu {
    
    public static void main(String args[])
    {
        Country ck = new Country(100000, "China");
        
           
    }
    
}
