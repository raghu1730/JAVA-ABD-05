/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */

/* It is a mechanism which wapping the data(variables) and code(methods) together as single unit */
class Employee
{
    private int empno;
    private String name;
    private double salary;
    
    public int getempno()
    {
        return empno;
    }
    
    public String getname()
    {
        return name;
    }
    public double getsalary()
    {
        return salary;
    }
    public void setempno(int a)
    {
        empno=a;
    }
    public void setname(String b)
    {
        name=b;
    }
    public void setsalary(double c)
    {
        this.salary=c;
    }
}

public class Encapsulation {
    public static void main(String args[])
    {
        Employee emp1 = new Employee();
        emp1.setempno(52145);
        emp1.setname("John");
        emp1.setsalary(100000);
        System.out.println("Employee No:"+emp1.getempno()
  +"\tEmployee Name:"+emp1.getname()+"\tEmployee salary:"+emp1.getsalary());
        Employee emp2 = new Employee();
        emp2.setempno(65214);
        emp2.setname("David");
        emp2.setsalary(250000);
        System.out.println("Employee No:"+emp2.getempno()
  +"\tEmployee Name:"+emp2.getname()+"\tEmployee salary:"+emp2.getsalary());
    }
    
}
