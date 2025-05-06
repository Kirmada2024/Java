package com.mycompany.lectureapp.lec2804;

public class Lecture2804 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(" welcome ");
        sb.append(158.6f);

        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.charAt(5));
        System.out.println(sb.codePointAt(2));
        System.out.println(sb.indexOf("w"));
        System.out.println(sb.delete(1, 5));
        System.out.println(sb.insert(0, " CDMI"));
        System.out.println(sb.repeat(" GOOD ", 2));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 6, " 132 "));

    }

}
