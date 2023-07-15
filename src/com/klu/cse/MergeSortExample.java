package com.klu.cse;

public class MergeSortExample {
    public static void merge(int[] arr,int low,int mid,int high)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        int[] a=new int[n1];
        int[] b=new int[n2];
        int i=low;
        for(int j=0;j<n1;j++)
        {
            a[j]=arr[i];
            i++;
        }
        for(int j=0;j<n2;j++)
        {
            b[j]=arr[i];
            i++;
        }
        int j=0,k=low;
        i=0;
        while(i<n1 && j<n2)
        {
            if(a[i]>=b[j])
            {
                arr[k]=a[i];
                i++;
            }
            else{
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=a[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
            k++;
            j++;
        }
    }
    public  static void mergeSort(int[] a,int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] a={35,45,10,78,45,12,50,23};
        int low=0;
        int high=a.length-1;
        mergeSort(a,low,high);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
