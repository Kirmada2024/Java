package com.mycompany.lecturenew.Lecture1404;

/*
    Constructor
    -> A special Method that was invoked automatically 
        when object creation
    -> Rules
    1. class name same as function name
    2. no return type
    3. can't call manully

    -> types of constructor
    1. single / default
    2. parameterize constructor
    3. copy constructor

 */
public class Lecture {

    public static void main(String[] args) {
        Demo d = new Demo("welcome");
        d.a = 890;
        Demo r = new Demo(d);
        
        System.out.println("r.a -> " + r.a);
    }
}

class Demo {

    int a;

    public Demo() {
        System.out.println("Constructor");
    }

    public Demo(int a) {
        System.out.println("int -> constructor");
    }

    public Demo(String s) {
        System.out.println("string -> constructor");
    }
    
    public Demo(Demo d)
    {
        System.out.println("copy constructor");
        a = d.a;
    }
}
