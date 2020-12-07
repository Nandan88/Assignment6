package com.company;

class A{
    public void methodA(){
        System.out.println("You are in Base class");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("You are in Child Class");
        methodA();
    }
}

public class A6_1ReuseProperty {
    public static void main(String[] args){
        B obj=new B();
        obj.methodB();
    }
}
