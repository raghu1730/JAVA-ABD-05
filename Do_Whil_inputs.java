/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Do_Whil_inputs {
    
    public static void main(String args[])
    {
        Scanner myscan = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        do 
        {
            sum +=num;  // sum +=10 its  same as sum=sum+num
            System.out.println("Enter any number");
            num=myscan.nextInt();
            
        }
        while(num>0);
    }
}
