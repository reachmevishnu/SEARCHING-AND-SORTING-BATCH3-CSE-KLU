package com.klu.cse;

public class QuickSortExample {
    public static void quickSort(int[] a,int low,int high)
    {
        if(low<high)
        {
            int pIndex=partition(a,low,high);
            quickSort(a,low,pIndex-1);
            quickSort(a,pIndex+1,high);
        }
    }
    public static int partition(int[] a,int low,int high)
    {
        int pivot=a[high];
        int i=low-1;
        int temp=0;
        for(int j=low;j<high;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] a={35,45,23,78,45,12,50,23};
        int low=0;
        int high=a.length-1;
        quickSort(a,low,high);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
