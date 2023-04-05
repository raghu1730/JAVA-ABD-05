/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Studentinfo {
    public static void main(String args[])
    {
        int n, total=0, percentage;
        Scanner myscan= new Scanner(System.in);
        System.out.println("ENTER THE NO OF SUBJECTS");
        n=myscan.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter THE MARKS OUT OF 100");
        for(int i=0;i<n;i++)
        {
            marks[i]=myscan.nextInt();
            total=total+marks[i];
        }
        percentage = total/n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
        
    }
}
