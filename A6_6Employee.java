package com.company;

abstract class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
    public abstract void getamount();
}

class HourlyEmployee extends Employee{
    float wage,hours;  //wage: wage per hour, hours: number pf hours
    HourlyEmployee(String name,float wage,float hours){
        super(name);
        this.wage=wage;
        this.hours=hours;
    }
    public void getamount(){
        System.out.println("The total amount paid is: "+wage*hours);
    }
}

class WeeklyEmployee extends Employee{
    float wage,weeks; //wage: wage per week, weeks: number of weeks
    WeeklyEmployee(String name,float wage,float weeks){
        super(name);
        this.wage=wage;
        this.weeks=weeks;
    }
    public void getamount(){
        System.out.println("The total amount paid is: "+wage*weeks);
    }
}
public class A6_6Employee {
    public static void main(String[] args){
        WeeklyEmployee A=new WeeklyEmployee("A",20000,9);
        HourlyEmployee B=new HourlyEmployee("B",100,70);
        A.getamount();
        B.getamount();
    }
}
