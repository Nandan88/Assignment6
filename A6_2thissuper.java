package com.company;

class A1{
    int x,y;
    A1(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class B1 extends A1{
    int z;
    B1(int x,int y,int z){
        super(x,y);
        this.z=z;
    }
}
public class A6_2thissuper {
    public static void main(String[] args){
        B1 obj=new B1(1,2,3);
        System.out.println("x="+obj.x+" y="+obj.y+" z="+obj.z);
    }
}