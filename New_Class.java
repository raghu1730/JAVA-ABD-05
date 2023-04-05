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
class Addnumber {   // 
    int sum=0;
    int mul=0;
    Addnumber(int x , int y)
    {
        sum= x+y;
        mul= x*y;
    }
}
public class New_Class
{
    public static void main(String args[])
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        num1=sc.nextInt();
        System.out.println("Enter the number 2:");
        num2=sc.nextInt();
        Addnumber a = new Addnumber(num1, num2);
        System.out.println("The sum of num:"+a.sum);
        System.out.println("The mul of num:"+a.mul);
    }
}