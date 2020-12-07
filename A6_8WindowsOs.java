package com.company;
class Os{
    public void performance(){
        System.out.println("You are checking Performance of Os!!");
    }
}
class Windows extends Os{
    public void performance(){
        System.out.println("You are checking Performance of Windows!!");
    }
}
public class A6_8WindowsOs {
    public static void main(String[] args) {
        Windows Ab = new Windows();
        Ab.performance();
        Os A=new Os();
        A.performance();
    }
}
