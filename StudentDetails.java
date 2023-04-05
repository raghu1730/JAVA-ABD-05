package com.mycompany.abd_05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class StudentDetails {
    
    public void addstudent(String name)
    {
       System.out.println("Student "+name+" is added to Database");
    }
    public static void main(String args[])
    {
        int student_id;
        String student_name, student_mobile, student_email, student_add;
        
        StudentDetails std = new StudentDetails();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the student name:");
        student_name=sc.nextLine();
        System.out.println("Enter the student Id:");
        student_id=sc.nextInt();
        System.out.println("Enter the student mobile no:");
        student_mobile=sc.next();
        System.out.println("Enter the student email id:");
        student_email=sc.next();
        System.out.println("Enter the student address:");
        student_add=sc.next();
        std.addstudent(student_name);
    }
}
