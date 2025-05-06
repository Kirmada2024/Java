package com.mycompany.lecturenew;

import java.util.HashMap;

public class Lecture0904 {

    public static void main(String[] args) {
        /*
            array, arrayList -> position
            HashMap -> key-value pair
         */
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "cdmi");
        map.put("phone", "9033335009");
        map.put("location", "Surat");

//        System.out.println(map.containsKey("name"));
//        System.out.println(map.containsValue("cdmi"));
//        map.remove("cdmi");
        map.clear();
//        System.out.println(map.get("name"));
//        System.out.println(map.getOrDefault("na4me", "-"));
//        System.out.println(map);
//        System.out.println(map.values());
//        System.out.println(map.keySet());
        System.out.println(map.isEmpty());
//        System.out.println(map.size());
    

    }
}
