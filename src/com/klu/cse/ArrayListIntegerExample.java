package com.klu.cse;

import java.util.ArrayList;

public class ArrayListIntegerExample {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(50);
        a.add(45);
        a.add(10);
        a.add(25);
        a.add(10);
        while(a.contains(10)) {
            a.remove(a.indexOf(10));
        }
        for (Integer i:a) {
            System.out.print(i+" ");
        }
    }
}
