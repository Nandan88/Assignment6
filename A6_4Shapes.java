package com.company;
import java.util.*;

abstract class Shapes{
    public abstract void getarea();
    public abstract void getvolume();
}

class Dimensions extends Shapes{
    public void getarea(){
        System.out.println("########--AREA--########");
        Scanner sc=new Scanner(System.in);
        double Asquare,Acircle,Acube,Asphere;
        System.out.print("Enter side of square: ");
        float l=sc.nextFloat();
        Asquare=l*l;
        System.out.println("Area of square is: "+Asquare);
        System.out.print("Enter radius of circle: ");
        float r=sc.nextFloat();
        Acircle=3.14*r*r;
        System.out.println("Area of circle is: "+Acircle);
    }
    public void getvolume(){
        Scanner sc=new Scanner(System.in);
        double Vcube,Vsphere;
        System.out.println("#########--VOLUME--#########");
        System.out.print("Enter side of cube: ");
        float l=sc.nextFloat();
        Vcube=l*l*l;
        System.out.println("Volume of cube: "+Vcube);
        System.out.print("Enter radius of sphere: ");
        float r=sc.nextFloat();
        Vsphere=4*3.14*r*r*r/3;
        System.out.println("Volume of sphere: "+Vsphere);
    }
}

public class A6_4Shapes {
    public static void main(String[] args){
    Dimensions d=new Dimensions();
    d.getarea();
    d.getvolume();
    }
}
