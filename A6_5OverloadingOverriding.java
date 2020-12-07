package com.company;

class School{

    public void show(){
        System.out.println("You are in School ");
    }

}
class Class extends School{
    String name;
    int id;
    public void show(){
        System.out.println("You are in Class ");
    }
    public void student(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void student(String name){
        this.name=name;
    }
}

public class A6_5OverloadingOverriding {
    public static void main(String[] args){
        Class Ten=new Class();
//        Overriding
        Ten.show();
//        Overloading
        Ten.student("Name",1234);
        System.out.println("Name: "+Ten.name);
        System.out.println("id: "+Ten.id);
    }
}
