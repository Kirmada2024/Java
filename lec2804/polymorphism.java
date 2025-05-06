package com.mycompany.lectureapp.lec2804;

public class polymorphism {

    public static void main(String[] args) {

        Base2804 b = new Base2804();
        b.test(158f);
        
        
        Child2804 c = new Child2804();
        c.abc();
    }

}

class Base2804 {

    public void test() {
        System.out.println("test function");
    }

    public void test(int a) {
        System.out.println("int test function");
    }

    public void test(float a) {
        System.out.println("float test function");
    }

    public void abc() {
        System.out.println("base abc function");
    }

}

class Child2804 extends Base2804 {

    @Override
    public void abc() {
        super.abc();
        System.out.println("child abc function");
    }

}

/*
    Polymorphism
    1. Compile-time (function overloading)
    2. Run-time (function overriding)
 */
