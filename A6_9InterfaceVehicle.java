package com.company;
interface Vehicle{
    public void getcolor();
    public void getnumber();
    public void getconsumption();
}
class TwoWheeler implements Vehicle{
    String name;
    String color;
    int number;
    float fuel;
    TwoWheeler(String name,String color,int number,float fuel){
        this.name=name;
        this.color=color;
        this.number=number;
        this.fuel=fuel;
    }
    public void getcolor(){
        System.out.println(name+" twowheeler color: "+ color);
    }
    public void getnumber(){
        System.out.println(name+" twowheeler number: "+ number);
    }
    public void getconsumption(){
        System.out.println(name+" twowheeler consumed: "+ fuel+"litre fuel");
    }
}
class FourWheeler implements Vehicle{
    String name;
    String color;
    int number;
    float fuel;
    FourWheeler(String name,String color,int number,float fuel){
        this.name=name;
        this.color=color;
        this.number=number;
        this.fuel=fuel;
    }
    public void getcolor(){
        System.out.println(name+" fourwheeler color: " +color);
    }
    public void getnumber(){
        System.out.println(name+" twowheeler number: "+number);
    }
    public void getconsumption(){
        System.out.println(name+" twowheeler consumed: "+fuel+"litre fuel");
    }
}
public class A6_9InterfaceVehicle {
    public static void main(String[] args){
        TwoWheeler RE=new TwoWheeler("ABCD","Blue",1234,201);
        RE.getcolor();
        RE.getconsumption();
        RE.getcolor();
        FourWheeler M=new FourWheeler("ABCD","White",1234,400);
        M.getcolor();
        M.getnumber();
        M.getnumber(); }
}
