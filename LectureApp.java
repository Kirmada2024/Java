package com.mycompany.lectureapp;

public class LectureApp {

    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30, 40, 50};
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

        /*
    foreach loop
    for(variable : collection)
    {
        // statement
    }
         */
        for (int e : a) {
            System.out.println(e);
        }
    }
}
