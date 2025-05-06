package com.mycompany.lectureapp.lec1804;

import java.util.Scanner;


//////////////  This  ////////////////////

public class thiskeyword {
    public static void main(String[] args) {
        Base1 b = new Base1();
        b.test(190);
        System.out.println(b.a);
    }
}
class Base1
{
    int a = 0;
    void test(int a)
    {
        this.a = a;
    }
}