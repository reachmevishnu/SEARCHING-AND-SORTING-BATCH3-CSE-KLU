package com.klu.cse;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        int[] arr={10,34,12,34,12,78,65,10};
        Set<Integer> a=new TreeSet<>();
        for(int i=0;i< arr.length;i++) {
            a.add(arr[i]);
        }
        System.out.println(a);
     }
}
