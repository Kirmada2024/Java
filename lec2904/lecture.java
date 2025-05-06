package com.mycompany.lectureapp.lec2904;

/*
    Abstraction
 */

public class lecture {

    public static void main(String[] args) {
        Hello b = new Hello();
        b.test();
        b.cdmi();
    }
}

abstract class Base {
    abstract void test();
    
    void cdmi()
    {
        System.out.println("cdmi function");
    }
}

class Hello extends Base
{
    @Override
    void test() {
        System.out.println("test function");
    }
}
