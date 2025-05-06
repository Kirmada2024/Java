
package com.mycompany.lectureapp;

public class Interitance {
    
    public static void main(String[] args) {
        B b = new B();
        b.test();
        b.abc();
    }
 
}

class A
{
    void test()
    {
        System.out.println("test function");
    }
}
class B extends A
{
    void abc()
    {
        System.out.println("abc function");
    }
}


/*
    1. single
    class A
    class B extends A

    2. Multilevel
    class A
    class B extends A
    class C extends B

    3. Hierarchical
    class A
    class B extends A
    class C extends A
*/