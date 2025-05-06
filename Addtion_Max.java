package com.mycompany.lecturenew;

import java.util.Scanner;

public class Addtion_Max {

    public static void main(String[]args){
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0; i<size; i++){
            int max = a[0];
            b += a[i];
            System.out.println("a [" + i +"]" + a[i] );
            
            if(max<a[i])
            {
                max = a[i];
                System.out.print("Max Value: " + max);
            }
        }
        System.out.print("Total= " +b);
    }
}
