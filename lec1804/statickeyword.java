package com.mycompany.lectureapp.lec1804;

import java.util.Scanner;

//////////////  static  //////////////////

public class statickeyword {

    public static void main(String[] args) {
//        Base b = new Base();
//        System.out.println(b.a);
        System.out.println(Base3.a);
    }
}
class Base3 {
    static int a = 10;
    void test() {
    }
    int aa = 1230;
}