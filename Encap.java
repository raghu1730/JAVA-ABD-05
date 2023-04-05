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
class Person
{
    private int age;
    private String std_name;
    
    public String getstd_name()
    {
        return std_name;
    }
    
    public void setstd_name(String std_name)
    {
        this.std_name=std_name;      // this is a key word
    }
    public int getAge()  // getter metho to ready-only
    {
        return age;
    }
    
    public void setAge(int age)  //setter metho to write-only
    {
        this.age=age;   // this is a keyboard
    }
}
 class Encap {
     public static void main(String args[]){
         int a;
         String b;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the age of person:");
         a=sc.nextInt();
         System.out.println("Enter the name of person:");
         b=sc.next();
        
         Person per = new Person();
         
         per.setAge(a);
         per.setstd_name(b);
         
         System.out.println("The age of person is:" +per.getAge());
         System.out.println("The name of person is:" +per.getstd_name());
     }
    
}
