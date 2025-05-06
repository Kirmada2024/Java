package com.mycompany.lectureapp.lec1804;

//////////////  Super  ////////////////////
public class superkeyword {
    public static void main(String[] args) {
        new Child2();
    }
}
class Base2
{
    int a = 10;
}
class Child2 extends Base2
{
    int a = 20;

    public Child2() {
        System.out.println(super.a);
    }
    
}
