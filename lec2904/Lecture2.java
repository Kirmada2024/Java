package com.mycompany.lectureapp.lec2904;
 
public class Lecture2 {
    public static void main(String[] args)
    {
        
    }
}

interface Hello1
{
    void test();
    
    void cdmi();
}

interface Good
{
    void  abc();
}

class Demo implements Hello1, Good {

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cdmi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void abc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}