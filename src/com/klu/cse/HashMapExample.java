package com.klu.cse;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer,String> rollNames=new HashMap<>();
        rollNames.put(101,"Ajay");
        rollNames.put(103,"Balu");
        rollNames.put(104,"chaitanya");
        rollNames.put(105,"Rajini");
        for (Map.Entry<Integer,String> i:rollNames.entrySet()) {
            int key=i.getKey();
            String value=i.getValue();
            System.out.println(key+"---"+value);
        }

    }
}
