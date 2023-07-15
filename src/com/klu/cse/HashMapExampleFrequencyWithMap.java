package com.klu.cse;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleFrequencyWithMap {
    public static void main(String[] args) {
        int a[]={61,51,71,61,61,51,51,21};
        HashMap<Integer,Integer> frequency=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(frequency.containsKey(a[i]))
            {
                frequency.put(a[i],frequency.get(a[i])+1);
            }
            else{
                frequency.put(a[i],1);
            }
        }
        int maxvalue=Integer.MIN_VALUE;
        int maxKey=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> i:frequency.entrySet()) {
            int key=i.getKey();
            int value=i.getValue();
            if(maxvalue<=value)
            {
                maxvalue=value;
                if(maxKey<key)
                {
                    maxKey=key;
                }
            }

        }
        System.out.println("Max key="+maxKey);
        System.out.println("Max Value="+maxvalue);

    }
}
