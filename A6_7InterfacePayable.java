package com.company;

interface Payable{
    public void getamount();
}
class Employee1 implements Payable{
    String name;
    float salary;
    Employee1(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    public void getamount(){
        System.out.println("Salary of "+name+" is "+salary);
    }
}

public class A6_7InterfacePayable {
    public static void main(String[] args){
    Employee1 A=new Employee1("A",1000000);
    A.getamount();
    }
}
