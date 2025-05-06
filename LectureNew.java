package com.mycompany.lecturenew;


import java.util.Scanner;

public class LectureNew{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,r = 0,n;
        System.out.print("Enter Value: ");
        a = sc.nextInt();
        
        while(a!=0)
        {
            n = a%10;
            r = r*10+n;
            a /= 10;
        }
        System.out.println("Reversed Number: " + r);
    }
}