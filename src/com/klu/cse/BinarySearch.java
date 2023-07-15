package com.klu.cse;

public class BinarySearch {
    public static int search(int[] a,int target)
    {
        int low=0;
        int high=a.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==target)
            {
                return mid;
            }else if(a[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={10,12,23,32,45,56,89};
        int idx=search(a,12);
        if(idx==-1)
        {
            System.out.println("element is not found");
        }else{
            System.out.println("element is found at index "+idx);
        }
    }
}
