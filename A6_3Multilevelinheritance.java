package com.company;
class Father{
    int apple=2;
    String Hobby="Singing";
}
class Son extends Father{
    int apple=3;
    String Sport="Football";

}
class Grand_Son extends Son{
    int apple=4;
    String Food="Pizza";
}

public class A6_3Multilevelinheritance {
    public static void main(String[] args){
        Grand_Son abc=new Grand_Son();
        System.out.println(abc.apple);
        System.out.println(abc.Hobby);
        System.out.println(abc.Sport);
        System.out.println(abc.Food);
    }
}