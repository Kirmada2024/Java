package com.mycompany.lectureapp.lec1804;

import java.util.Scanner;

    //////////////  String  //////////////////

public class stringfunction {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sn.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(0));
        System.out.println(s.compareTo("cdmi"));
        System.out.println(s.compareToIgnoreCase("cdmi"));
        System.out.println(s.concat(" to you"));
        System.out.println(s.contains("cdmi"));
        System.out.println(s.endsWith("@gmail.com"));
        System.out.println(s.replace("h", "p"));
        System.out.println(s.substring(5,10));
          String[] arr = s.split(" ");
          for (String ss : arr) {
              System.out.println(ss);
            }
    }

}
